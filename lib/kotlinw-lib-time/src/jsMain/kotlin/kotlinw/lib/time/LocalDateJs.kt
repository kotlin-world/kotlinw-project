package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

//
// LocalDate
//

actual interface ChronoLocalDate : Comparable<ChronoLocalDate>

actual data class LocalDate(internal val year: Int, internal val monthValue: Int, internal val dayOfMonth: Int) : ChronoLocalDate {
    override fun compareTo(other: ChronoLocalDate): Int =
            if (other is LocalDate) {
                compareBy(LocalDate::year).thenBy(LocalDate::monthValue).thenBy(LocalDate::dayOfMonth).compare(this, other)
            } else {
                throw IllegalArgumentException("Type is not supported: $other")
            }

    // TODO tostring
}

actual val LocalDate.year: Int get() = year

actual val LocalDate.monthValue: Int get() = monthValue

actual val LocalDate.month get() = Months.of(monthValue)

actual val LocalDate.dayOfMonth: Int get() = dayOfMonth

//
// LocalDates
//

@Suppress("unused")
actual fun LocalDates.now() = DateTime.local().toLocalDate()

actual fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int) = LocalDate(year, monthValue, dayOfMonth)
