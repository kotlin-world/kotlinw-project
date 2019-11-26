package kotlinw.lib.time

//
// YearMonth
//

actual data class YearMonth(internal val year: Int, internal val monthValue: Int) : Comparable<YearMonth> {
    init {
        require(monthValue in 1..12)
    }

    override fun compareTo(other: YearMonth): Int = compareBy(YearMonth::year).thenBy(YearMonth::monthValue).compare(this, other)

    // TODO toString()
}

actual val YearMonth.year: Int get() = year

actual val YearMonth.monthValue: Int get() = monthValue

//
// YearMonths
//

actual fun YearMonths.of(year: Int, monthValue: Int): YearMonth = YearMonth(year, monthValue)
