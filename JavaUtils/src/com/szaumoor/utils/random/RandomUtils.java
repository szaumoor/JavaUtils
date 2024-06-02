package com.szaumoor.utils.random;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.Collections.emptyList;

/**
 * Utility class that provides functions to generate random lists of values.
 */
public final class RandomUtils {
    private RandomUtils() {
        throw new AssertionError("Utility class");
    }

    private static final int MIN_SIZE = 1;

    /**
     * Generates an array filled with random integers within the provided interval, with a specific size.
     * The size must be greater than 0, otherwise an empty array is returned.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random integers
     */
    public static int[] arrayOfInts(final IntervalInt interval, final int size) {
        if (size < MIN_SIZE) return new int[0];
        return intStream(interval, size).toArray();
    }

    /**
     * Generates an array filled with random integers within the provided interval, with a specific size,
     * using a SecureRandom object.
     * Size must be greater than 0, otherwise an empty array is returned.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random integers
     */
    public static int[] arrayOfIntsSecure(final IntervalInt interval, final int size) {
        if (size < MIN_SIZE) return new int[0];
        return intStreamSecure(interval, size).toArray();
    }

    /**
     * Generates a list filled with random integers within the provided interval, with a specific size.
     * Size must be greater than 0, otherwise an empty list is returned.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random integers
     */
    public static List<Integer> listOfInts(final IntervalInt interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        return intStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates a list filled with random integers within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random integers
     */
    public static List<Integer> listOfIntsSecure(final IntervalInt interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        return intStreamSecure(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random long integers within the provided interval, with a specific size.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random long integers
     */
    public static long[] arrayOfLongs(final IntervalLong interval, final int size) {
        if (size < MIN_SIZE) return new long[0];
        return longStream(interval, size).toArray();
    }

    /**
     * Generates an array filled with random long integers within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random long integers
     */
    public static long[] arrayOfLongsSecure(final IntervalLong interval, final int size) {
        if (size < MIN_SIZE) return new long[0];
        return longStreamSecure(interval, size).toArray();
    }

    /**
     * Generates a list filled with random long integers within the provided interval, with a specific size.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random long integers
     */
    public static List<Long> listOfLongs(final IntervalLong interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        return longStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random floats within the provided interval, with a specific size.
     *
     * @param interval The interval of floats from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random floats
     */
    public static float[] arrayOfFloats(final IntervalFloat interval, final int size) {
        if (size < MIN_SIZE) return new float[0];
        var localRandomGen = ThreadLocalRandom.current();
        float [] randomFloats = new float[size];
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = localRandomGen.nextFloat(interval.origin(), interval.bound());
        }
        return randomFloats;
    }

    /**
     * Generates an array filled with random floats within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of floats from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random floats
     */
    public static float[] arrayOfFloatsSecure(final IntervalFloat interval, final int size) {
        if (size < MIN_SIZE) return new float[0];
        var localRandomGen = new SecureRandom();
        float [] randomFloats = new float[size];
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = localRandomGen.nextFloat(interval.origin(), interval.bound());
        }
        return randomFloats;
    }

    /**
     * Generates a list filled with random floats within the provided interval, with a specific size.
     *
     * @param interval The interval of floats from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random floats
     */
    public static List<Float> listOfFloats(final IntervalFloat interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        var localRandomGen = ThreadLocalRandom.current();
        var randomFloats = new ArrayList<Float>(size);
        for (int i = 0; i < size; i++) {
            randomFloats.set(i, localRandomGen.nextFloat(interval.origin(), interval.bound()));
        }
        return randomFloats;
    }

    /**
     * Generates a list filled with random floats within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of floats from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random floats
     */
    public static List<Float> listOfFloatsSecure(final IntervalFloat interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        var localRandomGen = new SecureRandom();
        var randomFloats = new ArrayList<Float>(size);
        for (int i = 0; i < size; i++) {
            randomFloats.set(i, localRandomGen.nextFloat(interval.origin(), interval.bound()));
        }
        return randomFloats;
    }

    /**
     * Generates an array filled with random double numbers within the provided interval, with a specific size.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random doubles
     */
    public static double[] arrayOfDoubles(final IntervalDouble interval, final int size) {
        if (size < MIN_SIZE) return new double[0];
        return doubleStream(interval, size).toArray();
    }

    /**
     * Generates an array filled with random double numbers within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param size The size of the array
     * @return The array of random doubles
     */
    public static double[] arrayOfDoublesSecure(final IntervalDouble interval, final int size) {
        if (size < MIN_SIZE) return new double[0];
        return doubleStreamSecure(interval, size).toArray();
    }

    /**
     * Generates a list filled with random doubles within the provided interval, with a specific size.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random doubles
     */
    public static List<Double> listOfDoubles(final IntervalDouble interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        return doubleStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates a list filled with random doubles within the provided interval, with a specific size,
     * using a SecureRandom object.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param size The size of the array
     * @return The list of random doubles
     */
    public static List<Double> listOfDoublesSecure(final IntervalDouble interval, final int size) {
        if (size < MIN_SIZE) return emptyList();
        return doubleStreamSecure(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random booleans, with a specific size.
     *
     * @param size The size of the array
     * @return The array of random booleans
     */
    public static boolean[] arrayOfBools(final int size) {
        if (size < MIN_SIZE) return new boolean[0];
        var localRandomGen = ThreadLocalRandom.current();
        boolean [] randomBooleans = new boolean[size];
        for (int i = 0; i < randomBooleans.length; i++) {
            randomBooleans[i] = localRandomGen.nextBoolean();
        }
        return randomBooleans;
    }

    /**
     * Generates an array filled with random booleans, with a specific size,
     * using a SecureRandom object.
     *
     * @param size The size of the array
     * @return The array of random booleans
     */
    public static boolean[] arrayOfBoolsSecure(final int size) {
        if (size < MIN_SIZE) return new boolean[0];
        var localRandomGen = new SecureRandom();
        boolean [] randomBooleans = new boolean[size];
        for (int i = 0; i < randomBooleans.length; i++) {
            randomBooleans[i] = localRandomGen.nextBoolean();
        }
        return randomBooleans;
    }

    /**
     * Creates an IntStream that generates random integer values within an interval, up to a limit.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The IntStream generated according to the passed arguments
     */
    private static IntStream intStream(final IntervalInt interval, final int limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return IntStream.generate(() -> localRandomGen.nextInt(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates an IntStream that generates random integer values within an interval, up to a limit,
     * using a SecureRandom object.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The IntStream generated according to the passed arguments
     */
    private static IntStream intStreamSecure(final IntervalInt interval, final int limit) {
        var localRandomGen = new SecureRandom();
        return IntStream.generate(() -> localRandomGen.nextInt(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a LongStream that generates long integer random values within an interval, up to a limit.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The LongStream generated according to the passed arguments
     */
    private static LongStream longStream(final IntervalLong interval, final long limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return LongStream.generate(() -> localRandomGen.nextLong(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a LongStream that generates long integer random values within an interval, up to a limit,
     * using a SecureRandom object.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The LongStream generated according to the passed arguments
     */
    private static LongStream longStreamSecure(final IntervalLong interval, final long limit) {
        var localRandomGen = new SecureRandom();
        return LongStream.generate(() -> localRandomGen.nextLong(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a DoubleStream that generates double random values within an interval, up to a limit.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The DoubleStream generated according to the passed arguments
     */
    private static DoubleStream doubleStream(final IntervalDouble interval, final long limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return DoubleStream.generate(() -> localRandomGen.nextDouble(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a DoubleStream that generates double random values within an interval, up to a limit,
     * using a SecureRandom object.
     *
     * @param interval The interval of doubles from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The DoubleStream generated according to the passed arguments
     */
    private static DoubleStream doubleStreamSecure(final IntervalDouble interval, final long limit) {
        var localRandomGen = new SecureRandom();
        return DoubleStream.generate(() -> localRandomGen.nextDouble(interval.origin(), interval.bound()))
                .limit(limit);
    }

}
