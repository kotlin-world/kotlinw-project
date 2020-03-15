package kotlinw.lib.time

import kotlinx.serialization.*

//
// ZoneId
//

expect abstract class ZoneId {
    abstract fun getId(): String
}

val ZoneId.id get() = getId()

expect fun ZoneId.getOffset(instant: Instant): ZoneOffset

//
// ZoneIds
//

object ZoneIds

expect val ZoneIds.local: ZoneId

expect fun ZoneIds.of(zoneId: String): ZoneId

//
// Serializer
//

@Serializer(forClass = ZoneId::class)
object ZoneIdSerializer : KSerializer<ZoneId> {
    override val descriptor = PrimitiveDescriptor("id", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: ZoneId) {
        encoder.encodeString(value.id)
    }

    override fun deserialize(decoder: Decoder): ZoneId {
        return ZoneIds.of(decoder.decodeString())
    }
}
