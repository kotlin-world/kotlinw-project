package kotlinw.lib.time

//
// LocalTime
//

actual data class LocalTime(internal val hour: Int, internal val minute: Int, internal val second: Int = 0, internal val nanoOfSecond: Int = 0) : Comparable<LocalTime> {
    override fun compareTo(other: LocalTime) = compareBy(LocalTime::hour).thenBy(LocalTime::minute).thenBy(LocalTime::second).thenBy(LocalTime::nanoOfSecond).compare(this, other)

    // TODO toString
}

actual val LocalTime.hour: Int get() = hour

actual val LocalTime.minute: Int get() = minute

actual val LocalTime.second: Int get() = second

actual val LocalTime.nanoOfSecond: Int get() = nanoOfSecond

//
// LocalTimes
//

actual fun LocalTimes.of(hour: Int, minute: Int, second: Int, nanoOfSecond: Int) = LocalTime(hour, minute, second, nanoOfSecond)
