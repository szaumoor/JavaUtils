package com.szaumoor.utils.datatypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;

/**
 * Utility class that provides functions to handle numbers
 */
public final class Numbers {
    private Numbers() {
        throw new AssertionError("Utility class");
    }

    /**
     * Calculates the factorial of a given number. Uses BigInteger, so efficiency will be subpar
     * if the number is small.
     *
     * @param num the number for which the factorial is calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
    public static BigInteger factorial(final int num) {
        if (num <= 0) throw new IllegalArgumentException("Number must be non-negative");
        return IntStream.rangeClosed(1, num).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
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
     * @param  str  the string to parse
     * @return      an OptionalDouble representing the parsed value, or an empty OptionalDouble if the string cannot be parsed
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
     * @param  str  the string to parse
     * @return      an OptionalInt representing the parsed value, or an empty OptionalInt if the string cannot be parsed
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
     * @param  str  the string to parse
     * @return      an OptionalLong representing the parsed value, or an empty OptionalLong if the string cannot be parsed
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
     * Reduces the number of decimal points in a double number. Any value below 0 will return the original number.
     * No rounding of any kind is done, this function simply "deletes" the remaining digits. It has no effect
     * if the number has fewer decimal points than the requested reduction.
     *
     * @param number The number that needs the reduction
     * @param decimalPoints The number of decimal points that should be preserved only
     * @return The number with the number of decimals required.
     */
    public static double reduceDecimalPoints(final double number, final int decimalPoints) {
        if(decimalPoints < 0) return number;
        double pow = Math.pow(10, decimalPoints);
        return Math.floor(number * pow) / pow;
    }
}
