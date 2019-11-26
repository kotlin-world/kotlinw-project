package kotlinw.lib.time

import kotlinext.js.jsObject
import kotlinw.js.luxon.DateTime

//
// ZonedDateTime
//

actual interface ChronoZonedDateTime<D : ChronoLocalDate> : Comparable<ChronoZonedDateTime<*>>

actual data class ZonedDateTime(
        internal val zone: ZoneId,
        internal val localDateTime: LocalDateTime
) : ChronoZonedDateTime<LocalDate> {
    val dateTime: DateTime by lazy {
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

    override fun compareTo(other: ChronoZonedDateTime<*>): Int =
            if (other is ZonedDateTime) {
                toInstant().compareTo(other.toInstant())
            } else {
                throw IllegalArgumentException("Type is not supported: $other")
            }

    // TODO toString()
}

actual val ZonedDateTime.localDateTime: LocalDateTime get() = localDateTime

actual val ZonedDateTime.zone: ZoneId get() = zone

actual val ZonedDateTime.year: Int get() = localDateTime.year

actual val ZonedDateTime.monthValue: Int get() = localDateTime.monthValue

actual val ZonedDateTime.dayOfMonth: Int get() = localDateTime.dayOfMonth

actual val ZonedDateTime.hour: Int get() = localDateTime.hour

actual val ZonedDateTime.minute: Int get() = localDateTime.minute

actual val ZonedDateTime.second: Int get() = localDateTime.second

actual val ZonedDateTime.nanoOfSecond: Int get() = localDateTime.nanoOfSecond

actual fun ZonedDateTime.withZoneSameLocal(zone: ZoneId): ZonedDateTime = ZonedDateTimes.of(zone, localDateTime)

//
// ZonedDateTimes
//

actual fun ZonedDateTimes.now(): ZonedDateTime = Instants.now().toZonedDateTime(ZoneIds.local)

actual fun ZonedDateTimes.now(zone: ZoneId): ZonedDateTime = Instants.now().toZonedDateTime(zone)

actual fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime = ZonedDateTime(zone, localDateTime)

//
// Conversions
//

actual fun ZonedDateTime.toInstant(): Instant = dateTime.toInstant(nanoOfSecond.rem(1_000_000))
