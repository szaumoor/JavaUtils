package com.szaumoor.utils.performance;

import com.szaumoor.utils.datatypes.Numbers;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;
import static java.util.Objects.isNull;


/**
 * Utility class to measure execution time easily with nanosecond precision as per the {@link System#nanoTime()} method.
 */
public final class Execution {

    private static final double NANOS_TO_SEC_MAG = 1_000_000_000.0;
    private static final double NANOS_TO_MILLIS_MAG = 1_000_000.0;

    private Execution() {
        throw new AssertionError("Utility class");
    }


    /**
     * Calculates the time taken to execute the given runnable, returning the nanoseconds.
     *
     * @param runnable the code to be executed
     * @return the time taken in nanoseconds
     */
    public static long nanosOf(final Runnable runnable) {
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
    public static double millisOf(final Runnable runnable) {
        return nanosOf(runnable) / 1_000_000.0;
    }

    /**
     * Calculates the number of seconds (with up to three decimal points) it takes to execute the given runnable.
     *
     * @param runnable the runnable to be executed
     * @return the number of seconds it takes to execute the runnable
     */
    public static double secondsOf(final Runnable runnable) {
        return Numbers.reduceDecimalPoints(millisOf(runnable) / 1000.0, 3);
    }

    /**
     * Calculates the time taken to execute the given runnable, returning a {@link Duration} object
     * containing that information.
     *
     * @param runnable the code to be executed
     * @return the duration of the runnable
     */
    public static Duration durationOf(final Runnable runnable) {
        return Duration.ofNanos(nanosOf(runnable));
    }

    /**
     *
     * Obtains the total, average, maximum, and minimum duration in the execution of a particular
     * Runnable, according to a particular unit of time. Only NANOS, MILLIS, and SECONDS are supported;
     * others will throw an exception.
     *
     * @param runnable Body of code to measure
     * @param runs The number of times to run the code
     * @param timeUnit The unit of time the average should be returned as.
     * @throws IllegalArgumentException if the ChronoUnit is unsupported, or the runs are less than 1.
     * @return a double indicating the average execution time according to the passed ChronoUnit
     */
    public static PerformanceReport performance(final Runnable runnable, int runs, final ChronoUnit timeUnit) {
        if (runs < 2) throw new IllegalArgumentException("At least two runs are expected");
        if (isNull(runnable)) throw new NullPointerException("Null runnable!");
        if (timeUnit != NANOS  && timeUnit != MILLIS && timeUnit != SECONDS)  throw new IllegalArgumentException("Unsupported ChronoUnits used.");

        long firstRun = nanosOf(runnable);
        var total = BigDecimal.valueOf(firstRun);
        var min = BigDecimal.valueOf(firstRun);
        var max = BigDecimal.valueOf(firstRun);

        int loopingRuns = runs - 1;

        for (int i = 0; i < loopingRuns; ++i)  {
            var nanosOfRunnable = BigDecimal.valueOf(nanosOf(runnable));
            total = total.add(nanosOfRunnable);
            if (nanosOfRunnable.compareTo(max) > 0) max = nanosOfRunnable;
            else if (nanosOfRunnable.compareTo(max) < 0) min = nanosOfRunnable;
        }

        var avg = total.divide(BigDecimal.valueOf(runs), MathContext.DECIMAL128);

        return switch(timeUnit) {
            case NANOS ->  new PerformanceReport(total, avg, max, min);
            case MILLIS -> new PerformanceReport(nanosToMillis(total), nanosToMillis(avg), nanosToMillis(max), nanosToMillis(min));
            case SECONDS -> new PerformanceReport(nanosToSecs(total), nanosToSecs(avg), nanosToSecs(max), nanosToSecs(min));
            default -> throw new IllegalArgumentException("Unit is unsupported");
        };
    }



    private static BigDecimal nanosToMillis(final BigDecimal avgNanos) {
        return avgNanos.divide(BigDecimal.valueOf(NANOS_TO_MILLIS_MAG), MathContext.DECIMAL128);
    }

    private static BigDecimal nanosToSecs(final BigDecimal avgNanos) {
        return  avgNanos.divide(BigDecimal.valueOf(NANOS_TO_SEC_MAG), MathContext.DECIMAL128);
    }
}
