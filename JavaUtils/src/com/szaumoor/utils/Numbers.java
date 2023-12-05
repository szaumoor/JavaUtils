package com.szaumoor.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
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

    /**
     * Calculates the factorial of a given number. Uses BigInteger, so efficiency will be subpar
     * if the number is small. Use factorial(byte) or factorial(short) instead if possible.
     *
     * @param  num  the number for which the factorial is calculated
     * @return      the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
   public static BigInteger factorial(final int num) {
       if (num <= 0) {
           throw new IllegalArgumentException("Number must be non-negative");
       }
       return IntStream.rangeClosed(1, num).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
   }

    /**
     * Calculates the factorial of a given number.
     *
     * @param num the number for which factorial is to be calculated
     * @return the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
   public static int factorial(final byte num) {
       if (num <= 0) {
           throw new IllegalArgumentException("Number must be non-negative");
       }
       return IntStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
   }

    /**
     * Calculates the factorial of a given number.
     *
     * @param  num  the number for which to calculate the factorial (must be non-negative)
     * @return      the factorial of the given number
     * @throws IllegalArgumentException if the number is negative
     */
   public static long factorial(final short num) {
       if (num <= 0) {
           throw new IllegalArgumentException("Number must be non-negative");
       }
       return LongStream.rangeClosed(1, num).reduce(1, (a, b) -> a * b);
   }

    /**
     * Calculates the sum of integers within a given range.
     *
     * @param  start  the start of the range (inclusive)
     * @param  endInclusive    the endInclusive of the range (inclusive)
     * @return        the sum of integers within the range
     */
    public static long rangeSum(final int start, final int endInclusive) {
        if (endInclusive < start) {
            throw new IllegalArgumentException("End must be greater than start");
        }
        int n = endInclusive - start + 1;
        return (long) n * (start + endInclusive) / 2;
    }

    /**
     * Calculates the sum of integers within a given range.
     *
     * @param  start  the start of the range (inclusive)
     * @param  endInclusive    the endInclusive of the range (inclusive)
     * @return        the sum of integers within the range
     */
    public static long rangeSum(final long start, final long endInclusive) {
        if (endInclusive < start) {
            throw new IllegalArgumentException("End must be greater than start");
        }
        long n = endInclusive - start + 1;
        return n * (start + endInclusive) / 2;
    }

    /**
     * Calculates the sum of integers within a given range.
     *
     * @param  start  the start of the range (inclusive)
     * @param  endInclusive    the endInclusive of the range (inclusive)
     * @return        the sum of integers within the range
     */
    public static BigInteger rangeSum(final BigInteger start, final BigInteger endInclusive) {
        if (endInclusive.compareTo(start) < 0) {
            throw new IllegalArgumentException("End must be greater than start");
        }
        var n = endInclusive.subtract(start).add(BigInteger.ONE);
        return n.multiply(start.add(endInclusive)).divide(BigInteger.TWO);
    }
    /**
     * Calculates the average in an array of integers.
     *
     * @param  numbers  the array of integers
     * @return          the average of the array
     */
    public static double avg(final int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
    /**
     * Calculates the average in an array of long integers.
     *
     * @param  numbers  the array of long integers
     * @return          the average of the array
     */
    public static double avg(final long... numbers) {
        long sum = 0;
        for (long number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
    /**
     * Calculates the average in an array of doubles.
     *
     * @param  numbers  the array of doubles
     * @return          the average of the array
     */
    public static double avg(final double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
    /**
     * Calculates the average in an array of BigInteger objects.
     *
     * @param  numbers  the array of BigInteger objects
     * @return          the average of the array
     */
    public static BigDecimal avg(final BigInteger... numbers) {
        var total = new BigDecimal(sum(numbers));
        return total.divide(BigDecimal.valueOf(numbers.length), RoundingMode.HALF_UP);
    }
    /**
     * Calculates the average in an array of BigDecimal objects.
     *
     * @param  numbers  the array of BigDecimal objects
     * @return          the average of the array
     */
    public static BigDecimal avg(final BigDecimal... numbers) {
        var total = sum(numbers);
        return total.divide(BigDecimal.valueOf(numbers.length), RoundingMode.HALF_UP);
    }
    /**
     * Function that takes in a variable number of integers and returns the maximum value.
     *
     * @param  numbers   a variable number of integers
     * @return           the maximum value from the input integers
     */
    public static int max(final int ... numbers) {
        return IntStream.of(numbers).max().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Function that takes in a variable number of long integers and returns the maximum value.
     *
     * @param  numbers   a variable number of long integers
     * @return           the maximum value from the input long integers
     */
    public static long max(final long ... numbers) {
        return LongStream.of(numbers).max().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Function that takes in a variable number of doubles and returns the maximum value.
     *
     * @param  numbers   a variable number of doubles
     * @return           the maximum value from the input doubles
     */
    public static double max(final double ... numbers) {
        return DoubleStream.of(numbers).max().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Function that takes in a variable number of BigInteger objects and returns the maximum value.
     *
     * @param  numbers   a variable number of BigInteger objects
     * @return           the maximum value from the input BigInteger objects
     */
    public static BigInteger max(final BigInteger ... numbers) {
        return Arrays.stream(numbers).max(BigInteger::compareTo).orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Function that takes in a variable number of BigDecimal objects and returns the maximum value.
     *
     * @param  numbers   a variable number of BigDecimal objects
     * @return           the maximum value from the input BigDecimal objects
     */
    public static BigDecimal max(final BigDecimal ... numbers) {
        return Arrays.stream(numbers).max(BigDecimal::compareTo).orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Calculates the minimum value from a variable number of integer inputs.
     *
     * @param  numbers  the integers from which the minimum value will be calculated
     * @return          the minimum value from the input integers
     */
    public static int min(final int ... numbers) {
        return IntStream.of(numbers).min().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Calculates the minimum value from a variable number of long integer inputs.
     *
     * @param  numbers  the long integers from which the minimum value will be calculated
     * @return          the minimum value from the input long integers
     */
    public static long min(final long ... numbers) {
        return LongStream.of(numbers).min().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Calculates the minimum value from a variable number of doubles inputs.
     *
     * @param  numbers  the doubles from which the minimum value will be calculated
     * @return          the minimum value from the input doubles
     */
    public static double min(final double ... numbers) {
        return DoubleStream.of(numbers).min().orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
    /**
     * Calculates the minimum value from a variable number of BigInteger inputs.
     *
     * @param  numbers  the BigInteger objects from which the minimum value will be calculated
     * @return          the minimum value from the input BigInteger objects
     */
    public static BigInteger min(final BigInteger ... numbers) {
        return Arrays.stream(numbers).min(BigInteger::compareTo).orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }

    /**
     * Calculates the minimum value from a variable number of BigDecimal inputs.
     *
     * @param  numbers  the BigDecimal objects from which the minimum value will be calculated
     * @return          the minimum value from the input BigDecimal objects
     */
    public static BigDecimal min(final BigDecimal ... numbers) {
        return Arrays.stream(numbers).min(BigDecimal::compareTo).orElseThrow(() -> new IllegalArgumentException("No numbers provided"));
    }
}
