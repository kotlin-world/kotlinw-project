package kotlinw.lib.bigdecimal

import kotlinw.js.decimaljs.Decimal

//
// BigDecimal
//

actual class BigDecimal {
    internal val decimalValue: Decimal

    constructor(decimalValue: Decimal) {
        this.decimalValue = decimalValue
    }

    actual constructor(stringValue: String) : this(Decimal(stringValue))

    actual constructor(doubleValue: Double) : this(Decimal(doubleValue))

    actual constructor(intValue: Int) : this(Decimal(intValue))

    actual constructor(longValue: Long) : this(Decimal(longValue.toString()))

//    override fun toByte() = decimalValue.toNumber().toByte()
//
//    override fun toChar() = decimalValue.toNumber().toChar()
//
//    override fun toDouble() = decimalValue.toNumber().toDouble()
//
//    override fun toFloat() = decimalValue.toNumber().toFloat()
//
//    override fun toInt() = decimalValue.toNumber().toInt()
//
//    override fun toLong() = TODO()
//
//    override fun toShort() = decimalValue.toNumber().toShort()

    override fun equals(other: Any?) = other is BigDecimal && decimalValue.equals(other.decimalValue)

    override fun hashCode() = toString().hashCode()

    actual override fun toString() = decimalValue.toString()
}

actual fun BigDecimal.add(other: BigDecimal) = BigDecimal(decimalValue.add(other.decimalValue))

actual fun BigDecimal.subtract(other: BigDecimal) = BigDecimal(decimalValue.sub(other.decimalValue))

actual fun BigDecimal.multiply(other: BigDecimal) = BigDecimal(decimalValue.mul(other.decimalValue))

actual fun BigDecimal.divide(other: BigDecimal) = BigDecimal(decimalValue.div(other.decimalValue))

//
// BigDecimals
//

private val Zero = BigDecimal(0)
actual val BigDecimals.ZERO get() = Zero

private val One = BigDecimal(1)
actual val BigDecimals.ONE get() = One

actual fun BigDecimals.of(value: Byte) = BigDecimal(value.toInt())

actual fun BigDecimals.of(value: Char) = BigDecimal(value.toInt())

actual fun BigDecimals.of(value: Double) = BigDecimal(value)

actual fun BigDecimals.of(value: Float) = BigDecimal(value.toDouble())

actual fun BigDecimals.of(value: Int) = BigDecimal(value)

actual fun BigDecimals.of(value: Long) = BigDecimal(value)

actual fun BigDecimals.of(value: Short) = BigDecimal(value.toInt())
