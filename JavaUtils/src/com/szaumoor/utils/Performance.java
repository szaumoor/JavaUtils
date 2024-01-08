package com.szaumoor.utils;

import java.text.DecimalFormat;

/**
 * Utility class for performance measurements with nanosecond precision as per {@link System#nanoTime()}
 */
public final class Performance {

    private Performance() {
        throw new AssertionError("Utility class");
    }
    private static final DecimalFormat decimalFormat = new DecimalFormat();

    static {
        decimalFormat.setMaximumFractionDigits(3);
    }

    /**
     * Calculates the time taken to execute the given runnable, returning the nanoseconds.
     *
     * @param runnable the code to be executed
     * @return the time taken in nanoseconds
     */
    public static long nanos(final Runnable runnable) {
        final var start = System.nanoTime();
        runnable.run();
        return System.nanoTime() - start;
    }

    /**
     * Calculates the time taken to execute the given runnable, returning the milliseconds.
     *
     * @param runnable the code to be executed
     * @return the time taken in milliseconds
     */
    public static long millis(final Runnable runnable) {
        return nanos(runnable) / 1_000_000;
    }

    /**
     * Calculates the number of seconds (with up to three decimal points) it takes to execute the given runnable.
     *
     * @param runnable the runnable to be executed
     * @return the number of seconds it takes to execute the runnable
     */
    public static double seconds(final Runnable runnable) {
        return Double.parseDouble(decimalFormat.format(millis(runnable) / 1000.0));
    }
}
