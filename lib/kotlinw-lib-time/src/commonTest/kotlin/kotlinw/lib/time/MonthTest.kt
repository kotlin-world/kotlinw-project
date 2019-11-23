package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class MonthTest {
    @Test
    fun testBasics() {
        assertEquals(Month.FEBRUARY, Months.of(2))
        assertEquals(2, Month.FEBRUARY.value)
    }
}
