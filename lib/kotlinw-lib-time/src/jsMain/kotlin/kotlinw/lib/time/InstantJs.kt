package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual class Instant(val dateTime: DateTime) : Comparable<Instant> {
    override fun compareTo(other: Instant): Int = toEpochMilli().compareTo(other.toEpochMilli())

    override fun equals(other: Any?) = other is Instant && epochSecond == other.epochSecond && nanoOfSecond == other.nanoOfSecond

    override fun hashCode() = toEpochMilli().hashCode()

    override fun toString() = toIso8601()
}

actual val Instant.epochSecond: Long get() = toEpochMilli() / 1_000

actual val Instant.nanoOfSecond: Int get() = toEpochMilli().rem(1_000L).toInt() * 1_000_000

actual fun Instant.toEpochMilli(): Long = dateTime.toMillis().toLong()

actual fun Instant.toIso8601(): String = dateTime.toISO()

actual object Instants {
    actual fun now(): Instant = Instant(DateTime.utc())

    actual fun ofEpochMilli(epochMilli: Long): Instant = Instant(DateTime.fromMillis(epochMilli.toDouble()).setZone("UTC"))

    actual fun ofEpochSecond(epochSecond: Long, nanoOfSecond: Int): Instant {
        require(nanoOfSecond in 0..999999999)
        return ofEpochMilli(epochSecond * 1000 + nanoOfSecond / 1_000_000)
    }

    // TODO accept only UTC
    actual fun parseIso8601(text: CharSequence): Instant = Instant(DateTime.fromISO(text.toString()).setZone("UTC"))
}
