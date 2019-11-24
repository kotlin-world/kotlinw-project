package kotlinw.lib.time

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
}
