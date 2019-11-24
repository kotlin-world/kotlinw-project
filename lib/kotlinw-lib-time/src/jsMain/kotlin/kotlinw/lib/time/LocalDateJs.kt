package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual interface ChronoLocalDate : Comparable<ChronoLocalDate>

actual class LocalDate(internal val year: Int, internal val monthValue: Int, internal val dayOfMonth: Int) : ChronoLocalDate {
    internal val dateTime: DateTime by lazy { DateTime.local(year, monthValue, dayOfMonth) }

    override fun compareTo(other: ChronoLocalDate): Int =
            if (other is LocalDate) {
                compareBy(LocalDate::year).thenBy(LocalDate::monthValue).thenBy(LocalDate::dayOfMonth).compare(this, other)
            } else {
                throw IllegalArgumentException("Type is not supported: $other")
            }
}

actual val LocalDate.year: Int get() = year

actual val LocalDate.monthValue: Int get() = monthValue

actual val LocalDate.month get() = Months.of(monthValue)

actual val LocalDate.dayOfMonth: Int get() = dayOfMonth

@Suppress("unused")
actual fun LocalDates.now() = with(DateTime.local()) { LocalDate(year.toInt(), month.toInt(), day.toInt()) }

actual fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int) = LocalDate(year, monthValue, dayOfMonth)
