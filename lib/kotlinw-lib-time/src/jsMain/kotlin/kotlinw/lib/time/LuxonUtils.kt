package kotlinw.lib.time

import kotlinw.js.luxon.DateTime
import kotlinw.js.luxon.Zone

//
// Conversions
//

// Instant

internal fun DateTime.toInstant(nanoOfSecondCorrection: Int = 0) = toMillis().toLong().let { Instant(it / 1_000, (it.rem(1_000L) * 1_000_000 + nanoOfSecondCorrection).toInt()) }

// LocalDate

internal fun DateTime.toLocalDate() = LocalDate(year.toInt(), month.toInt(), day.toInt())

// LocalTime

internal fun DateTime.toLocalTime(nanoOfSecondCorrection: Int = 0) = LocalTime(hour.toInt(), minute.toInt(), second.toInt(), millisecond.toInt() * 1_000_000 + nanoOfSecondCorrection)

// LocalDateTime

internal fun DateTime.toLocalDateTime(nanoOfSecondCorrection: Int = 0) = LocalDateTime(toLocalDate(), toLocalTime(nanoOfSecondCorrection))

// ZonedDateTime

internal fun DateTime.toZonedDateTime(zoneId: ZoneId? = null, nanoOfSecondCorrection: Int = 0): ZonedDateTime {
    val finalZone = zoneId?.luxonZone ?: zone

    val finalDateTime =
            if (zone == finalZone) {
                this
            } else {
                setZone(finalZone)
            }

    return ZonedDateTime(finalZone.toZoneId(), finalDateTime.toLocalDateTime(nanoOfSecondCorrection))
}

// ZoneId

internal fun Zone.toZoneId() = ZoneIds.of(name)
