@file:JsModule("decimal.js")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

package kotlinw.js.decimaljs

external open class Decimal {
    constructor(stringValue: String)
    constructor(numberValue: Number)
    constructor(intValue: Int)
    constructor(doubleValue: Double)
    constructor(decimalValue: Decimal)

    open var d: Array<Number>
    open var e: Number
    open var s: Number
    open var name: String
    open fun absoluteValue(): Decimal
    open fun abs(): Decimal
    open fun ceil(): Decimal
    open fun comparedTo(n: String): Number
    open fun comparedTo(n: Number): Number
    open fun comparedTo(n: Decimal): Number
    open fun cmp(n: String): Number
    open fun cmp(n: Number): Number
    open fun cmp(n: Decimal): Number
    open fun cosine(): Decimal
    open fun cos(): Decimal
    open fun cubeRoot(): Decimal
    open fun cbrt(): Decimal
    open fun decimalPlaces(): Number
    open fun dp(): Number
    open fun dividedBy(n: String): Decimal
    open fun dividedBy(n: Number): Decimal
    open fun dividedBy(n: Decimal): Decimal
    open fun div(n: String): Decimal
    open fun div(n: Number): Decimal
    open fun div(n: Decimal): Decimal
    open fun dividedToIntegerBy(n: String): Decimal
    open fun dividedToIntegerBy(n: Number): Decimal
    open fun dividedToIntegerBy(n: Decimal): Decimal
    open fun divToInt(n: String): Decimal
    open fun divToInt(n: Number): Decimal
    open fun divToInt(n: Decimal): Decimal
    open fun equals(n: String): Boolean
    open fun equals(n: Number): Boolean
    open fun equals(n: Decimal): Boolean
    open fun eq(n: String): Boolean
    open fun eq(n: Number): Boolean
    open fun eq(n: Decimal): Boolean
    open fun floor(): Decimal
    open fun greaterThan(n: String): Boolean
    open fun greaterThan(n: Number): Boolean
    open fun greaterThan(n: Decimal): Boolean
    open fun gt(n: String): Boolean
    open fun gt(n: Number): Boolean
    open fun gt(n: Decimal): Boolean
    open fun greaterThanOrEqualTo(n: String): Boolean
    open fun greaterThanOrEqualTo(n: Number): Boolean
    open fun greaterThanOrEqualTo(n: Decimal): Boolean
    open fun gte(n: String): Boolean
    open fun gte(n: Number): Boolean
    open fun gte(n: Decimal): Boolean
    open fun hyperbolicCosine(): Decimal
    open fun cosh(): Decimal
    open fun hyperbolicSine(): Decimal
    open fun sinh(): Decimal
    open fun hyperbolicTangent(): Decimal
    open fun tanh(): Decimal
    open fun inverseCosine(): Decimal
    open fun acos(): Decimal
    open fun inverseHyperbolicCosine(): Decimal
    open fun acosh(): Decimal
    open fun inverseHyperbolicSine(): Decimal
    open fun asinh(): Decimal
    open fun inverseHyperbolicTangent(): Decimal
    open fun atanh(): Decimal
    open fun inverseSine(): Decimal
    open fun asin(): Decimal
    open fun inverseTangent(): Decimal
    open fun atan(): Decimal
    open fun isFinite(): Boolean
    open fun isInteger(): Boolean
    open fun isInt(): Boolean
    open fun isNaN(): Boolean
    open fun isNegative(): Boolean
    open fun isNeg(): Boolean
    open fun isPositive(): Boolean
    open fun isPos(): Boolean
    open fun isZero(): Boolean
    open fun lessThan(n: String): Boolean
    open fun lessThan(n: Number): Boolean
    open fun lessThan(n: Decimal): Boolean
    open fun lt(n: String): Boolean
    open fun lt(n: Number): Boolean
    open fun lt(n: Decimal): Boolean
    open fun lessThanOrEqualTo(n: String): Boolean
    open fun lessThanOrEqualTo(n: Number): Boolean
    open fun lessThanOrEqualTo(n: Decimal): Boolean
    open fun lte(n: String): Boolean
    open fun lte(n: Number): Boolean
    open fun lte(n: Decimal): Boolean
    open fun logarithm(n: String = definedExternally): Decimal
    open fun logarithm(n: Number = definedExternally): Decimal
    open fun logarithm(n: Decimal = definedExternally): Decimal
    open fun log(n: String = definedExternally): Decimal
    open fun log(n: Number = definedExternally): Decimal
    open fun log(n: Decimal = definedExternally): Decimal
    open fun minus(n: String): Decimal
    open fun minus(n: Number): Decimal
    open fun minus(n: Decimal): Decimal
    open fun sub(n: String): Decimal
    open fun sub(n: Number): Decimal
    open fun sub(n: Decimal): Decimal
    open fun modulo(n: String): Decimal
    open fun modulo(n: Number): Decimal
    open fun modulo(n: Decimal): Decimal
    open fun mod(n: String): Decimal
    open fun mod(n: Number): Decimal
    open fun mod(n: Decimal): Decimal
    open fun naturalExponential(): Decimal
    open fun exp(): Decimal
    open fun naturalLogarithm(): Decimal
    open fun ln(): Decimal
    open fun negated(): Decimal
    open fun neg(): Decimal
    open fun plus(n: String): Decimal
    open fun plus(n: Number): Decimal
    open fun plus(n: Decimal): Decimal
    open fun add(n: String): Decimal
    open fun add(n: Number): Decimal
    open fun add(n: Decimal): Decimal
    open fun precision(includeZeros: Boolean? = definedExternally): Number
    open fun sd(includeZeros: Boolean? = definedExternally): Number
    open fun round(): Decimal
    open fun sine(): Decimal
    open fun sin(): Decimal
    open fun squareRoot(): Decimal
    open fun sqrt(): Decimal
    open fun tangent(): Decimal
    open fun tan(): Decimal
    open fun times(n: String): Decimal
    open fun times(n: Number): Decimal
    open fun times(n: Decimal): Decimal
    open fun mul(n: String): Decimal
    open fun mul(n: Number): Decimal
    open fun mul(n: Decimal): Decimal
    open fun toBinary(significantDigits: Number? = definedExternally): String
    open fun toBinary(significantDigits: Number, rounding: String /* 0 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 1 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 2 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 3 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 4 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 5 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 6 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 7 */): String
    open fun toBinary(significantDigits: Number, rounding: String /* 8 */): String
    open fun toDecimalPlaces(decimalPlaces: Number? = definedExternally): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 0 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 1 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 2 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 3 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 4 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 5 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 6 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 7 */): Decimal
    open fun toDecimalPlaces(decimalPlaces: Number, rounding: String /* 8 */): Decimal
    open fun toDP(decimalPlaces: Number? = definedExternally): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 0 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 1 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 2 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 3 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 4 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 5 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 6 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 7 */): Decimal
    open fun toDP(decimalPlaces: Number, rounding: String /* 8 */): Decimal
    open fun toExponential(decimalPlaces: Number? = definedExternally): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 0 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 1 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 2 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 3 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 4 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 5 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 6 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 7 */): String
    open fun toExponential(decimalPlaces: Number, rounding: String /* 8 */): String
    open fun toFixed(decimalPlaces: Number? = definedExternally): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 0 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 1 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 2 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 3 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 4 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 5 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 6 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 7 */): String
    open fun toFixed(decimalPlaces: Number, rounding: String /* 8 */): String
    open fun toFraction(max_denominator: String = definedExternally): Array<Decimal>
    open fun toFraction(max_denominator: Number = definedExternally): Array<Decimal>
    open fun toFraction(max_denominator: Decimal = definedExternally): Array<Decimal>
    open fun toHexadecimal(significantDigits: Number? = definedExternally): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 0 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 1 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 2 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 3 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 4 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 5 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 6 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 7 */): String
    open fun toHexadecimal(significantDigits: Number, rounding: String /* 8 */): String
    open fun toHex(significantDigits: Number? = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 0 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 1 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 2 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 3 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 4 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 5 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 6 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 7 */ = definedExternally): String
    open fun toHex(significantDigits: Number, rounding: String /* 8 */ = definedExternally): String
    open fun toJSON(): String
    open fun toNearest(n: String, rounding: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 */ = definedExternally): Decimal
    open fun toNearest(n: Number, rounding: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 */ = definedExternally): Decimal
    open fun toNearest(n: Decimal, rounding: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 */ = definedExternally): Decimal
    open fun toNumber(): Number
    open fun toOctal(significantDigits: Number? = definedExternally): String
    open fun toOctal(significantDigits: Number, rounding: String /* 0 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 1 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 2 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 3 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 4 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 5 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 6 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 7 */): String
    open fun toOctal(significantDigits: Number, rounding: String /* 8 */): String
    open fun toPower(n: String): Decimal
    open fun toPower(n: Number): Decimal
    open fun toPower(n: Decimal): Decimal
    open fun pow(n: String): Decimal
    open fun pow(n: Number): Decimal
    open fun pow(n: Decimal): Decimal
    open fun toPrecision(significantDigits: Number? = definedExternally): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 0 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 1 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 2 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 3 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 4 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 5 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 6 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 7 */): String
    open fun toPrecision(significantDigits: Number, rounding: String /* 8 */): String
    open fun toSignificantDigits(significantDigits: Number? = definedExternally): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 0 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 1 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 2 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 3 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 4 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 5 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 6 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 7 */): Decimal
    open fun toSignificantDigits(significantDigits: Number, rounding: String /* 8 */): Decimal
    open fun toSD(significantDigits: Number? = definedExternally): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 0 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 1 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 2 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 3 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 4 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 5 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 6 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 7 */): Decimal
    open fun toSD(significantDigits: Number, rounding: String /* 8 */): Decimal
    override fun toString(): String
    open fun truncated(): Decimal
    open fun trunc(): Decimal
    open fun valueOf(): String
    open fun logarithm(): Decimal
    open fun log(): Decimal
    open fun toFraction(): Array<Decimal>
    open fun toHex(significantDigits: Number): String
    interface Config {
        var precision: Number?
        var rounding: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 */
        var toExpNeg: Number?
        var toExpPos: Number?
        var minE: Number?
        var maxE: Number?
        var crypto: Boolean?
        var modulo: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 */
        var defaults: Boolean?
    }

    companion object {
        fun abs(n: String): Decimal
        fun abs(n: Number): Decimal
        fun abs(n: Decimal): Decimal
        fun acos(n: String): Decimal
        fun acos(n: Number): Decimal
        fun acos(n: Decimal): Decimal
        fun acosh(n: String): Decimal
        fun acosh(n: Number): Decimal
        fun acosh(n: Decimal): Decimal
        fun add(x: String, y: String): Decimal
        fun add(x: String, y: Number): Decimal
        fun add(x: String, y: Decimal): Decimal
        fun add(x: Number, y: String): Decimal
        fun add(x: Number, y: Number): Decimal
        fun add(x: Number, y: Decimal): Decimal
        fun add(x: Decimal, y: String): Decimal
        fun add(x: Decimal, y: Number): Decimal
        fun add(x: Decimal, y: Decimal): Decimal
        fun asin(n: String): Decimal
        fun asin(n: Number): Decimal
        fun asin(n: Decimal): Decimal
        fun asinh(n: String): Decimal
        fun asinh(n: Number): Decimal
        fun asinh(n: Decimal): Decimal
        fun atan(n: String): Decimal
        fun atan(n: Number): Decimal
        fun atan(n: Decimal): Decimal
        fun atanh(n: String): Decimal
        fun atanh(n: Number): Decimal
        fun atanh(n: Decimal): Decimal
        fun atan2(y: String, x: String): Decimal
        fun atan2(y: String, x: Number): Decimal
        fun atan2(y: String, x: Decimal): Decimal
        fun atan2(y: Number, x: String): Decimal
        fun atan2(y: Number, x: Number): Decimal
        fun atan2(y: Number, x: Decimal): Decimal
        fun atan2(y: Decimal, x: String): Decimal
        fun atan2(y: Decimal, x: Number): Decimal
        fun atan2(y: Decimal, x: Decimal): Decimal
        fun cbrt(n: String): Decimal
        fun cbrt(n: Number): Decimal
        fun cbrt(n: Decimal): Decimal
        fun ceil(n: String): Decimal
        fun ceil(n: Number): Decimal
        fun ceil(n: Decimal): Decimal
        // TODO fun clone(object: Config? = definedExternally): Decimal.Constructor
        // TODO fun config(object: Config): Decimal.Constructor
        fun cos(n: String): Decimal

        fun cos(n: Number): Decimal
        fun cos(n: Decimal): Decimal
        fun cosh(n: String): Decimal
        fun cosh(n: Number): Decimal
        fun cosh(n: Decimal): Decimal
        fun div(x: String, y: String): Decimal
        fun div(x: String, y: Number): Decimal
        fun div(x: String, y: Decimal): Decimal
        fun div(x: Number, y: String): Decimal
        fun div(x: Number, y: Number): Decimal
        fun div(x: Number, y: Decimal): Decimal
        fun div(x: Decimal, y: String): Decimal
        fun div(x: Decimal, y: Number): Decimal
        fun div(x: Decimal, y: Decimal): Decimal
        fun exp(n: String): Decimal
        fun exp(n: Number): Decimal
        fun exp(n: Decimal): Decimal
        fun floor(n: String): Decimal
        fun floor(n: Number): Decimal
        fun floor(n: Decimal): Decimal
        fun hypot(vararg n: String): Decimal
        fun hypot(vararg n: Number): Decimal
        fun hypot(vararg n: Decimal): Decimal
        fun isDecimal(obj: Any): Boolean
        fun ln(n: String): Decimal
        fun ln(n: Number): Decimal
        fun ln(n: Decimal): Decimal
        fun log(n: String, base: String = definedExternally): Decimal
        fun log(n: String, base: Number = definedExternally): Decimal
        fun log(n: String, base: Decimal = definedExternally): Decimal
        fun log(n: Number, base: String = definedExternally): Decimal
        fun log(n: Number, base: Number = definedExternally): Decimal
        fun log(n: Number, base: Decimal = definedExternally): Decimal
        fun log(n: Decimal, base: String = definedExternally): Decimal
        fun log(n: Decimal, base: Number = definedExternally): Decimal
        fun log(n: Decimal, base: Decimal = definedExternally): Decimal
        fun log2(n: String): Decimal
        fun log2(n: Number): Decimal
        fun log2(n: Decimal): Decimal
        fun log10(n: String): Decimal
        fun log10(n: Number): Decimal
        fun log10(n: Decimal): Decimal
        fun max(vararg n: String): Decimal
        fun max(vararg n: Number): Decimal
        fun max(vararg n: Decimal): Decimal
        fun min(vararg n: String): Decimal
        fun min(vararg n: Number): Decimal
        fun min(vararg n: Decimal): Decimal
        fun mod(x: String, y: String): Decimal
        fun mod(x: String, y: Number): Decimal
        fun mod(x: String, y: Decimal): Decimal
        fun mod(x: Number, y: String): Decimal
        fun mod(x: Number, y: Number): Decimal
        fun mod(x: Number, y: Decimal): Decimal
        fun mod(x: Decimal, y: String): Decimal
        fun mod(x: Decimal, y: Number): Decimal
        fun mod(x: Decimal, y: Decimal): Decimal
        fun mul(x: String, y: String): Decimal
        fun mul(x: String, y: Number): Decimal
        fun mul(x: String, y: Decimal): Decimal
        fun mul(x: Number, y: String): Decimal
        fun mul(x: Number, y: Number): Decimal
        fun mul(x: Number, y: Decimal): Decimal
        fun mul(x: Decimal, y: String): Decimal
        fun mul(x: Decimal, y: Number): Decimal
        fun mul(x: Decimal, y: Decimal): Decimal
        // TODO fun noConflict(): Decimal.Constructor
        fun pow(base: String, exponent: String): Decimal

        fun pow(base: String, exponent: Number): Decimal
        fun pow(base: String, exponent: Decimal): Decimal
        fun pow(base: Number, exponent: String): Decimal
        fun pow(base: Number, exponent: Number): Decimal
        fun pow(base: Number, exponent: Decimal): Decimal
        fun pow(base: Decimal, exponent: String): Decimal
        fun pow(base: Decimal, exponent: Number): Decimal
        fun pow(base: Decimal, exponent: Decimal): Decimal
        fun random(significantDigits: Number? = definedExternally): Decimal
        fun round(n: String): Decimal
        fun round(n: Number): Decimal
        fun round(n: Decimal): Decimal
        // TODO fun set(object: Config): Decimal.Constructor
        fun sign(n: String): Decimal

        fun sign(n: Number): Decimal
        fun sign(n: Decimal): Decimal
        fun sin(n: String): Decimal
        fun sin(n: Number): Decimal
        fun sin(n: Decimal): Decimal
        fun sinh(n: String): Decimal
        fun sinh(n: Number): Decimal
        fun sinh(n: Decimal): Decimal
        fun sqrt(n: String): Decimal
        fun sqrt(n: Number): Decimal
        fun sqrt(n: Decimal): Decimal
        fun sub(x: String, y: String): Decimal
        fun sub(x: String, y: Number): Decimal
        fun sub(x: String, y: Decimal): Decimal
        fun sub(x: Number, y: String): Decimal
        fun sub(x: Number, y: Number): Decimal
        fun sub(x: Number, y: Decimal): Decimal
        fun sub(x: Decimal, y: String): Decimal
        fun sub(x: Decimal, y: Number): Decimal
        fun sub(x: Decimal, y: Decimal): Decimal
        fun tan(n: String): Decimal
        fun tan(n: Number): Decimal
        fun tan(n: Decimal): Decimal
        fun tanh(n: String): Decimal
        fun tanh(n: Number): Decimal
        fun tanh(n: Decimal): Decimal
        fun trunc(n: String): Decimal
        fun trunc(n: Number): Decimal
        fun trunc(n: Decimal): Decimal
        // TODO var default: Decimal.Constructor
        // TODO var Decimal: Decimal.Constructor
        var precision: Number
        var rounding: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 */
        var toExpNeg: Number
        var toExpPos: Number
        var minE: Number
        var maxE: Number
        var crypto: Boolean
        var modulo: dynamic /* 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 */
        var ROUND_UP: String /* 0 */
        var ROUND_DOWN: String /* 1 */
        var ROUND_CEIL: String /* 2 */
        var ROUND_FLOOR: String /* 3 */
        var ROUND_HALF_UP: String /* 4 */
        var ROUND_HALF_DOWN: String /* 5 */
        var ROUND_HALF_EVEN: String /* 6 */
        var ROUND_HALF_CEIL: String /* 7 */
        var ROUND_HALF_FLOOR: String /* 8 */
        var EUCLID: String /* 9 */
        fun log(n: String): Decimal
        fun log(n: Number): Decimal
        fun log(n: Decimal): Decimal
    }
}
