package kotlinw.lib.time

import kotlinx.serialization.json.Json
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

    @Test
    fun testSerialization() {
        val localTime = LocalDateTimes.now().time
        assertEquals(localTime, Json.parse(LocalTimeSerializer, Json.stringify(LocalTimeSerializer, localTime)))
    }
}
