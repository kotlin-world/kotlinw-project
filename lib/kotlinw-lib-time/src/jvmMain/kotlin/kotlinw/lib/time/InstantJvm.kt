package kotlinw.lib.time

import java.time.format.DateTimeFormatter

//
// Instant
//

actual typealias Instant = java.time.Instant

actual val Instant.epochSecond: Long get() = epochSecond

actual val Instant.nanoOfSecond: Int get() = nano

actual fun Instant.toEpochMilli(): Long = toEpochMilli()

actual fun Instant.toIso8601(): String = DateTimeFormatter.ISO_INSTANT.format(this)

//
// Instants
//

actual fun Instants.now(): Instant = Instant.now()

actual fun Instants.ofEpochMilli(epochMilli: Long): Instant = Instant.ofEpochMilli(epochMilli)

actual fun Instants.ofEpochSecond(epochSecond: Long, nanoOfSecond: Int): Instant {
    require(nanoOfSecond in 0..999999999)
    return Instant.ofEpochSecond(epochSecond, nanoOfSecond.toLong())
}

actual fun Instants.parseIso8601(text: CharSequence): Instant = Instant.parse(text)

//
// Conversions
//

actual fun Instant.toLocalDateTime(zoneId: ZoneId): LocalDateTime = LocalDateTime.ofInstant(this, zoneId)

actual fun Instant.toZonedDateTime(zoneId: ZoneId): ZonedDateTime = ZonedDateTime.ofInstant(this, zoneId)
