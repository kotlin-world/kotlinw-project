package kotlinw.lib.time

import kotlinx.serialization.*
import kotlinx.serialization.internal.SerialClassDescImpl

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
    override val descriptor = object : SerialClassDescImpl("LocalDate") {
        init {
            addElement("year")
            addElement("monthValue")
            addElement("dayOfMonth")
        }
    }

    override fun serialize(encoder: Encoder, obj: LocalDate) {
        with(encoder.beginStructure(descriptor)) {
            encodeIntElement(descriptor, 0, obj.year)
            encodeIntElement(descriptor, 1, obj.monthValue)
            encodeIntElement(descriptor, 2, obj.dayOfMonth)
            endStructure(descriptor)
        }
    }

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
