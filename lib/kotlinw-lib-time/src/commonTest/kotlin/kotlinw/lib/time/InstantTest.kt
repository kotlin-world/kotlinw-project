package kotlinw.lib.time

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
    }
}
