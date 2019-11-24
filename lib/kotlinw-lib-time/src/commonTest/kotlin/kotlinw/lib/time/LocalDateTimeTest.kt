package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalDateTimeTest {
    @Test
    fun testBasics() {
        with(LocalDateTimes.of(2019, 11, 23, 13, 47, 11, 5434665)) {
            assertEquals(2019, year)
            assertEquals(11, monthValue)
            assertEquals(23, dayOfMonth)
            assertEquals(13, hour)
            assertEquals(47, minute)
            assertEquals(11, second)
            assertEquals(5434665, nanoOfSecond)
        }
    }
}
