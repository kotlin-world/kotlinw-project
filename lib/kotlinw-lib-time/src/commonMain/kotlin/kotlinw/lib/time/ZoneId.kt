package kotlinw.lib.time

import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

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
    override val descriptor = StringDescriptor.withName("id")

    override fun serialize(encoder: Encoder, obj: ZoneId) {
        encoder.encodeString(obj.id)
    }

    override fun deserialize(decoder: Decoder): ZoneId {
        return ZoneIds.of(decoder.decodeString())
    }
}
