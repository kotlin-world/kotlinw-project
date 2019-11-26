package kotlinw.lib.time

import kotlinw.js.luxon.DateTime
import kotlin.test.Test
import kotlin.test.assertEquals

class LuxonUtilsTest {
    @Test
    fun testToInstant() {
        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val instant = toInstant()
            assertEquals(1574718118333L, toMillis().toLong())
            assertEquals(toMillis().toLong(), instant.toEpochMilli())
            assertEquals(1574718118L, instant.epochSecond)
            assertEquals(333_000_000, instant.nanoOfSecond)
        }

        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val instant = toInstant(1)
            assertEquals(1574718118333L, toMillis().toLong())
            assertEquals(toMillis().toLong(), instant.toEpochMilli())
            assertEquals(1574718118L, instant.epochSecond)
            assertEquals(333_000_001, instant.nanoOfSecond)
        }

        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 999)) {
            val instant = toInstant(999_999)
            assertEquals(1574718118999L, toMillis().toLong())
            assertEquals(toMillis().toLong(), instant.toEpochMilli())
            assertEquals(1574718118L, instant.epochSecond)
            assertEquals(999_999_999, instant.nanoOfSecond)
        }
    }

    @Test
    fun testToLocalDate() {
        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val localDate = toLocalDate()
            assertEquals(2019, localDate.year)
            assertEquals(11, localDate.monthValue)
            assertEquals(25, localDate.dayOfMonth)
        }
    }

    @Test
    fun testToLocalTime() {
        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val localTime = toLocalTime()
            assertEquals(21, localTime.hour)
            assertEquals(41, localTime.minute)
            assertEquals(58, localTime.second)
            assertEquals(333_000_000, localTime.nanoOfSecond)
        }

        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val localTime = toLocalTime(1)
            assertEquals(21, localTime.hour)
            assertEquals(41, localTime.minute)
            assertEquals(58, localTime.second)
            assertEquals(333_000_001, localTime.nanoOfSecond)
        }
    }

    @Test
    fun testToLocalDateTime() {
        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val localDateTime = toLocalDateTime()
            assertEquals(2019, localDateTime.year)
            assertEquals(11, localDateTime.monthValue)
            assertEquals(25, localDateTime.dayOfMonth)
            assertEquals(21, localDateTime.hour)
            assertEquals(41, localDateTime.minute)
            assertEquals(58, localDateTime.second)
            assertEquals(333_000_000, localDateTime.nanoOfSecond)
        }

        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val localDateTime = toLocalDateTime(1)
            assertEquals(2019, localDateTime.year)
            assertEquals(11, localDateTime.monthValue)
            assertEquals(25, localDateTime.dayOfMonth)
            assertEquals(21, localDateTime.hour)
            assertEquals(41, localDateTime.minute)
            assertEquals(58, localDateTime.second)
            assertEquals(333_000_001, localDateTime.nanoOfSecond)
        }
    }

    @Test
    fun testToZonedDateTime() {
        with(DateTime.fromMillis(1574718118333L.toDouble())) {
            val zonedDateTime = toZonedDateTime(ZoneIds.of("UTC+6"))
            assertEquals(ZoneIds.of("UTC+06:00"), zonedDateTime.zone)
            assertEquals(2019, zonedDateTime.year)
            assertEquals(11, zonedDateTime.monthValue)
            assertEquals(26, zonedDateTime.dayOfMonth)
            assertEquals(3, zonedDateTime.hour)
            assertEquals(41, zonedDateTime.minute)
            assertEquals(58, zonedDateTime.second)
            assertEquals(333_000_000, zonedDateTime.nanoOfSecond)
        }

        with(DateTime.utc(2019, 11, 25, 21, 41, 58, 333)) {
            val zonedDateTime = toZonedDateTime(ZoneIds.of("UTC+6"), 1)
            assertEquals(ZoneIds.of("UTC+06:00"), zonedDateTime.zone)
            assertEquals(2019, zonedDateTime.year)
            assertEquals(11, zonedDateTime.monthValue)
            assertEquals(26, zonedDateTime.dayOfMonth)
            assertEquals(3, zonedDateTime.hour)
            assertEquals(41, zonedDateTime.minute)
            assertEquals(58, zonedDateTime.second)
            assertEquals(333_000_001, zonedDateTime.nanoOfSecond)
        }
    }

    @Test
    fun faszom() {
        val o = ZonedDateTimes.of(ZoneIds.local, 2019, 11, 25, 14, 41, 6, 999_999_999)
        val i = o.toInstant()
        assertEquals(999_999_999, i.nanoOfSecond)
        assertEquals(999_999, i.nanoOfSecond.rem(1_000_000))
        assertEquals(999, i.dateTime.millisecond)
        val r = i.dateTime.toZonedDateTime(ZoneIds.local, i.nanoOfSecond.rem(1_000_000))
        assertEquals(o, r)
    }
}
