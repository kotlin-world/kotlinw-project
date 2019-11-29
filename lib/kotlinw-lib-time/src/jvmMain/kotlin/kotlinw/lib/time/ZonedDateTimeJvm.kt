package kotlinw.lib.time

//
// ZonedDateTime
//

actual typealias ChronoZonedDateTime<D> = java.time.chrono.ChronoZonedDateTime<D>

actual typealias ZonedDateTime = java.time.ZonedDateTime

actual val ZonedDateTime.zone: ZoneId get() = zone

actual val ZonedDateTime.localDateTime: LocalDateTime get() = LocalDateTimes.of(LocalDates.of(year, monthValue, dayOfMonth), LocalTimes.of(hour, minute, second, nanoOfSecond))

actual val ZonedDateTime.year: Int get() = year

actual val ZonedDateTime.monthValue: Int get() = monthValue

actual val ZonedDateTime.dayOfMonth: Int get() = dayOfMonth

actual val ZonedDateTime.hour: Int get() = hour

actual val ZonedDateTime.minute: Int get() = minute

actual val ZonedDateTime.second: Int get() = second

actual val ZonedDateTime.nanoOfSecond: Int get() = nano

//
// ZonedDateTime
//

actual fun ZonedDateTimes.now(): ZonedDateTime = ZonedDateTime.now()

actual fun ZonedDateTimes.now(zone: ZoneId): ZonedDateTime = ZonedDateTime.now(zone)

actual fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime = ZonedDateTime.ofLocal(localDateTime, zone, null)

//
// Conversions
//

actual fun ZonedDateTime.withZoneSameLocal(zone: ZoneId): ZonedDateTime = withZoneSameLocal(zone)

actual fun ZonedDateTime.toInstant(): Instant = toInstant()
