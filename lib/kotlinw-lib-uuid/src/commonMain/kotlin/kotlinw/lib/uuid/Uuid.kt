package kotlinw.lib.uuid

import kotlinx.serialization.*

expect class Uuid {
    override fun toString(): String
}

expect fun String.toUuid(): Uuid

expect fun randomUuid(): Uuid

@Serializer(forClass = Uuid::class)
class UuidSerializer : KSerializer<Uuid> {
    override val descriptor = PrimitiveDescriptor("Uuid", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): Uuid {
        return decoder.decodeString().toUuid()
    }

    override fun serialize(encoder: Encoder, obj: Uuid) {
        encoder.encodeString(obj.toString())
    }
}
