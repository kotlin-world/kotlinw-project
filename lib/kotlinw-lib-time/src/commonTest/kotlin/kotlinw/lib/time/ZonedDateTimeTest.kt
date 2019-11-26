package kotlinw.lib.time

import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class ZonedDateTimeTest {
    @Test
    fun testBasics() {
        with(ZonedDateTimes.of(ZoneIds.of("Europe/Budapest"), 2019, 11, 24, 18, 59, 50, 444)) {
            assertEquals(ZoneIds.of("Europe/Budapest"), zone)
            assertEquals(2019, year)
            assertEquals(11, monthValue)
            assertEquals(24, dayOfMonth)
            assertEquals(18, hour)
            assertEquals(59, minute)
            assertEquals(50, second)
            assertEquals(444, nanoOfSecond)
        }
    }

    @Test
    fun testSerialization() {
        val zonedDateTime = ZonedDateTimes.now()
        assertEquals(zonedDateTime, Json.parse(ZonedDateTimeSerializer, Json.stringify(ZonedDateTimeSerializer, zonedDateTime)))
    }

    @Test
    fun testConversionToAndFromInstant() {
        val o1 = ZonedDateTimes.of(ZoneIds.local, 2019, 11, 25, 14, 41, 6, 65416)
        with(o1.toInstant()) {
            assertEquals(1574689266, epochSecond)
            assertEquals(65416, nanoOfSecond)
            assertEquals(o1, toZonedDateTime(ZoneIds.local))
        }

        val o2 = ZonedDateTimes.of(ZoneIds.local, 2019, 11, 25, 14, 41, 6, 999_999_999)
        with(o2.toInstant()) {
            assertEquals(1574689266, epochSecond)
            assertEquals(999_999_999, nanoOfSecond)
            assertEquals(999_999_999, toZonedDateTime(ZoneIds.local).nanoOfSecond)
            assertEquals(o2, toZonedDateTime(ZoneIds.local))
        }
    }

    @Test
    fun testWithZoneSameLocal() {
        val o1 = ZonedDateTimes.of(ZoneIds.of("Europe/Budapest"), 2019, 11, 25, 14, 41, 6, 104_654_160)
        with(o1.withZoneSameLocal(ZoneOffsets.Utc)) {
            assertEquals(ZoneOffsets.Utc, zone)
            assertEquals(o1.localDateTime, localDateTime)
        }

        val o2 = ZonedDateTimes.of(ZoneIds.of("Europe/Budapest"), 2019, 11, 25, 14, 41, 6, 1)
        with(o2.withZoneSameLocal(ZoneIds.of("UTC+7"))) {
            assertEquals(ZoneIds.of("UTC+07:00"), zone)
            assertEquals(o2.localDateTime, localDateTime)
        }
    }
}
