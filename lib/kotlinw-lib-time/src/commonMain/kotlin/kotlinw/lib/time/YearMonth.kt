package kotlinw.lib.time

expect class YearMonth : Comparable<YearMonth>

expect val YearMonth.year: Int
expect val YearMonth.monthValue: Int

val YearMonth.month: Month get() = Months.of(monthValue)

object YearMonths

expect fun YearMonths.of(year: Int, monthValue: Int): YearMonth

@Suppress("unused")
fun YearMonths.of(year: Int, month: Month): YearMonth = YearMonths.of(year, month.value)
