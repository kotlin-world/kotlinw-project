package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class ZoneOffsetTest {
    @Test
    fun testBasics() {
        with(ZoneOffsets.Utc) {
            assertEquals(0, getOffset(Instants.now()).totalMinutes)
        }
    }
}
