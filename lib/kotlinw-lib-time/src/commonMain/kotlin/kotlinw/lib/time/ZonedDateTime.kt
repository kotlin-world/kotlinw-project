package kotlinw.lib.time

import kotlinx.serialization.*

//
// ZonedDateTime
//

expect interface ChronoZonedDateTime<D : ChronoLocalDate> : Comparable<ChronoZonedDateTime<*>>

expect class ZonedDateTime : ChronoZonedDateTime<LocalDate>

expect val ZonedDateTime.localDateTime: LocalDateTime

expect val ZonedDateTime.zone: ZoneId

expect val ZonedDateTime.year: Int

expect val ZonedDateTime.monthValue: Int

expect val ZonedDateTime.dayOfMonth: Int

expect val ZonedDateTime.hour: Int

expect val ZonedDateTime.minute: Int

expect val ZonedDateTime.second: Int

expect val ZonedDateTime.nanoOfSecond: Int

expect fun ZonedDateTime.withZoneSameLocal(zone: ZoneId): ZonedDateTime

//
// ZonedDateTimes
//

object ZonedDateTimes

expect fun ZonedDateTimes.now(): ZonedDateTime

expect fun ZonedDateTimes.now(zone: ZoneId): ZonedDateTime

expect fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime

fun ZonedDateTimes.of(zone: ZoneId, year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0) =
        ZonedDateTimes.of(zone, LocalDateTimes.of(year, monthValue, dayOfMonth, hour, minute, second, nanoOfSecond))

//
// Serializer
//

@Serializer(forClass = ZonedDateTime::class)
object ZonedDateTimeSerializer : KSerializer<ZonedDateTime> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("ZonedDateTime") {
        element<ZoneId>("zone")
        element<LocalDateTime>("localDateTime")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: ZonedDateTime) {
        with(encoder.beginStructure(descriptor)) {
            encodeSerializableElement(descriptor, 0, ZoneIdSerializer, value.zone)
            encodeSerializableElement(descriptor, 1, LocalDateTimeSerializer, value.localDateTime)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): ZonedDateTime =
            with(decoder.beginStructure(descriptor)) {
                var zone: ZoneId? = null
                var localDateTime: LocalDateTime? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> zone = decodeSerializableElement(descriptor, i, ZoneIdSerializer)
                        1 -> localDateTime = decodeSerializableElement(descriptor, i, LocalDateTimeSerializer)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                ZonedDateTimes.of(
                        zone ?: throw MissingFieldException("zone"),
                        localDateTime ?: throw MissingFieldException("localDateTime")
                )
            }
}

//
// Conversions
//

expect fun ZonedDateTime.toInstant(): Instant

fun ZonedDateTime.toLocalDateTime() = localDateTime
