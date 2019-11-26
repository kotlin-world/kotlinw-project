package kotlinw.lib.time

//
// ZoneId
//

actual typealias ZoneId = java.time.ZoneId

actual fun ZoneId.getOffset(instant: Instant): ZoneOffset = rules.getOffset(instant)

//
// ZoneIds
//

actual val ZoneIds.local: ZoneId get() = ZoneId.systemDefault()

actual fun ZoneIds.of(zoneId: String): ZoneId = ZoneId.of(zoneId)
