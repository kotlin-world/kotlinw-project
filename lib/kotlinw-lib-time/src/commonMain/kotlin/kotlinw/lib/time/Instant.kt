package kotlinw.lib.time

expect class Instant : Comparable<Instant>

expect val Instant.epochSecond: Long

expect val Instant.nanoOfSecond: Int

expect fun Instant.toEpochMilli(): Long

expect fun Instant.toIso8601(): String

object Instants

expect fun Instants.now(): Instant

expect fun Instants.ofEpochMilli(epochMilli: Long): Instant

expect fun Instants.ofEpochSecond(epochSecond: Long, nanoOfSecond: Int = 0): Instant

expect fun Instants.parseIso8601(text: CharSequence): Instant
