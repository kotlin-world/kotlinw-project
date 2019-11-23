package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalDateTest {
    @Test
    fun testBasics() {
        with(LocalDates.of(2019, 11, 23)) {
            assertEquals(2019, year)
            assertEquals(11, monthValue)
            assertEquals(Month.NOVEMBER, month)
            assertEquals(23, dayOfMonth)
        }
    }
}
