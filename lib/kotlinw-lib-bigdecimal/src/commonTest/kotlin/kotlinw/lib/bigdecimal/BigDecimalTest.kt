package kotlinw.lib.bigdecimal

import kotlin.test.Test
import kotlin.test.assertEquals

class BigDecimalTest {
    @Test
    fun testToString() {
        assertEquals("0", BigDecimals.ZERO.toString())
        assertEquals("1", BigDecimals.ONE.toString())
    }

    @Test
    fun testConstants() {
        assertEquals(BigDecimal(0), BigDecimals.ZERO)
        assertEquals(BigDecimal(1), BigDecimals.ONE)
    }

    @Test
    fun testAdd() {
        assertEquals(BigDecimal("13.10"), BigDecimal("2.05").add(BigDecimal("11.05")))
    }

    @Test
    fun testSubtract() {
        assertEquals(BigDecimal("12.600"), BigDecimal("13.100").subtract(BigDecimal("0.5")))
    }

    @Test
    fun testMultiply() {
        assertEquals(BigDecimal("1.02"), BigDecimal("0.2").multiply(BigDecimal("5.1")))
    }

    @Test
    fun testDivide() {
        assertEquals(BigDecimal("11.3"), BigDecimal("33.9").divide(BigDecimal("3.00")))
        // TODO assertEquals(BigDecimal("1.02"), BigDecimal("0.1").divide(BigDecimal("3000")))
    }
}
