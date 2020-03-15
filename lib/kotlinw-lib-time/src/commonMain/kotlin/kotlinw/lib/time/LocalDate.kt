package kotlinw.lib.time

import kotlinx.serialization.*

//
// LocalDate
//

expect interface ChronoLocalDate : Comparable<ChronoLocalDate>

expect class LocalDate : ChronoLocalDate

expect val LocalDate.year: Int

expect val LocalDate.monthValue: Int

expect val LocalDate.month: Month

expect val LocalDate.dayOfMonth: Int

//
// LocalDates
//

object LocalDates

expect fun LocalDates.now(): LocalDate

expect fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int): LocalDate

//
// Serializer
//

@Serializer(forClass = LocalDate::class)
object LocalDateSerializer : KSerializer<LocalDate> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("LocalDate") {
        element<Int>("year")
        element<Int>("monthValue")
        element<Int>("dayOfMonth")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: LocalDate) {
        with(encoder.beginStructure(descriptor)) {
            encodeIntElement(descriptor, 0, value.year)
            encodeIntElement(descriptor, 1, value.monthValue)
            encodeIntElement(descriptor, 2, value.dayOfMonth)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): LocalDate =
            with(decoder.beginStructure(descriptor)) {
                var year: Int? = null
                var monthValue: Int? = null
                var dayOfMonth: Int? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> year = decodeIntElement(descriptor, i)
                        1 -> monthValue = decodeIntElement(descriptor, i)
                        2 -> dayOfMonth = decodeIntElement(descriptor, i)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                LocalDates.of(
                        year ?: throw MissingFieldException("year"),
                        monthValue ?: throw MissingFieldException("monthValue"),
                        dayOfMonth ?: throw MissingFieldException("dayOfMonth")
                )
            }
}

//
// Conversions
//

fun LocalDate.toYearMonth() = YearMonths.of(year, monthValue)

//
// Operations
//

expect fun LocalDate.plusYears(years: Int): LocalDate

expect fun LocalDate.plusMonths(months: Int): LocalDate

expect fun LocalDate.plusDays(days: Int): LocalDate

fun LocalDate.minusYears(years: Int): LocalDate = plusYears(-years)

fun LocalDate.minusMonths(months: Int): LocalDate = plusMonths(-months)

fun LocalDate.minusDays(days: Int): LocalDate = plusDays(-days)

//@ExperimentalTime
//expect operator fun LocalDate.plus(duration: Duration): LocalDateTime
