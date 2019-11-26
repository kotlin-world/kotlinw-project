package kotlinw.lib.time

//
// ZoneOffset
//

actual typealias ZoneOffset = java.time.ZoneOffset

actual val ZoneOffset.totalSeconds: Int get() = totalSeconds

actual val ZoneOffset.totalMinutes: Int get() = totalSeconds / TimeConstants.SecondsPerMinute

//
// ZoneOffsets
//

actual fun ZoneOffsets.ofTotalSeconds(totalSeconds: Int): ZoneOffset = ZoneOffset.ofTotalSeconds(totalSeconds)
