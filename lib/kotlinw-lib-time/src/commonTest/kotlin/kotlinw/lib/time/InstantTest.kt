package kotlinw.lib.time

import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class InstantTest {
    @Test
    fun testBasics() {
        val baseEpochMilli = 1574532489318L

        val instant1 = Instants.ofEpochMilli(baseEpochMilli)
        assertEquals(1574532489, instant1.epochSecond)
        assertEquals(318_000_000, instant1.nanoOfSecond)

        assertEquals(instant1, Instants.ofEpochMilli(baseEpochMilli))

        val instant2 = Instants.ofEpochMilli(baseEpochMilli + 1)
        assertTrue(instant1 < instant2)
        assertTrue(instant1 != instant2)

        with(Instants.ofEpochSecond(1574532489, 999_999_999)) {
            assertEquals(1574532489, epochSecond)
            assertEquals(999_999_999, nanoOfSecond)
        }
    }

    @Test
    fun testToIso8601() {
        assertEquals("2019-11-25T13:41:06Z", Instants.ofEpochSecond(1574689266).toIso8601())
        assertEquals("2019-11-25T13:41:06.100Z", Instants.ofEpochSecond(1574689266, 100_000_000).toIso8601())
        assertEquals("2019-11-25T13:41:06.000065416Z", Instants.ofEpochSecond(1574689266, 65_416).toIso8601())
    }

    @Test
    fun testToString() {
        assertEquals("2019-11-25T13:41:06Z", Instants.ofEpochSecond(1574689266).toString())
        assertEquals("2019-11-25T13:41:06.100Z", Instants.ofEpochSecond(1574689266, 100_000_000).toString())
        assertEquals("2019-11-25T13:41:06.000065416Z", Instants.ofEpochSecond(1574689266, 65416).toString())
    }

    @Test
    fun testSerialization() {
        val instant = Instants.now()
        assertEquals(instant, Json.parse(InstantSerializer, Json.stringify(InstantSerializer, instant)))
    }
}
