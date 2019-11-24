package kotlinw.lib.time

expect class LocalTime : Comparable<LocalTime>

expect val LocalTime.hour: Int

expect val LocalTime.minute: Int

expect val LocalTime.second: Int

expect val LocalTime.nanoOfSecond: Int

object LocalTimes

expect fun LocalTimes.of(hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0): LocalTime
