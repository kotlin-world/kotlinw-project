package kotlinw.lib.time

actual typealias ZoneId = java.time.ZoneId

actual fun ZoneId.getOffset(instant: Instant): ZoneOffset = rules.getOffset(instant)

actual fun ZoneIds.of(zoneId: String): ZoneId = ZoneId.of(zoneId)
