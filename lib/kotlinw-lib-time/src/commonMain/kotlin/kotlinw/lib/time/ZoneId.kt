package kotlinw.lib.time

expect abstract class ZoneId {
    abstract fun getId(): String
}

val ZoneId.id get() = getId()

expect fun ZoneId.getOffset(instant: Instant): ZoneOffset

object ZoneIds

expect fun ZoneIds.of(zoneId: String): ZoneId
