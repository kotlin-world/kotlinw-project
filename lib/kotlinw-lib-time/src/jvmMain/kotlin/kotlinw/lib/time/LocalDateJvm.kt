package kotlinw.lib.time

actual typealias ChronoLocalDate = java.time.chrono.ChronoLocalDate

actual typealias LocalDate = java.time.LocalDate

actual val LocalDate.year: Int get() = year

actual val LocalDate.monthValue: Int get() = monthValue

actual val LocalDate.month: Month get() = month

actual val LocalDate.dayOfMonth: Int get() = dayOfMonth

actual fun LocalDates.now(): LocalDate = LocalDate.now()

actual fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int): LocalDate = LocalDate.of(year, monthValue, dayOfMonth)
