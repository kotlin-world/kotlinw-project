package kotlinw.lib.time

import kotlinx.serialization.json.Json
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

    @Test
    fun testLocal() {
        assertEquals(ZoneIds.of("Europe/Budapest"), ZoneIds.local)
    }

    @Test
    fun testSerialization() {
        val utc = ZoneOffsets.Utc
        assertEquals(utc, Json.parse(ZoneIdSerializer, Json.stringify(ZoneIdSerializer, utc)))

        val europeBudapest = ZoneIds.of("Europe/Budapest")
        assertEquals(europeBudapest, Json.parse(ZoneIdSerializer, Json.stringify(ZoneIdSerializer, europeBudapest)))

        val utc2 = ZoneIds.of("UTC+02:00")
        assertEquals(utc2, Json.parse(ZoneIdSerializer, Json.stringify(ZoneIdSerializer, utc2)))
    }
}
