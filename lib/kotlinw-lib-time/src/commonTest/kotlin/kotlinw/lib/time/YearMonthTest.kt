package kotlinw.lib.time

import kotlinx.serialization.json.Json
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

    @Test
    fun testSerialization() {
        val yearMonth = YearMonths.of(2019, 11)
        assertEquals(yearMonth, Json.parse(YearMonthSerializer, Json.stringify(YearMonthSerializer, yearMonth)))
    }
}
