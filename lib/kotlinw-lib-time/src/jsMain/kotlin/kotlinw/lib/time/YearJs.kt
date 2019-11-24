package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual class Year(val value: Int) : Comparable<Year> {
    internal val dateTime: DateTime by lazy { DateTime.utc(value) }

    override fun compareTo(other: Year): Int = value.compareTo(other.value)
}

actual val Year.value: Int get() = value

actual val Year.isLeap: Boolean get() = dateTime.isInLeapYear

actual fun Years.of(isoYear: Int) = Year(isoYear)
