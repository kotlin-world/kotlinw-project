package kotlinw.lib.time

expect interface ChronoLocalDateTime<D : ChronoLocalDate> : Comparable<ChronoLocalDateTime<*>>

expect class LocalDateTime : ChronoLocalDateTime<LocalDate>

expect val LocalDateTime.date: LocalDate

expect val LocalDateTime.time: LocalTime

expect val LocalDateTime.year: Int

expect val LocalDateTime.monthValue: Int

expect val LocalDateTime.dayOfMonth: Int

expect val LocalDateTime.hour: Int

expect val LocalDateTime.minute: Int

expect val LocalDateTime.second: Int

expect val LocalDateTime.nanoOfSecond: Int

expect fun LocalDateTime.atZone(zone: ZoneId): ZonedDateTime

fun LocalDateTime.toInstant(zone: ZoneId) = atZone(zone).toInstant()

object LocalDateTimes

expect fun LocalDateTimes.of(date: LocalDate, time: LocalTime): LocalDateTime

expect fun LocalDateTimes.of(year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0): LocalDateTime
