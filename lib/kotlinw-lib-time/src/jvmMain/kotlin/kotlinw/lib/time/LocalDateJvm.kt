package kotlinw.lib.time

//
// LocalDate
//

actual typealias ChronoLocalDate = java.time.chrono.ChronoLocalDate

actual typealias LocalDate = java.time.LocalDate

actual val LocalDate.year: Int get() = year

actual val LocalDate.monthValue: Int get() = monthValue

actual val LocalDate.month: Month get() = month

actual val LocalDate.dayOfMonth: Int get() = dayOfMonth

actual fun LocalDate.plusYears(years: Int): LocalDate = plusYears(years.toLong())

actual fun LocalDate.plusMonths(months: Int): LocalDate = plusMonths(months.toLong())

actual fun LocalDate.plusDays(days: Int): LocalDate = plusDays(days.toLong())

//
// LocalDates
//

actual fun LocalDates.now(): LocalDate = LocalDate.now()

actual fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int): LocalDate = LocalDate.of(year, monthValue, dayOfMonth)
