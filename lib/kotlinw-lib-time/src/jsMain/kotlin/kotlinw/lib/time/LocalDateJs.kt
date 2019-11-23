package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual interface ChronoLocalDate : Comparable<ChronoLocalDate>

actual class LocalDate(val dateTime: DateTime) : ChronoLocalDate {
    override fun compareTo(other: ChronoLocalDate): Int =
            if (other is LocalDate) {
                dateTime.toMillis().toLong().compareTo(other.dateTime.toMillis().toLong())
            } else {
                throw IllegalArgumentException("Not supported: $other")
            }
}

actual val LocalDate.year get() = dateTime.year.toInt()
actual val LocalDate.monthValue get() = dateTime.month.toInt()
actual val LocalDate.month get() = Months.of(monthValue)
actual val LocalDate.dayOfMonth get() = dateTime.day.toInt()

actual fun LocalDates.now() = LocalDate(DateTime.local())
actual fun LocalDates.of(year: Int, month: Int, dayOfMonth: Int) = LocalDate(DateTime.local(year, month, dayOfMonth))
