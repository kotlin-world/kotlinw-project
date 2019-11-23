package kotlinw.lib.time

expect class Instant : Comparable<Instant>

expect val Instant.epochSecond: Long

expect val Instant.nanoOfSecond: Int

expect fun Instant.toEpochMilli(): Long

expect fun Instant.toIso8601(): String

expect object Instants {
    fun now(): Instant

    fun ofEpochMilli(epochMilli: Long): Instant

    fun ofEpochSecond(epochSecond: Long, nanoOfSecond: Int = 0): Instant

    fun parseIso8601(text: CharSequence): Instant
}
