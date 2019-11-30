package kotlinw.lib.bigdecimal

//
// BigDecimal
//

actual typealias BigDecimal = java.math.BigDecimal

actual fun BigDecimal.add(other: BigDecimal): BigDecimal = this.add(other)

actual fun BigDecimal.subtract(other: BigDecimal): BigDecimal = this.subtract(other)

actual fun BigDecimal.multiply(other: BigDecimal): BigDecimal = this.multiply(other)

actual fun BigDecimal.divide(other: BigDecimal): BigDecimal = this.divide(other)

//
// BigDecimals
//

actual val BigDecimals.ZERO get() = BigDecimal.ZERO

actual val BigDecimals.ONE get() = BigDecimal.ONE

actual fun BigDecimals.of(value: Byte) = BigDecimal(value.toInt())

actual fun BigDecimals.of(value: Char) = BigDecimal(value.toInt())

actual fun BigDecimals.of(value: Double) = BigDecimal(value)

actual fun BigDecimals.of(value: Float) = BigDecimal(value.toDouble())

actual fun BigDecimals.of(value: Int) = BigDecimal(value)

actual fun BigDecimals.of(value: Long) = BigDecimal(value)

actual fun BigDecimals.of(value: Short) = BigDecimal(value.toInt())
