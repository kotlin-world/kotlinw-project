package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class LocalTimeTest {
    @Test
    fun testBasics() {
        with(LocalTimes.of(13, 47, 11, 5434665)) {
            assertEquals(13, hour)
            assertEquals(47, minute)
            assertEquals(11, second)
            assertEquals(5434665, nanoOfSecond)
        }
    }
}
