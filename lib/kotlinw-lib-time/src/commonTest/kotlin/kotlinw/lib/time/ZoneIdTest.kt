package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class ZoneIdTest {
    @Test
    fun testBasics() {
        with(ZoneIds.of("UTC")) {
            assertEquals("UTC", id)
            assertEquals(0, getOffset(Instants.now()).totalMinutes)
        }

        with(ZoneIds.of("Europe/Budapest")) {
            assertEquals("Europe/Budapest", id)
            assertEquals(120, getOffset(LocalDateTimes.of(2019, 6, 1, 0, 0).toInstant(this)).totalMinutes)
            assertEquals(60, getOffset(LocalDateTimes.of(2019, 12, 1, 0, 0).toInstant(this)).totalMinutes)
        }
    }
}
