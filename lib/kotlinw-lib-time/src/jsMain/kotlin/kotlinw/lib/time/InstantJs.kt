package kotlinw.lib.time

import kotlinext.js.jsObject
import kotlinw.js.luxon.DateTime

//
// Instant
//

actual data class Instant(internal val epochSecond: Long, internal val nanoOfSecond: Int) : Comparable<Instant> {
    val dateTime: DateTime by lazy { DateTime.fromMillis((epochSecond * 1000L + nanoOfSecond.toLong() / 1_000_000L).toDouble(), jsObject { zone = "utc" }) }

    init {
        require(nanoOfSecond in 0..999999999)
    }

    override fun compareTo(other: Instant): Int = toEpochMilli().compareTo(other.toEpochMilli())

    override fun toString() = toIso8601()
}

actual val Instant.epochSecond: Long get() = epochSecond

actual val Instant.nanoOfSecond: Int get() = nanoOfSecond

actual fun Instant.toEpochMilli(): Long = epochSecond * 1000 + nanoOfSecond / 1_000_000

actual fun Instant.toIso8601(): String =
        with(toLocalDateTime(ZoneOffsets.Utc)) {
            buildString {
                append(year)
                append("-")
                append(monthValue.toString().padStart(2, '0'))
                append("-")
                append(dayOfMonth.toString().padStart(2, '0'))
                append("T")
                append(hour.toString().padStart(2, '0'))
                append(":")
                append(minute.toString().padStart(2, '0'))
                append(":")
                append(second.toString().padStart(2, '0'))
                if (nanoOfSecond != 0) {
                    append(".")
                    append(if (nanoOfSecond.rem(1_000_000) == 0) (nanoOfSecond / 1_000_000).toString().padStart(3, '0') else nanoOfSecond.toString().padStart(9, '0'))
                }
                append("Z")
            }
        }

//
// Instants
//

@Suppress("unused")
actual fun Instants.now(): Instant = DateTime.utc().toInstant(0)

actual fun Instants.ofEpochMilli(epochMilli: Long): Instant = DateTime.fromMillis(epochMilli.toDouble(), jsObject { zone = "utc" }).toInstant(0)

@Suppress("unused")
actual fun Instants.ofEpochSecond(epochSecond: Long, nanoOfSecond: Int): Instant = Instant(epochSecond, nanoOfSecond)

// TODO accept only UTC
@Suppress("unused")
actual fun Instants.parseIso8601(text: CharSequence): Instant = DateTime.fromISO(text.toString()).toInstant(0)

//
// Conversions
//

actual fun Instant.toLocalDateTime(zoneId: ZoneId): LocalDateTime = toZonedDateTime(zoneId).localDateTime

actual fun Instant.toZonedDateTime(zoneId: ZoneId): ZonedDateTime = dateTime.toZonedDateTime(zoneId, nanoOfSecond.rem(1_000_000))
