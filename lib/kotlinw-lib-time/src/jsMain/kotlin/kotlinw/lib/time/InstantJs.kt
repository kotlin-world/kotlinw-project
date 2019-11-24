package kotlinw.lib.time

import kotlinw.js.luxon.DateTime

actual class Instant(val epochSecond: Long, val nanoOfSecond: Int) : Comparable<Instant> {
    internal val dateTime: DateTime by lazy { DateTime.fromMillis(epochSecond * 1000.0 + nanoOfSecond / 1_000_000.0) }

    init {
        require(nanoOfSecond in 0..999999999)
    }

    override fun compareTo(other: Instant): Int = toEpochMilli().compareTo(other.toEpochMilli())

    override fun equals(other: Any?) = other is Instant && epochSecond == other.epochSecond && nanoOfSecond == other.nanoOfSecond

    override fun hashCode() = toEpochMilli().hashCode()

    override fun toString() = toIso8601()
}

actual val Instant.epochSecond: Long get() = epochSecond

actual val Instant.nanoOfSecond: Int get() = nanoOfSecond

actual fun Instant.toEpochMilli(): Long = dateTime.toMillis().toLong()

actual fun Instant.toIso8601(): String = dateTime.toISO()

@Suppress("unused")
actual fun Instants.now(): Instant = Instants.of(DateTime.local())

actual fun Instants.ofEpochMilli(epochMilli: Long): Instant = Instants.of(DateTime.fromMillis(epochMilli.toDouble()))

@Suppress("unused")
actual fun Instants.ofEpochSecond(epochSecond: Long, nanoOfSecond: Int): Instant = Instant(epochSecond, nanoOfSecond)

// TODO accept only UTC
@Suppress("unused")
actual fun Instants.parseIso8601(text: CharSequence): Instant = Instants.of(DateTime.fromISO(text.toString()))

@Suppress("unused")
fun Instants.of(dateTime: DateTime) = dateTime.toMillis().toLong().let { Instant(it / 1_000, it.rem(1_000L).toInt() * 1_000_000) }
