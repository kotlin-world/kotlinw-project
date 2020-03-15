package kotlinw.lib.time

import kotlinx.serialization.*

//
// Instant
//

expect class Instant : Comparable<Instant>

expect val Instant.epochSecond: Long

expect val Instant.nanoOfSecond: Int

expect fun Instant.toEpochMilli(): Long

expect fun Instant.toIso8601(): String

//
// Instants
//

object Instants

expect fun Instants.now(): Instant

expect fun Instants.ofEpochMilli(epochMilli: Long): Instant

expect fun Instants.ofEpochSecond(epochSecond: Long, nanoOfSecond: Int = 0): Instant

expect fun Instants.parseIso8601(text: CharSequence): Instant

//
// Serializer
//

@Serializer(forClass = Instant::class)
object InstantSerializer : KSerializer<Instant> {
    @ImplicitReflectionSerializer
    override val descriptor = SerialDescriptor("Instant") {
        element<Long>("epochSecond")
        element<Int>("nanoOfSecond")
    }

    @ImplicitReflectionSerializer
    override fun serialize(encoder: Encoder, value: Instant) {
        with(encoder.beginStructure(descriptor)) {
            encodeLongElement(descriptor, 0, value.epochSecond)
            encodeIntElement(descriptor, 1, value.nanoOfSecond)
            endStructure(descriptor)
        }
    }

    @ImplicitReflectionSerializer
    override fun deserialize(decoder: Decoder): Instant =
            with(decoder.beginStructure(descriptor)) {
                var epochSecond: Long? = null
                var nanoOfSecond: Int? = null
                loop@ while (true) {
                    when (val i = decodeElementIndex(descriptor)) {
                        CompositeDecoder.READ_DONE -> break@loop
                        0 -> epochSecond = decodeLongElement(descriptor, i)
                        1 -> nanoOfSecond = decodeIntElement(descriptor, i)
                        else -> throw SerializationException("Unknown index $i")
                    }
                }
                endStructure(descriptor)
                Instants.ofEpochSecond(
                        epochSecond ?: throw MissingFieldException("epochSecond"),
                        nanoOfSecond ?: throw MissingFieldException("nanoOfSecond")
                )
            }
}

//
// Conversions
//

fun Instant.toYear(zoneId: ZoneId) = toLocalDateTime(zoneId).toYear()

fun Instant.toYearMonth(zoneId: ZoneId) = toLocalDateTime(zoneId).toYearMonth()

expect fun Instant.toLocalDateTime(zoneId: ZoneId): LocalDateTime

expect fun Instant.toZonedDateTime(zoneId: ZoneId): ZonedDateTime
