package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class YearMonthTest {
    @Test
    fun testBasics() {
        with(YearMonths.of(2019, 11)) {
            assertEquals(2019, year)
            assertEquals(11, monthValue)
            assertEquals(Month.NOVEMBER, month)
        }
    }
}
