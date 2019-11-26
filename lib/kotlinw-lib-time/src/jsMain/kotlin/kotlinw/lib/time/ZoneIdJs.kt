package kotlinw.lib.time

import kotlinw.js.luxon.DateTime
import kotlinw.js.luxon.FixedOffsetZone
import kotlinw.js.luxon.IANAZone
import kotlinw.js.luxon.Zone

//
// ZoneId
//

actual abstract class ZoneId {
    actual abstract fun getId(): String

    abstract val luxonZone: Zone
}

actual fun ZoneId.getOffset(instant: Instant): ZoneOffset =
        when (this) {
            is ZoneOffset -> {
                this
            }
            is ZoneRegion -> {
                ZoneOffsets.ofTotalSeconds(luxonZone.unsafeCast<IANAZone>().offset(instant.dateTime.toMillis()).toInt() * TimeConstants.SecondsPerMinute)
            }
            else -> {
                throw IllegalArgumentException("Unsupported ZoneId: $this")
            }
        }

//
// ZoneIds
//

actual val ZoneIds.local: ZoneId get() = DateTime.local().zone.toZoneId()

actual fun ZoneIds.of(zoneId: String): ZoneId =
        when {
            zoneId == "UTC" -> ZoneOffsets.Utc
            zoneId.startsWith("UTC+") || zoneId.startsWith("UTC-") -> ZoneOffsets.ofTotalSeconds(FixedOffsetZone.parseSpecifier(zoneId).offset().toInt() * TimeConstants.SecondsPerMinute)
            else -> ZoneRegion(zoneId)
        }
