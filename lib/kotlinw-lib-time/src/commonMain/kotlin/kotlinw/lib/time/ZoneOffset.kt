package kotlinw.lib.time

expect class ZoneOffset : ZoneId, Comparable<ZoneOffset>

expect val ZoneOffset.totalSeconds: Int

expect val ZoneOffset.totalMinutes: Int

object ZoneOffsets {
    private const val MaxSeconds = 18 * TimeConstants.SecondsPerHour

    val Utc = ZoneOffsets.ofTotalSeconds(0)

    val Min = ZoneOffsets.ofTotalSeconds(-MaxSeconds)

    val Max = ZoneOffsets.ofTotalSeconds(MaxSeconds)
}

expect fun ZoneOffsets.ofTotalSeconds(totalSeconds: Int): ZoneOffset

fun ZoneOffsets.ofTotalMinutes(totalMinutes: Int): ZoneOffset = ofTotalSeconds(totalMinutes * TimeConstants.SecondsPerMinute)
