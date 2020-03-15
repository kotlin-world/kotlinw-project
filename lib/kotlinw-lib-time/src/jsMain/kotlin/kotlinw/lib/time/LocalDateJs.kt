package kotlinw.lib.time

import kotlinext.js.jsObject
import kotlinw.js.luxon.DateTime
import kotlinw.js.luxon.Duration
import kotlinx.serialization.Transient

//
// LocalDate
//

actual interface ChronoLocalDate : Comparable<ChronoLocalDate>

actual class LocalDate(internal val year: Int, internal val monthValue: Int, internal val dayOfMonth: Int) : ChronoLocalDate {
    @Transient
    val luxonDateTime: DateTime by lazy { DateTime.local(year, monthValue, dayOfMonth) }

    override fun compareTo(other: ChronoLocalDate): Int =
            if (other is LocalDate) {
                compareBy(LocalDate::year).thenBy(LocalDate::monthValue).thenBy(LocalDate::dayOfMonth).compare(this, other)
            } else {
                throw IllegalArgumentException("Type is not supported: $other")
            }

    // TODO tostring
}

actual val LocalDate.year: Int get() = luxonDateTime.year.toInt()

actual val LocalDate.monthValue: Int get() = luxonDateTime.month.toInt()

actual val LocalDate.month get() = Months.of(monthValue)

actual val LocalDate.dayOfMonth: Int get() = luxonDateTime.day.toInt()

actual fun LocalDate.plusYears(years: Int) = luxonDateTime.plus(jsObject<Duration> { this.years = years }).toLocalDate()

actual fun LocalDate.plusMonths(months: Int) = luxonDateTime.plus(jsObject<Duration> { this.months = months }).toLocalDate()

actual fun LocalDate.plusDays(days: Int) = luxonDateTime.plus(jsObject<Duration> { this.days = days }).toLocalDate()

//
// LocalDates
//

@Suppress("unused")
actual fun LocalDates.now() = DateTime.local().toLocalDate()

actual fun LocalDates.of(year: Int, monthValue: Int, dayOfMonth: Int) = LocalDate(year, monthValue, dayOfMonth)
