package kotlinw.lib.time

expect interface ChronoLocalDate : Comparable<ChronoLocalDate>

expect class LocalDate : ChronoLocalDate

expect val LocalDate.year: Int

expect val LocalDate.monthValue: Int

expect val LocalDate.month: Month

expect val LocalDate.dayOfMonth: Int

object LocalDates

expect fun LocalDates.now(): LocalDate

expect fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int): LocalDate
