package kotlinw.lib.time

import kotlinx.serialization.*

//
// LocalTime
//

expect class LocalTime : Comparable<LocalTime>

expect val LocalTime.hour: Int

expect val LocalTime.minute: Int

expect val LocalTime.second: Int

expect val LocalTime.nanoOfSecond: Int

//
// LocalTimes
//

object LocalTimes

expect fun LocalTimes.of(hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0): LocalTime

//
// Serializer
//

@Serializer(forClass = LocalTime::class)
object LocalTimeSerializer : KSerializer<LocalTime> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("LocalTime") {
        element<Int>("hour")
        element<Int>("minute")
        element<Int>("second")
        element<Int>("nanoOfSecond")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: LocalTime) {
        with(encoder.beginStructure(descriptor)) {
            encodeIntElement(descriptor, 0, value.hour)
            encodeIntElement(descriptor, 1, value.minute)
            encodeIntElement(descriptor, 2, value.second)
            encodeIntElement(descriptor, 3, value.nanoOfSecond)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): LocalTime =
            with(decoder.beginStructure(descriptor)) {
                var hour: Int? = null
                var minute: Int? = null
                var second: Int? = null
                var nanoOfSecond: Int? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> hour = decodeIntElement(descriptor, i)
                        1 -> minute = decodeIntElement(descriptor, i)
                        2 -> second = decodeIntElement(descriptor, i)
                        3 -> nanoOfSecond = decodeIntElement(descriptor, i)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                LocalTimes.of(
                        hour ?: throw MissingFieldException("hour"),
                        minute ?: throw MissingFieldException("minute"),
                        second ?: throw MissingFieldException("second"),
                        nanoOfSecond ?: throw MissingFieldException("nanoOfSecond")
                )
            }
}
