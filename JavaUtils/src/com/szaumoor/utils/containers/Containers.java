package com.szaumoor.utils.containers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
    public static <T> List<T> reverse( final List<T> list) {
        Collections.reverse(list);
        return list;
    }

    /**
     * Returns a new byte array where the values have the opposite order of the passed array.
     *
     * @param array The byte array
     * @return The new byte array with the elements reversed
     */
    public static byte[] reversed(final byte[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final byte[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new short array where the values have the opposite order of the passed array.
     *
     * @param array The short array
     * @return The new short array with the elements reversed
     */
    public static short[] reversed(final short[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final short[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new char array where the values have the opposite order of the passed array.
     *
     * @param array The char array
     * @return The new char array with the elements reversed
     */
    public static char[] reversed(final char [] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final char[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new int array where the values have the opposite order of the passed array.
     *
     * @param array The int array
     * @return The new int array with the elements reversed
     */
    public static int[] reversed(final int[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final int[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }


    /**
     * Returns a new long array where the values have the opposite order of the passed array.
     *
     * @param array The long array
     * @return The new long array with the elements reversed
     */
    public static long[] reversed(final long[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final long[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new float array where the values have the opposite order of the passed array.
     *
     * @param array The float array
     * @return The new float array with the elements reversed
     */
    public static float[] reversed(float[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final float[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new double array where the values have the opposite order of the passed array.
     *
     * @param array The double array
     * @return The new double array with the elements reversed
     */
    public static double[] reversed(double[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final double[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new boolean array where the values have the opposite order of the passed array.
     *
     * @param array The boolean array
     * @return The new boolean array with the elements reversed
     */
    public static boolean[] reversed(boolean[] array) {
        final var copy = Arrays.copyOf(array, array.length);
        reverse(copy);
        return copy;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static void reverse(final boolean[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Returns a new array where the values have the opposite order of the passed array.
     *
     * @param array The array
     * @return The new array with the elements reversed
     */
    public static <T> T[] reversed( final T[] array) {
        T[] newArray = Arrays.copyOf(array, array.length);
        reverse(newArray);
        return newArray;
    }

    /**
     * Reverses the content of the array
     *
     * @param array Array from which to take the elements to be reversed.
     */
    public static <T> void reverse(final T[] array) {
        for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
            final var temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
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
     * Shuffles the content of the array.
     *
     * @param array Array to shuffle.
     * @param <T> The type of elements in the array
     */
    public static <T> void shuffled(final T[] array) {
        var n = shuffled( Arrays.asList( array  ) );
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = n.get(i);
        }
    }

    /**
     * Retrieves the last item in a List. Not needed in Java 21+. Use the getLast method instead.
     *
     * @param list The list
     * @return The last item of the list
     * @param <T> The type of object
     */
    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }

    /**
     * Retrieves the last item in an array.
     * @param array The array
     * @return The last item of the array
     * @param <T> The type of object
     */
    public static <T> T last(final T[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static int last(final int[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static double last(final double[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static float last(final float[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static long last(final long[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static short last(final short[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static byte last(final byte[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static boolean last(final boolean[] array) {
        return array[array.length - 1];
    }

    /**
     * Returns the last item of the array.
     *
     * @param array The array
     * @return The last item of the array
     */
    public static char last(final char[] array) {
        return array[array.length - 1];
    }
}