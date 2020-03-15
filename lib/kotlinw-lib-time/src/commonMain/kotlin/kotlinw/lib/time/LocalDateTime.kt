package kotlinw.lib.time

import kotlinx.serialization.*

//
// LocalDateTime
//

expect interface ChronoLocalDateTime<D : ChronoLocalDate> : Comparable<ChronoLocalDateTime<*>>

expect class LocalDateTime : ChronoLocalDateTime<LocalDate>

expect val LocalDateTime.date: LocalDate

expect val LocalDateTime.time: LocalTime

expect val LocalDateTime.year: Int

expect val LocalDateTime.monthValue: Int

expect val LocalDateTime.dayOfMonth: Int

expect val LocalDateTime.hour: Int

expect val LocalDateTime.minute: Int

expect val LocalDateTime.second: Int

expect val LocalDateTime.nanoOfSecond: Int

//
// LocalDateTime
//

object LocalDateTimes

expect fun LocalDateTimes.now(): LocalDateTime

expect fun LocalDateTimes.of(date: LocalDate, time: LocalTime): LocalDateTime

expect fun LocalDateTimes.of(year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0): LocalDateTime

//
// Serializer
//

@Serializer(forClass = LocalDateTime::class)
object LocalDateTimeSerializer : KSerializer<LocalDateTime> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("LocalDateTime") {
        element<LocalDate>("date")
        element<LocalTime>("time")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: LocalDateTime) {
        with(encoder.beginStructure(descriptor)) {
            encodeSerializableElement(descriptor, 0, LocalDateSerializer, value.date)
            encodeSerializableElement(descriptor, 1, LocalTimeSerializer, value.time)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): LocalDateTime =
            with(decoder.beginStructure(descriptor)) {
                var date: LocalDate? = null
                var time: LocalTime? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> date = decodeSerializableElement(descriptor, i, LocalDateSerializer)
                        1 -> time = decodeSerializableElement(descriptor, i, LocalTimeSerializer)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                LocalDateTimes.of(
                        date ?: throw MissingFieldException("year"),
                        time ?: throw MissingFieldException("monthValue")
                )
            }
}

//
// Conversions
//

fun LocalDateTime.toInstant(zone: ZoneId) = toZonedDateTime(zone).toInstant()

fun LocalDateTime.toYear() = Years.of(year)

fun LocalDateTime.toYearMonth() = YearMonths.of(year, monthValue)

expect fun LocalDateTime.toZonedDateTime(zone: ZoneId): ZonedDateTime
