package kotlinw.lib.time

import kotlinx.serialization.*
import kotlinx.serialization.internal.IntDescriptor

//
// Year
//

expect class Year : Comparable<Year>

expect val Year.value: Int
expect val Year.isLeap: Boolean

//
// Years
//

object Years

fun Years.now(): Year = Years.of(LocalDates.now().year)

expect fun Years.of(isoYear: Int): Year

@Suppress("unused")
fun Years.isLeap(isoYear: Int) = Years.of(isoYear).isLeap

//
// Serializer
//

@Serializer(forClass = Year::class)
object YearSerializer : KSerializer<Year> {
    override val descriptor = IntDescriptor.withName("value")

    override fun serialize(encoder: Encoder, obj: Year) {
        encoder.encodeInt(obj.value)
    }

    override fun deserialize(decoder: Decoder): Year {
        return Years.of(decoder.decodeInt())
    }
}
