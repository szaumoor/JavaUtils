package com.szaumoor.utils.random;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Utility class that provides functions to generate random lists of values.
 */
public final class RandomUtils {
    private RandomUtils() {
        throw new AssertionError("Utility class");
    }

    /**
     * Generates an array filled with random integers within the provided interval, with a specific length.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer array filled with random numbers
     */
    public int[] randomArrayOfInts(final IntervalInt interval, final int size) {
        return getIntStream(interval, size).toArray();
    }

    /**
     * Generates a list filled with random integers within the provided interval, with a specific length.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer list filled with random numbers
     */
    public List<Integer> randomListOfInts(final IntervalInt interval, final int size) {
        return getIntStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random long integers within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer array filled with random numbers
     */
    public long[] randomArrayOfLongs(final IntervalLong interval, final int size) {
        return getLongStream(interval, size).toArray();
    }

    /**
     * Generates a list filled with random long integers within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer list filled with random numbers
     */
    public List<Long> randomListOfLongs(final IntervalLong interval, final int size) {
        return getLongStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random floats within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer array filled with random numbers
     */
    public float[] randomArrayOfFloats(final IntervalFloat interval, final int size) {
        var localRandomGen = ThreadLocalRandom.current();
        float [] randomFloats = new float[size];
        for (int i = 0; i < randomFloats.length; i++) {
            randomFloats[i] = localRandomGen.nextFloat(interval.origin(), interval.bound());
        }
        return randomFloats;
    }

    /**
     * Generates a list filled with random long integers within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer list filled with random numbers
     */
    public List<Float> randomListOfFloats(final IntervalFloat interval, final int size) {
        var localRandomGen = ThreadLocalRandom.current();
        var randomFloats = new ArrayList<Float>(size);
        for (int i = 0; i < size; i++) {
            randomFloats.set(i, localRandomGen.nextFloat(interval.origin(), interval.bound()));
        }
        return randomFloats;
    }

    /**
     * Generates an array filled with random long integers within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer array filled with random numbers
     */
    public double[] randomArrayOfDoubles(final IntervalDouble interval, final int size) {
        return getDoubleStream(interval, size).toArray();
    }
    /**
     * Generates a list filled with random long integers within the provided interval, with a specific length.
     *
     * @param interval The interval of long integers from which the random generator can pull values from.
     * @param size The size of the array
     * @return The integer list filled with random numbers
     */
    public List<Double> randomListOfDoubles(final IntervalDouble interval, final int size) {
        return getDoubleStream(interval, size)
                .boxed()
                .toList();
    }

    /**
     * Generates an array filled with random booleans, with a specific length.
     *
     * @param size The size of the array
     * @return The boolean array filled with random numbers
     */
    public boolean[] randomArrayOfBooleans(final int size) {
        var localRandomGen = ThreadLocalRandom.current();
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
    private IntStream getIntStream(final IntervalInt interval, final int limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return IntStream.generate(() -> localRandomGen.nextInt(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a LongStream that generates long integer random values within an interval, up to a limit.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The LongStream generated according to the passed arguments
     */
    private LongStream getLongStream(final IntervalLong interval, final long limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return LongStream.generate(() -> localRandomGen.nextLong(interval.origin(), interval.bound()))
                .limit(limit);
    }

    /**
     * Creates a DoubleStream that generates double random values within an interval, up to a limit.
     *
     * @param interval The interval of integers from which the random generator can pull values from.
     * @param limit The limit of this stream. Must be positive.
     * @return The DoubleStream generated according to the passed arguments
     */
    private DoubleStream getDoubleStream(final IntervalDouble interval, final long limit) {
        var localRandomGen = ThreadLocalRandom.current();
        return DoubleStream.generate(() -> localRandomGen.nextDouble(interval.origin(), interval.bound()))
                .limit(limit);
    }
}
