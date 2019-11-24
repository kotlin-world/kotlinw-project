package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual class YearMonth(val year: Int, val monthValue: Int) : Comparable<YearMonth> {
    internal val dateTime: DateTime by lazy { DateTime.utc(year, monthValue) }

    init {
        require(monthValue in 1..12)
    }

    override fun compareTo(other: YearMonth): Int = compareBy(YearMonth::year).thenBy(YearMonth::monthValue).compare(this, other)
}

actual val YearMonth.year: Int get() = year

actual val YearMonth.monthValue: Int get() = monthValue

actual fun YearMonths.of(year: Int, monthValue: Int): YearMonth = YearMonth(year, monthValue)
