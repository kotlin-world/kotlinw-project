package kotlinw.lib.time

actual typealias ChronoZonedDateTime<D> = java.time.chrono.ChronoZonedDateTime<D>

actual typealias ZonedDateTime = java.time.ZonedDateTime

actual val ZonedDateTime.zone: ZoneId get() = zone

actual val ZonedDateTime.date: LocalDate get() = LocalDate.of(year, monthValue, dayOfMonth)

actual val ZonedDateTime.time: LocalTime get() = LocalTime.of(hour, minute, second, nanoOfSecond)

actual val ZonedDateTime.year: Int get() = year

actual val ZonedDateTime.monthValue: Int get() = monthValue

actual val ZonedDateTime.dayOfMonth: Int get() = dayOfMonth

actual val ZonedDateTime.hour: Int get() = hour

actual val ZonedDateTime.minute: Int get() = minute

actual val ZonedDateTime.second: Int get() = second

actual val ZonedDateTime.nanoOfSecond: Int get() = nano

actual fun ZonedDateTime.toInstant(): Instant = toInstant()

actual fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime = ZonedDateTime.ofLocal(localDateTime, zone, null)
