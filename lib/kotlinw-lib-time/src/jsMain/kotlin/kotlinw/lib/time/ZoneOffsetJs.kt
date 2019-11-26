package kotlinw.lib.time

import kotlinext.js.jsObject
import kotlinw.js.luxon.FixedOffsetZone

//
// ZoneOffset
//

actual data class ZoneOffset(internal val totalMinutes: Int) : ZoneId(), Comparable<ZoneOffset> {
    override val luxonZone by lazy { FixedOffsetZone.instance(totalMinutes) }

    override fun getId(): String = luxonZone.name

    override fun compareTo(other: ZoneOffset): Int = totalMinutes.compareTo(other.totalMinutes)

    override fun toString() = luxonZone.offsetName(jsObject { })
}

actual val ZoneOffset.totalMinutes: Int get() = totalMinutes

actual val ZoneOffset.totalSeconds: Int get() = totalMinutes * TimeConstants.SecondsPerMinute

//
// ZoneOffsets
//

actual fun ZoneOffsets.ofTotalSeconds(totalSeconds: Int) = ZoneOffset(totalSeconds / TimeConstants.SecondsPerMinute)
