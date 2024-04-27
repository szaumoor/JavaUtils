package com.szaumoor.utils.containers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Utility class that provides functions for Java Collections and arrays
 */
public final class Containers {
    private Containers() {
        throw new AssertionError("Cannot be instantiated");
    }

    /**
     *  Returns the passed list after reversing the order of items. This works exactly
     *  as the {@link Collections#reverse(List)} method, only it returns
     *  the modified list directly, for convenience.
     *
     * @param list The list to reverse.
     * @return The list after reversing it.
     * @param <T> Type of object the {@link List} contains
     */
    public static <T> List<T> reversed(final List<T> list) {
        Collections.reverse(list);
        return list;
    }

    /**
     * Returns a new byte array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The byte array
     * @return The new byte array with the elements reversed
     */
    public static byte[] reversed(final byte[] array) {
        var newArray = new byte[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new short array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The short array
     * @return The new short array with the elements reversed
     */
    public static short[] reversed(final short [] array) {
        var newArray = new short[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new char array where the values have the opposite order of the passed array.
     * It's not very efficient, because it's not possible in Java to pass an array as a reference,
     * and as such, a copy of the array is needed, but it can be more expressive.
     *
     * @param array The char array
     * @return The new char array with the elements reversed
     */
    public static char[] reversed(final char [] array) {
        var newArray = new char[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new int array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The int array
     * @return The new int array with the elements reversed
     */
    public static int[] reversed(final int [] array) {
        var newArray = new int[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new long array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The long array
     * @return The new long array with the elements reversed
     */
    public static long[] reversed(final long [] array) {
        var newArray = new long[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new float array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The float array
     * @return The new float array with the elements reversed
     */
    public static float[] reversed(float[] array) {
        var newArray = new float[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new double array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The double array
     * @return The new double array with the elements reversed
     */
    public static double[] reversed(double[] array) {
        var newArray = new double[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Returns a new boolean array where the values have the opposite order of the passed array.
     * It's not very efficient as a means to replace an array reference. It's not possible
     * in Java to pass an array as a reference, and as such, a copy of the array is needed,
     * but it can be more expressive.
     *
     * @param array The boolean array
     * @return The new boolean array with the elements reversed
     */
    public static boolean[] reversed(boolean[] array) {
        var newArray = new boolean[array.length];
        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            newArray[i] = array[j];
        }
        return newArray;
    }

    /**
     * Reverses the content of the array and returns it as a {@link List} containing
     * those elements.
     *
     * @param array Array from which to take the elements to be reversed.
     * @return A {@link List} containing the elements in reverse order.
     * @param <T> The type of elements in the array
     */
    public static <T> List<T> reversed(final T[] array) {
        return reversed(Arrays.asList(array));
    }

    /**
     *  Returns the passed list after shuffling the order of items. This works exactly
     *  as the {@link Collections#shuffle(List)} method, only it returns
     *  the modified list directly, for convenience.
     *
     * @param list The list to shuffle.
     * @return The list after shuffling it.
     * @param <T> Type of object the {@link List} contains
     */
    public static <T> List<T> shuffled(final List<T> list) {
        Collections.shuffle(list);
        return list;
    }

    /**
     * Shuffles the content of the array and returns it as a {@link List} containing
     * those elements.
     *
     * @param array Array from which to take the elements to be shuffled.
     * @return A {@link List} containing the elements in a shuffled order.
     * @param <T> The type of elements in the array
     */
    public static <T> List<T> shuffled(final T[] array) {
        return shuffled(Arrays.asList(array));
    }
}