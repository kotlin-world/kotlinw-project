package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

//
// LocalDateTime
//

actual interface ChronoLocalDateTime<D : ChronoLocalDate> : Comparable<ChronoLocalDateTime<*>>

actual data class LocalDateTime(
        internal val date: LocalDate,
        internal val time: LocalTime
) : ChronoLocalDateTime<LocalDate> {
    override fun compareTo(other: ChronoLocalDateTime<*>): Int =
            if (other is LocalDateTime) {
                compareBy(LocalDateTime::date).thenBy(LocalDateTime::time).compare(this, other)
            } else {
                throw IllegalArgumentException("Type is not supported: $other")
            }

    // TODO tostring
}

actual val LocalDateTime.date: LocalDate get() = date

actual val LocalDateTime.time: LocalTime get() = time

actual val LocalDateTime.year: Int get() = date.year

actual val LocalDateTime.monthValue: Int get() = date.monthValue

actual val LocalDateTime.dayOfMonth: Int get() = date.dayOfMonth

actual val LocalDateTime.hour: Int get() = time.hour

actual val LocalDateTime.minute: Int get() = time.minute

actual val LocalDateTime.second: Int get() = time.second

actual val LocalDateTime.nanoOfSecond: Int get() = time.nanoOfSecond

//
// LocalDateTimes
//

actual fun LocalDateTimes.now(): LocalDateTime = DateTime.local().toLocalDateTime(0)

actual fun LocalDateTimes.of(date: LocalDate, time: LocalTime): LocalDateTime = LocalDateTime(date, time)

actual fun LocalDateTimes.of(year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime =
        LocalDateTime(LocalDate(year, monthValue, dayOfMonth), LocalTime(hour, minute, second, nanoOfSecond))

//
// Conversions
//

actual fun LocalDateTime.toZonedDateTime(zone: ZoneId): ZonedDateTime = ZonedDateTimes.of(zone, this)
