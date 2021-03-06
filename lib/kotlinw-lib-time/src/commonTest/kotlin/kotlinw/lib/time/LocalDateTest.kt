package kotlinw.lib.time

import kotlinx.serialization.json.Json
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

    @Test
    fun testSerialization() {
        val localDate = LocalDates.now()
        assertEquals(localDate, Json.parse(LocalDateSerializer, Json.stringify(LocalDateSerializer, localDate)))
    }

    @Test
    fun testOperations() {
        with(LocalDates.of(2019, 12, 29)) {
            assertEquals(LocalDates.of(2020, 1, 2), plusDays(4))
            assertEquals(LocalDates.of(2019, 11, 29), minusDays(30))
        }
    }
}
