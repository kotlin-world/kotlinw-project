package kotlinw.lib.time

actual typealias ChronoLocalDateTime<D> = java.time.chrono.ChronoLocalDateTime<D>

actual typealias LocalDateTime = java.time.LocalDateTime

actual val LocalDateTime.date: LocalDate get() = LocalDate.of(year, monthValue, dayOfMonth)

actual val LocalDateTime.time: LocalTime get() = LocalTime.of(hour, minute, second, nanoOfSecond)

actual val LocalDateTime.year: Int get() = year

actual val LocalDateTime.monthValue: Int get() = monthValue

actual val LocalDateTime.dayOfMonth: Int get() = dayOfMonth

actual val LocalDateTime.hour: Int get() = hour

actual val LocalDateTime.minute: Int get() = minute

actual val LocalDateTime.second: Int get() = second

actual val LocalDateTime.nanoOfSecond: Int get() = nano

actual fun LocalDateTimes.of(date: LocalDate, time: LocalTime): LocalDateTime = LocalDateTime.of(date, time)

actual fun LocalDateTimes.of(year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int, nanoOfSecond: Int): LocalDateTime =
        LocalDateTime.of(year, monthValue, dayOfMonth, hour, minute, second, nanoOfSecond)

actual fun LocalDateTime.atZone(zone: ZoneId): ZonedDateTime = atZone(zone)
