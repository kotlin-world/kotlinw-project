package kotlinw.lib.time

expect interface ChronoZonedDateTime<D : ChronoLocalDate> : Comparable<ChronoZonedDateTime<*>>

expect class ZonedDateTime : ChronoZonedDateTime<LocalDate>

expect val ZonedDateTime.zone: ZoneId

expect val ZonedDateTime.date: LocalDate

expect val ZonedDateTime.time: LocalTime

expect val ZonedDateTime.year: Int

expect val ZonedDateTime.monthValue: Int

expect val ZonedDateTime.dayOfMonth: Int

expect val ZonedDateTime.hour: Int

expect val ZonedDateTime.minute: Int

expect val ZonedDateTime.second: Int

expect val ZonedDateTime.nanoOfSecond: Int

expect fun ZonedDateTime.toInstant(): Instant

object ZonedDateTimes

expect fun ZonedDateTimes.of(zone: ZoneId, localDateTime: LocalDateTime): ZonedDateTime

fun ZonedDateTimes.of(zone: ZoneId, year: Int, monthValue: Int, dayOfMonth: Int, hour: Int, minute: Int, second: Int = 0, nanoOfSecond: Int = 0) =
        ZonedDateTimes.of(zone, LocalDateTimes.of(year, monthValue, dayOfMonth, hour, minute, second, nanoOfSecond))
