package kotlinw.lib.bigdecimal

//
// BigDecimal
//

expect class BigDecimal { // TODO implement Number
    constructor(stringValue: String)
    constructor(intValue: Int)
    constructor(longValue: Long)
    constructor(doubleValue: Double)

    override fun toString(): String
}

expect fun BigDecimal.add(other: BigDecimal): BigDecimal

operator fun BigDecimal.plus(other: BigDecimal) = this.add(other)

expect fun BigDecimal.subtract(other: BigDecimal): BigDecimal

operator fun BigDecimal.minus(other: BigDecimal) = this.subtract(other)

expect fun BigDecimal.multiply(other: BigDecimal): BigDecimal

operator fun BigDecimal.times(other: BigDecimal) = this.multiply(other)

expect fun BigDecimal.divide(other: BigDecimal): BigDecimal

operator fun BigDecimal.div(other: BigDecimal) = this.divide(other)

//
// BigDecimals
//

object BigDecimals

expect val BigDecimals.ZERO: BigDecimal
expect val BigDecimals.ONE: BigDecimal

expect fun BigDecimals.of(value: Byte): BigDecimal

expect fun BigDecimals.of(value: Char): BigDecimal

expect fun BigDecimals.of(value: Double): BigDecimal

expect fun BigDecimals.of(value: Float): BigDecimal

expect fun BigDecimals.of(value: Int): BigDecimal

expect fun BigDecimals.of(value: Long): BigDecimal

expect fun BigDecimals.of(value: Short): BigDecimal

