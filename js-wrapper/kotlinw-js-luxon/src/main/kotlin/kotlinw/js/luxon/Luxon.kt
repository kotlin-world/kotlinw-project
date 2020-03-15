@file:JsModule("luxon")

package kotlinw.js.luxon

import kotlin.js.Date
import kotlin.js.Json
import kotlin.js.RegExp

external interface ZoneOptions {
    var keepLocalTime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepCalendarTime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToRelativeOptions {
    var base: DateTime?
        get() = definedExternally
        set(value) = definedExternally
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var style: dynamic /* 'narrow' | 'short' | 'long' */
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* 'years' | 'quarters' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' */
        get() = definedExternally
        set(value) = definedExternally
    var round: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var padding: Number?
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: dynamic /* 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToRelativeCalendarOptions {
    var base: DateTime?
        get() = definedExternally
        set(value) = definedExternally
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var unit: dynamic /* 'years' | 'quarters' | 'months' | 'weeks' | 'days' | 'hours' | 'minutes' | 'seconds' */
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: dynamic /* 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToSQLOptions {
    var includeOffset: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeZone: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToISOTimeOptions {
    var suppressMilliseconds: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var suppressSeconds: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var includeOffset: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LocaleOptions {
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var outputCalendar: dynamic /* 'buddhist' | 'chinese' | 'coptic' | 'ethioaa' | 'ethiopic' | 'gregory' | 'hebrew' | 'indian' | 'islamic' | 'islamicc' | 'iso8601' | 'japanese' | 'persian' | 'roc' */
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: dynamic /* 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DateTimeOptions : LocaleOptions {
    var zone: dynamic /* String | Zone */
        get() = definedExternally
        set(value) = definedExternally
    var setZone: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DateTimeJSOptions : LocaleOptions {
    var zone: dynamic /* String | Zone */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DateObjectUnits {
    var year: Number?
        get() = definedExternally
        set(value) = definedExternally
    var month: Number?
        get() = definedExternally
        set(value) = definedExternally
    var day: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ordinal: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weekYear: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weekNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weekday: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hour: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minute: Number?
        get() = definedExternally
        set(value) = definedExternally
    var second: Number?
        get() = definedExternally
        set(value) = definedExternally
    var millisecond: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DateObject : DateObjectUnits, LocaleOptions {
    var zone: dynamic /* String | Zone */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DiffOptions {
    var conversionAccuracy: dynamic /* 'casual' | 'longterm' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    var literal: Boolean
    var `val`: String
}

external interface ExplainedFormat {
    var input: String
    var tokens: Array<`T$0`>
    var regex: RegExp?
        get() = definedExternally
        set(value) = definedExternally
    // TODO
//    var rawMatches: RegExpMatchArray?
//        get() = definedExternally
//        set(value) = definedExternally
    var matches: Json?
        get() = definedExternally
        set(value) = definedExternally
    var result: Json?
        get() = definedExternally
        set(value) = definedExternally
    var zone: Zone?
        get() = definedExternally
        set(value) = definedExternally
    var invalidReason: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1` {
    var includeConfig: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

open external class DateTime {
    open val day: Number
    open val daysInMonth: Number
    open val daysInYear: Number
    open val hour: Number
    open val invalidReason: String?
    open val invalidExplanation: String?
    open val isInDST: Boolean
    open val isInLeapYear: Boolean
    open val isOffsetFixed: Boolean
    open val isValid: Boolean
    open val locale: String
    open val millisecond: Number
    open val minute: Number
    open val month: Number
    open val monthLong: String
    open val monthShort: String
    open val numberingSystem: String
    open val offset: Number
    open val offsetNameLong: String
    open val offsetNameShort: String
    open val ordinal: Number
    open val outputCalendar: String
    open val quarter: Number
    open val second: Number
    open val weekNumber: Number
    open val weekYear: Number
    open val weekday: Number
    open val weekdayLong: String
    open val weekdayShort: String
    open val weeksInWeekYear: Number
    open val year: Number
    open val zoneName: String
    open val zone: Zone
    open fun diff(other: DateTime, unit: DurationUnit? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun diff(other: DateTime, unit: Array<DurationUnit>? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun diffNow(unit: DurationUnit? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun diffNow(unit: Array<DurationUnit>? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun endOf(unit: DurationUnit): DateTime
    open fun equals(other: DateTime): Boolean
    open fun get(unit: Any): Number
    open fun hasSame(other: DateTime, unit: DurationUnit): Boolean
    open fun minus(duration: Duration): DateTime
    open fun minus(duration: Number): DateTime
    open fun minus(duration: DurationObject): DateTime
    open fun plus(duration: Duration): DateTime
    open fun plus(duration: Number): DateTime
    open fun plus(duration: DurationObject): DateTime
    open fun reconfigure(properties: LocaleOptions): DateTime
    // TODO open fun resolvedLocaleOpts(options: DateTimeFormatOptions? = definedExternally): Intl.ResolvedDateTimeFormatOptions
    open fun set(values: DateObjectUnits): DateTime

    open fun setLocale(locale: String): DateTime
    open fun setZone(zone: String, options: ZoneOptions? = definedExternally): DateTime
    open fun setZone(zone: Zone, options: ZoneOptions? = definedExternally): DateTime
    open fun startOf(unit: DurationUnit): DateTime
    open fun toBSON(): Date
    open fun toFormat(format: String, options: DateTimeFormatOptions? = definedExternally): String
    open fun toHTTP(): String
    open fun toISO(options: ToISOTimeOptions? = definedExternally): String
    open fun toISODate(): String
    open fun toISOTime(options: ToISOTimeOptions? = definedExternally): String
    open fun toISOWeekDate(): String
    open fun toJSDate(): Date
    open fun toJSON(): String
    open fun toLocal(): DateTime
    open fun toLocaleParts(options: LocaleOptions /* LocaleOptions & DateTimeFormatOptions */ = definedExternally): Array<Any>
    open fun toLocaleString(options: LocaleOptions /* LocaleOptions & DateTimeFormatOptions */ = definedExternally): String
    open fun toMillis(): Number
    open fun toObject(options: `T$1` = definedExternally): DateObject
    open fun toRelative(options: ToRelativeOptions? = definedExternally): String?
    open fun toRelativeCalendar(options: ToRelativeCalendarOptions? = definedExternally): String?
    open fun toRFC2822(): String
    open fun toSeconds(): Number
    open fun toSQL(options: ToSQLOptions? = definedExternally): String
    open fun toSQLDate(): String
    open fun toSQLTime(options: ToSQLOptions? = definedExternally): String
    override fun toString(): String
    open fun toUTC(offset: Number? = definedExternally, options: ZoneOptions? = definedExternally): DateTime
    open fun until(other: DateTime): Interval
    open fun valueOf(): Number
    open fun diff(other: DateTime): Duration
    open fun diffNow(): Duration

    companion object {
        var DATETIME_FULL: DateTimeFormatOptions
        var DATETIME_FULL_WITH_SECONDS: DateTimeFormatOptions
        var DATETIME_HUGE: DateTimeFormatOptions
        var DATETIME_HUGE_WITH_SECONDS: DateTimeFormatOptions
        var DATETIME_MED: DateTimeFormatOptions
        var DATETIME_MED_WITH_SECONDS: DateTimeFormatOptions
        var DATETIME_SHORT: DateTimeFormatOptions
        var DATETIME_SHORT_WITH_SECONDS: DateTimeFormatOptions
        var DATE_FULL: DateTimeFormatOptions
        var DATE_HUGE: DateTimeFormatOptions
        var DATE_MED: DateTimeFormatOptions
        var DATE_SHORT: DateTimeFormatOptions
        var TIME_24_SIMPLE: DateTimeFormatOptions
        var TIME_24_WITH_LONG_OFFSET: DateTimeFormatOptions
        var TIME_24_WITH_SECONDS: DateTimeFormatOptions
        var TIME_24_WITH_SHORT_OFFSET: DateTimeFormatOptions
        var TIME_SIMPLE: DateTimeFormatOptions
        var TIME_WITH_LONG_OFFSET: DateTimeFormatOptions
        var TIME_WITH_SECONDS: DateTimeFormatOptions
        var TIME_WITH_SHORT_OFFSET: DateTimeFormatOptions
        fun fromHTTP(text: String, options: DateTimeOptions? = definedExternally): DateTime
        fun fromISO(text: String, options: DateTimeOptions? = definedExternally): DateTime
        fun fromJSDate(date: Date, options: DateTimeJSOptions? = definedExternally): DateTime
        fun fromMillis(ms: Number, options: DateTimeOptions? = definedExternally): DateTime
        fun fromObject(obj: DateObject): DateTime
        fun fromRFC2822(text: String, options: DateTimeOptions? = definedExternally): DateTime
        fun fromSeconds(seconds: Number, options: DateTimeOptions? = definedExternally): DateTime
        fun fromSQL(text: String, options: DateTimeOptions? = definedExternally): DateTime
        fun fromFormat(text: String, format: String, opts: DateTimeOptions? = definedExternally): DateTime
        fun fromFormatExplain(text: String, format: String, opts: DateTimeOptions? = definedExternally): ExplainedFormat
        fun fromString(text: String, format: String, options: DateTimeOptions? = definedExternally): DateTime
        fun fromStringExplain(text: String, format: String, options: DateTimeOptions? = definedExternally): ExplainedFormat
        fun invalid(reason: Any): DateTime
        fun isDateTime(o: Any): Boolean
        fun local(year: Number? = definedExternally, month: Number? = definedExternally, day: Number? = definedExternally, hour: Number? = definedExternally, minute: Number? = definedExternally, second: Number? = definedExternally, millisecond: Number? = definedExternally): DateTime
        fun max(): Nothing?
        fun max(vararg dateTimes: DateTime): DateTime
        fun min(): Nothing?
        fun min(vararg dateTimes: DateTime): DateTime
        fun utc(year: Number? = definedExternally, month: Number? = definedExternally, day: Number? = definedExternally, hour: Number? = definedExternally, minute: Number? = definedExternally, second: Number? = definedExternally, millisecond: Number? = definedExternally): DateTime
    }
}

external interface DurationOptions {
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
    var numberingSystem: dynamic /* 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt' */
        get() = definedExternally
        set(value) = definedExternally
    var conversionAccuracy: dynamic /* 'casual' | 'longterm' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface DurationObjectUnits {
    var year: Number?
        get() = definedExternally
        set(value) = definedExternally
    var years: Number?
        get() = definedExternally
        set(value) = definedExternally
    var quarter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var quarters: Number?
        get() = definedExternally
        set(value) = definedExternally
    var month: Number?
        get() = definedExternally
        set(value) = definedExternally
    var months: Number?
        get() = definedExternally
        set(value) = definedExternally
    var week: Number?
        get() = definedExternally
        set(value) = definedExternally
    var weeks: Number?
        get() = definedExternally
        set(value) = definedExternally
    var day: Number?
        get() = definedExternally
        set(value) = definedExternally
    var days: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hour: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hours: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minute: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minutes: Number?
        get() = definedExternally
        set(value) = definedExternally
    var second: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seconds: Number?
        get() = definedExternally
        set(value) = definedExternally
    var millisecond: Number?
        get() = definedExternally
        set(value) = definedExternally
    var milliseconds: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DurationObject : DurationObjectUnits, DurationOptions

external interface DurationToFormatOptions : DateTimeFormatOptions {
    var floor: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var round: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

open external class Duration {
    open var days: Number
    open var hours: Number
    open var invalidReason: String?
    open var invalidExplanation: String?
    open var isValid: Boolean
    open var locale: String
    open var milliseconds: Number
    open var minutes: Number
    open var months: Number
    open var numberingSystem: String
    open var quarters: Number
    open var seconds: Number
    open var weeks: Number
    open var years: Number
    open fun `as`(unit: DurationUnit): Number
    open fun equals(other: Duration): Boolean
    open fun get(unit: DurationUnit): Number
    open fun minus(duration: Duration): Duration
    open fun minus(duration: Number): Duration
    open fun minus(duration: DurationObject): Duration
    open fun negate(): Duration
    open fun normalize(): Duration
    open fun plus(duration: Duration): Duration
    open fun plus(milliseconds: Number): Duration
    open fun plus(duration: DurationObject): Duration
    open fun reconfigure(objectPattern: DurationOptions): Duration
    open fun set(values: DurationObjectUnits): Duration
    open fun shiftTo(vararg units: DurationUnit): Duration
    open fun mapUnits(fn: (x: Number, u: DurationUnit) -> Number): Duration
    open fun toFormat(format: String, options: DurationToFormatOptions? = definedExternally): String
    open fun toISO(): String
    open fun toJSON(): String
    open fun toObject(options: `T$1` = definedExternally): DurationObject
    override fun toString(): String
    open fun valueOf(): Number

    companion object {
        fun fromISO(text: String, options: DurationOptions? = definedExternally): Duration
        fun fromMillis(count: Number, options: DurationOptions? = definedExternally): Duration
        fun fromObject(Object: DurationObject): Duration
        fun invalid(reason: String? = definedExternally): Duration
        fun isDuration(o: Any): Boolean
    }
}

external interface InfoOptions {
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InfoUnitOptions : InfoOptions {
    var numberingSystem: dynamic /* 'arab' | 'arabext' | 'bali' | 'beng' | 'deva' | 'fullwide' | 'gujr' | 'guru' | 'hanidec' | 'khmr' | 'knda' | 'laoo' | 'latn' | 'limb' | 'mlym' | 'mong' | 'mymr' | 'orya' | 'tamldec' | 'telu' | 'thai' | 'tibt' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface InfoCalendarOptions : InfoUnitOptions {
    var outputCalendar: dynamic /* 'buddhist' | 'chinese' | 'coptic' | 'ethioaa' | 'ethiopic' | 'gregory' | 'hebrew' | 'indian' | 'islamic' | 'islamicc' | 'iso8601' | 'japanese' | 'persian' | 'roc' */
        get() = definedExternally
        set(value) = definedExternally
}

external interface Features {
    var intl: Boolean
    var intlTokens: Boolean
    var zones: Boolean
}

external interface IntervalObject {
    var start: DateTime?
        get() = definedExternally
        set(value) = definedExternally
    var end: DateTime?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$2` {
    var separator: String?
        get() = definedExternally
        set(value) = definedExternally
}

open external class Interval {
    open var end: DateTime
    open var invalidReason: String?
    open var invalidExplanation: String?
    open var isValid: Boolean
    open var start: DateTime
    open fun abutsEnd(other: Interval): Boolean
    open fun abutsStart(other: Interval): Boolean
    open fun contains(dateTime: DateTime): Boolean
    open fun count(unit: DurationUnit? = definedExternally): Number
    open fun difference(vararg intervals: Interval): Array<Interval>
    open fun divideEqually(numberOfParts: Number? = definedExternally): Array<Interval>
    open fun engulfs(other: Interval): Boolean
    open fun equals(other: Interval): Boolean
    open fun hasSame(unit: DurationUnit): Boolean
    open fun intersection(other: Interval): Interval?
    open fun isAfter(dateTime: DateTime): Boolean
    open fun isBefore(dateTime: DateTime): Boolean
    open fun isEmpty(): Boolean
    open fun length(unit: DurationUnit? = definedExternally): Number
    open fun overlaps(other: Interval): Boolean
    open fun set(values: IntervalObject): Interval
    open fun splitAt(vararg dateTimes: DateTime): Array<Interval>
    open fun splitBy(duration: Duration): Array<Interval>
    open fun splitBy(duration: DurationObject): Array<Interval>
    open fun splitBy(duration: Number): Array<Interval>
    open fun toDuration(unit: DurationUnit? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun toDuration(unit: Array<DurationUnit>? = definedExternally, options: DiffOptions? = definedExternally): Duration
    open fun toFormat(dateFormat: String, options: `T$2` = definedExternally): String
    open fun toISO(options: ToISOTimeOptions? = definedExternally): String
    open fun toISODate(): String
    open fun toISOTime(options: ToISOTimeOptions? = definedExternally): String
    override fun toString(): String
    open fun union(other: Interval): Interval
    open fun mapEndpoints(cb: (d: DateTime) -> DateTime): Interval
    open fun toDuration(): Duration

    companion object {
        fun after(start: DateTime, duration: Duration): Interval
        fun after(start: DateTime, duration: Number): Interval
        fun after(start: DateTime, duration: DurationObject): Interval
        fun after(start: DateObject, duration: Duration): Interval
        fun after(start: DateObject, duration: Number): Interval
        fun after(start: DateObject, duration: DurationObject): Interval
        fun after(start: Date, duration: Duration): Interval
        fun after(start: Date, duration: Number): Interval
        fun after(start: Date, duration: DurationObject): Interval
        fun before(end: DateTime, duration: Duration): Interval
        fun before(end: DateTime, duration: Number): Interval
        fun before(end: DateTime, duration: DurationObject): Interval
        fun before(end: DateObject, duration: Duration): Interval
        fun before(end: DateObject, duration: Number): Interval
        fun before(end: DateObject, duration: DurationObject): Interval
        fun before(end: Date, duration: Duration): Interval
        fun before(end: Date, duration: Number): Interval
        fun before(end: Date, duration: DurationObject): Interval
        fun fromDateTimes(start: DateTime, end: DateTime): Interval
        fun fromDateTimes(start: DateTime, end: DateObject): Interval
        fun fromDateTimes(start: DateTime, end: Date): Interval
        fun fromDateTimes(start: DateObject, end: DateTime): Interval
        fun fromDateTimes(start: DateObject, end: DateObject): Interval
        fun fromDateTimes(start: DateObject, end: Date): Interval
        fun fromDateTimes(start: Date, end: DateTime): Interval
        fun fromDateTimes(start: Date, end: DateObject): Interval
        fun fromDateTimes(start: Date, end: Date): Interval
        fun fromISO(string: String, options: DateTimeOptions? = definedExternally): Interval
        fun invalid(reason: String? = definedExternally): Interval
        fun isInterval(o: Any): Boolean
        fun merge(intervals: Array<Interval>): Array<Interval>
        fun xor(intervals: Array<Interval>): Array<Interval>
    }
}

external interface ZoneOffsetOptions {
    var format: dynamic /* 'short' | 'long' */
        get() = definedExternally
        set(value) = definedExternally
    var locale: String?
        get() = definedExternally
        set(value) = definedExternally
}

open external class Zone {
    open var isValid: Boolean
    open var name: String
    open var type: String
    open var universal: Boolean
    open fun equals(other: Zone): Boolean
}

open external class IANAZone(ianaString: String) : Zone {
    companion object {
        fun create(name: String): IANAZone
        fun isValidSpecifier(s: String): Boolean
        fun isValidZone(zone: String): Boolean
        fun resetCache()
    }

    open fun offsetName(ts: Number, options: ZoneOffsetOptions): String
    open fun formatOffset(ts: Number, format: ZoneFormatOffset): String
    open fun offset(ts: Number): Number
}

open external class FixedOffsetZone : Zone {
    companion object {
        var utcInstance: String
        fun instance(offset: Number): FixedOffsetZone
        fun parseSpecifier(s: String): FixedOffsetZone
    }

    open fun offsetName(options: ZoneOffsetOptions): String
    open fun formatOffset(format: ZoneFormatOffset): String
    open fun offset(): Number
}

open external class InvalidZone : Zone

open external class LocalZone : Zone