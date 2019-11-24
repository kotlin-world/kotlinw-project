package kotlinw.lib.time

import kotlinext.js.jsObject
import kotlinw.js.luxon.DateTime

actual interface ChronoZonedDateTime<D : ChronoLocalDate> : Comparable<ChronoZonedDateTime<*>>

actual class ZonedDateTime(
        internal val localDateTime: LocalDateTime,
        internal val zone: ZoneId
) : ChronoZonedDateTime<LocalDate> {
    internal val dateTime: DateTime by lazy {
        val luxonZone = zone.luxonZone
        DateTime.fromObject(jsObject {
            year = localDateTime.year
            month = localDateTime.monthValue
            day = localDateTime.dayOfMonth
            hour = localDateTime.hour
            minute = localDateTime.minute
            second = localDateTime.second
            millisecond = localDateTime.nanoOfSecond / 1_000_000
            zone = luxonZone
        })
    }

    override fun compareTo(other: ChronoZonedDateTime<*>): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

actual val ZonedDateTime.zone: ZoneId get() = zone

actual val ZonedDateTime.date: LocalDate get() = localDateTime.date

actual val ZonedDateTime.time: LocalTime get() = localDateTime.time

actual val ZonedDateTime.year: Int get() = date.year

actual val ZonedDateTime.monthValue: Int get() = date.monthValue

actual val ZonedDateTime.dayOfMonth: Int get() = date.dayOfMonth

actual val ZonedDateTime.hour: Int get() = time.hour

actual val ZonedDateTime.minute: Int get() = time.minute

actual val ZonedDateTime.second: Int get() = time.second

actual val ZonedDateTime.nanoOfSecond: Int get() = time.nanoOfSecond

actual fun ZonedDateTime.toInstant(): Instant = Instants.of(dateTime)

actual fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime = ZonedDateTime(localDateTime, zone)
