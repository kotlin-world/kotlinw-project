package kotlinw.lib.time

//
// YearMonth
//

actual typealias YearMonth = java.time.YearMonth

actual val YearMonth.year: Int get() = year

actual val YearMonth.monthValue: Int get() = monthValue

//
// YearMonths
//

actual fun YearMonths.of(year: Int, monthValue: Int): YearMonth = YearMonth.of(year, monthValue)
