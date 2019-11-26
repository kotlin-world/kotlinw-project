package kotlinw.lib.time

import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class YearTest {
    @Test
    fun testBasics() {
        with(Years.of(2019)) {
            assertEquals(2019, value)
            assertFalse(isLeap)
        }

        with(Years.of(2020)) {
            assertEquals(2020, value)
            assertTrue(isLeap)
        }
    }

    @Test
    fun testSerialization() {
        val year = Years.of(2019)
        assertEquals(year, Json.parse(YearSerializer, Json.stringify(YearSerializer, year)))
    }
}
