package kotlinw.lib.time

//
// LocalTime
//

actual typealias LocalTime = java.time.LocalTime

actual val LocalTime.hour: Int get() = hour

actual val LocalTime.minute: Int get() = minute

actual val LocalTime.second: Int get() = second

actual val LocalTime.nanoOfSecond: Int get() = nano

//
// LocalTimes
//

actual fun LocalTimes.of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalTime = LocalTime.of(hour, minute, second, nanoOfSecond)
