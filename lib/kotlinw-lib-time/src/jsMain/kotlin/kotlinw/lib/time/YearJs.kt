package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

//
// Year
//

actual data class Year(internal val value: Int) : Comparable<Year> {
    override fun compareTo(other: Year): Int = value.compareTo(other.value)

    override fun toString() = value.toString()
}

actual val Year.value: Int get() = value

actual val Year.isLeap: Boolean get() = DateTime.local(value).isInLeapYear

//
// Years
//

actual fun Years.of(isoYear: Int) = Year(isoYear)
