package kotlinw.lib.time

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
}
