package com.szaumoor.utils.datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Utility class that provides functions to handle numbers
 */
public final class Numbers {
    private Numbers() {
        throw new AssertionError("Utility class");
    }

    private static final int FACTORIAL_ORIGIN = 1;
    private static final int FACTORIAL_BOUND = 21;

    /**
     * Calculates the factorial of a given number. Uses BigInteger, so efficiency will be subpar.
     *
     * @param num the number for which the factorial is calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
    public static BigInteger factorial(final int num) {
        if (num < FACTORIAL_ORIGIN) throw new IllegalArgumentException("Number must be non-negative");
        return IntStream.rangeClosed(1, num).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
    }

    /**
     * Calculates the factorial of a given number. Overflow will cause an exception,
     * which happens for n > 20. Likewise, negative numbers and zero will cause an exception.
     *
     * @param num the number for which the factorial is calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
    public static long factorialInt(final int num) {
        if (notBetween(FACTORIAL_ORIGIN, num, FACTORIAL_BOUND)) throw new IllegalArgumentException("Number must be between 1 and 20 (to prevent integer overflow)");
        return LongStream.rangeClosed(1, num).reduce(1, (left, right) -> left * right);
    }


    /**
     * Checks if the given string is a decimal number.
     *
     * @param str the string to be checked
     * @return true if the string is a number, false otherwise
     */
    public static boolean isNumeric(final String str) {
        return getBigDecimal(str).isPresent();
    }

    /**
     * Checks if the given string is a valid number as per the BigDecimal class and returns the result
     * wrapped in an Optional.
     *
     * @param str the string to be checked
     * @return an Optional containing the parsed BigDecimal, or an empty Optional otherwise
     */
    public static Optional<BigDecimal> getBigDecimal(final String str) {
        try {
            var value = new BigDecimal(str);
            return Optional.of(value);
        } catch (final NumberFormatException e) {
            return Optional.empty();
        }
    }

    /**
     * Parses a string and returns an OptionalDouble containing the parsed value, or empty if the string cannot be parsed.
     *
     * @param str the string to parse
     * @return an OptionalDouble representing the parsed value, or an empty OptionalDouble if the string cannot be parsed
     */
    public static OptionalDouble getDouble(final String str) {
        try {
            var value = Double.parseDouble(str);
            return OptionalDouble.of(value);
        } catch (final NumberFormatException e) {
            return OptionalDouble.empty();
        }
    }

    /**
     * Parses a string and returns an OptionalInt containing the parsed value, or empty if the string cannot be parsed.
     *
     * @param str the string to parse
     * @return an OptionalInt representing the parsed value, or an empty OptionalInt if the string cannot be parsed
     */
    public static OptionalInt getInteger(final String str) {
        try {
            var value = Integer.parseInt(str);
            return OptionalInt.of(value);
        } catch (final NumberFormatException e) {
            return OptionalInt.empty();
        }
    }

    /**
     * Parses a string and returns an OptionalLong containing the parsed value, or empty if the string cannot be parsed.
     *
     * @param str the string to parse
     * @return an OptionalLong representing the parsed value, or an empty OptionalLong if the string cannot be parsed
     */
    public static OptionalLong getLong(final String str) {
        try {
            var value = Long.parseLong(str);
            return OptionalLong.of(value);
        } catch (final NumberFormatException e) {
            return OptionalLong.empty();
        }
    }

    /**
     * Reduces the number of decimal points in a double number. Any value passed to decimal points
     * below 0 will just return the original number. No rounding of any kind is done, this function
     * simply "deletes" the remaining digits. It has no effect if the number has fewer decimal
     * points than the requested reduction.
     *
     * @param number        The number that needs the reduction
     * @param decimalPoints The number of decimal points that should be preserved only
     * @return The number with the number of decimals required.
     */
    public static double reduceDecimalPoints(final double number, final int decimalPoints) {
        if (decimalPoints < 0) return number;
        double pow = Math.pow(10, decimalPoints);
        return Math.floor(number * pow) / pow;
    }

    /**
     * Calculates the average of the given numbers.
     *
     * @param numbers The numbers to calculate the average of
     * @return The average
     */
    public static double average(final double... numbers) {
        if (numbers.length == 1) return numbers[0];
        return DoubleStream.of(numbers).average().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final int origin, final int number, final int boundExclusive) {
        return number >= origin && number < boundExclusive;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final int origin, final int number, final int boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final long origin, final long number, final long boundExclusive) {
        return number >= origin && number < boundExclusive;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final long origin, final long number, final long boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final float origin, final float number, final float boundExclusive) {
        return number >= origin && number < boundExclusive;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final float origin, final float number, final float boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final double origin, final double number, final double boundExclusive) {
        return number >= origin && number < boundExclusive;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final double origin, final double number, final double boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final BigInteger origin, final BigInteger number, final BigInteger boundExclusive) {
        return number.compareTo(origin) >= 0 && number.compareTo(boundExclusive) < 0;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final BigInteger origin, final BigInteger number, final BigInteger boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    /**
     * Checks that a number is between an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is between the origin (inclusive) and the bound (exclusive)
     */
    public static boolean between(final BigDecimal origin, final BigDecimal number, final BigDecimal boundExclusive) {
        return number.compareTo(origin) >= 0 && number.compareTo(boundExclusive) < 0;
    }

    /**
     * Checks that a number is outside an origin (inclusive) and a bound (exclusive).
     * Exists to provide an expressive syntax for common bounds checks.
     *
     * @param origin Origin (inclusive)
     * @param number The number to be checked
     * @param boundExclusive Bound (exclusive)
     * @return True if the number is outside the origin (inclusive) and the bound (exclusive)
     */
    public static boolean notBetween(final BigDecimal origin, final BigDecimal number, final BigDecimal boundExclusive) {
        return !between(origin, number, boundExclusive);
    }

    public static BigDecimal sumDecimals(final Collection<BigDecimal> numbers) {
        return numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public static BigInteger sumIntegers(final Collection<BigInteger> numbers) {
        return numbers.stream().reduce(BigInteger.ZERO, BigInteger::add);
    }

    public static BigDecimal averageOfDecimals(final Collection<BigDecimal> numbers) {
        return sumDecimals(numbers).divide(BigDecimal.valueOf(numbers.size()), MathContext.DECIMAL128);
    }

    public static BigDecimal averageOfIntegers(final Collection<BigInteger> numbers) {
        return new BigDecimal(sumIntegers(numbers)).divide(BigDecimal.valueOf(numbers.size()), MathContext.DECIMAL128);
    }

    public static BigDecimal max(final Collection<BigDecimal> numbers) {
        return numbers.stream().max(BigDecimal::compareTo).orElseThrow();
    }

    public static BigDecimal min(final Collection<BigDecimal> numbers) {
        return numbers.stream().min(BigDecimal::compareTo).orElseThrow();
    }
}
