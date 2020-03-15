package kotlinw.lib.time

import kotlinx.serialization.*

//
// YearMonth
//

expect class YearMonth : Comparable<YearMonth>

expect val YearMonth.year: Int
expect val YearMonth.monthValue: Int

val YearMonth.month: Month get() = Months.of(monthValue)

//
// YearMonths
//

object YearMonths

fun YearMonths.now(): YearMonth = LocalDates.now().toYearMonth()

expect fun YearMonths.of(year: Int, monthValue: Int): YearMonth

@Suppress("unused")
fun YearMonths.of(year: Int, month: Month): YearMonth = YearMonths.of(year, month.value)

//
// Serializer
//

@Serializer(forClass = YearMonth::class)
object YearMonthSerializer : KSerializer<YearMonth> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("YearMonth") {
        element<Int>("year")
        element<Int>("monthValue")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: YearMonth) {
        with(encoder.beginStructure(descriptor)) {
            encodeIntElement(descriptor, 0, value.year)
            encodeIntElement(descriptor, 1, value.monthValue)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): YearMonth =
            with(decoder.beginStructure(descriptor)) {
                var year: Int? = null
                var monthValue: Int? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> year = decodeIntElement(descriptor, i)
                        1 -> monthValue = decodeIntElement(descriptor, i)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                YearMonths.of(
                        year ?: throw MissingFieldException("year"),
                        monthValue ?: throw MissingFieldException("monthValue")
                )
            }
}
