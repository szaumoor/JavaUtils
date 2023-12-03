package com.szaumoor.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *  Utility class that provides functions designed to test numbers with different types of logical operations and make various calculations
 *  in an expressive way.
 */
public enum Numbers {
    ;

    /**
     * Checks if the specified value is within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean in(final int minInclusive, final int maxInclusive, final int value) {
        return minInclusive <= value && value <= maxInclusive;
    }
    /**
     * Checks if the specified value is within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean in(final long minInclusive, final long maxInclusive, final long value) {
        return minInclusive <= value && value <= maxInclusive;
    }
    /**
     * Checks if the specified value is within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean in(final BigDecimal minInclusive, final BigDecimal maxInclusive, final BigDecimal value) {
        return minInclusive.compareTo(value) <= 0 && value.compareTo(maxInclusive) <= 0;
    }
    /**
     * Checks if the specified value is within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean in(final BigInteger minInclusive, final BigInteger maxInclusive, final BigInteger value) {
        return minInclusive.compareTo(value) <= 0 && value.compareTo(maxInclusive) <= 0;
    }
    /**
     * Checks if the specified value is not within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean nin(final int minInclusive, final int maxInclusive, final int value) {
        return !in(minInclusive, maxInclusive, value);
    }
    /**
     * Checks if the specified value is not within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean nin(final long minInclusive, final long maxInclusive, final long value) {
        return !in(minInclusive, maxInclusive, value);
    }
    /**
     * Checks if the specified value is not within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean nin(final BigDecimal minInclusive, final BigDecimal maxInclusive, final BigDecimal value) {
        return !in(minInclusive, maxInclusive, value);
    }
    /**
     * Checks if the specified value is not within the specified range.
     *
     * @param  minInclusive	the minimum value of the range (inclusive)
     * @param  maxInclusive	the maximum value of the range (inclusive)
     * @param  value		the value to be checked
     * @return         		true if the value is within the range, false otherwise
     */
    public static boolean nin(final BigInteger minInclusive, final BigInteger maxInclusive, final BigInteger value) {
        return !in(minInclusive, maxInclusive, value);
    }
    /**
     * Calculates the sum of the given BigDecimal numbers.
     *
     * @param  nums  the BigDecimal numbers to be summed
     * @return       the sum of the given BigDecimal numbers
     */
    public static BigDecimal sum(final BigDecimal ... nums) {
        return Arrays.stream(nums).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
    /**
     * Calculates the sum of the given BigInteger numbers.
     *
     * @param  nums  the BigInteger numbers to be summed
     * @return       the sum of the given BigDecimal numbers
     */
    public static BigInteger sum(final BigInteger ... nums) {
        return Arrays.stream(nums).reduce(BigInteger.ZERO, BigInteger::add);
    }
    /**
     * Calculates the sum of the given integers.
     *
     * @param  ints  the integers to be summed
     * @return       the sum of the integers
     */
    public static int sum(final int ... ints) {
        return IntStream.of(ints).sum();
    }
    /**
     * Calculates the sum of the given long integers.
     *
     * @param  longs  the integers to be summed
     * @return       the sum of the integers
     */
    public static long sum(final long ... longs) {
        return LongStream.of(longs).sum();
    }
    /**
     * Calculates the sum of the given doubles.
     *
     * @param  doubles  an array of doubles
     * @return          the sum of the doubles
     */
    public static double sum(final double ... doubles) {
        return DoubleStream.of(doubles).sum();
    }
    /**
     * Multiplies a variable number of long integers together.
     *
     * @param  longs  the long integers to be multiplied
     * @return        the product of the long integers
     */
   public static long multiply(final long ... longs) {
       return LongStream.of(longs).reduce(1, (a, b) -> a * b);
   }
    /**
     * A function that multiplies a variable number of doubles together.
     *
     * @param  doubles  a variable number of doubles to multiply
     * @return          the product of the doubles
     */
   public static double multiply(final double ... doubles) {
       return DoubleStream.of(doubles).reduce(1, (a, b) -> a * b);
   }
    /**
     * Multiplies a variable number of integers.
     *
     * @param  ints  the integers to be multiplied
     * @return       the product of the integers
     */
   public static int multiply(final int ... ints) {
       return IntStream.of(ints).reduce(1, (a, b) -> a * b);
   }
    /**
     * Multiplies an array of BigDecimal numbers and returns the result.
     *
     * @param  bigDecimals  an array of BigDecimal numbers to be multiplied
     * @return              the product of the multiplication as a BigDecimal
     */
   public static BigDecimal multiply(final BigDecimal ... bigDecimals) {
       return Arrays.stream(bigDecimals).reduce(BigDecimal.ONE, BigDecimal::multiply);
   }
    /**
     * Multiplies a variable number of BigIntegers together.
     *
     * @param  bigIntegers  the BigIntegers to be multiplied
     * @return              the product of the BigIntegers
     */
   public static BigInteger multiply(final BigInteger ... bigIntegers) {
       return Arrays.stream(bigIntegers).reduce(BigInteger.ONE, BigInteger::multiply);
   }
}
