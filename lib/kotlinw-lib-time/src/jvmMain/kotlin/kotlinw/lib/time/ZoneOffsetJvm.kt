package kotlinw.lib.time

actual typealias ZoneOffset = java.time.ZoneOffset

actual val ZoneOffset.totalSeconds: Int get() = totalSeconds

actual val ZoneOffset.totalMinutes: Int get() = totalSeconds / TimeConstants.SecondsPerMinute

actual fun ZoneOffsets.ofTotalSeconds(totalSeconds: Int): ZoneOffset = ZoneOffset.ofTotalSeconds(totalSeconds)
