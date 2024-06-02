package com.szaumoor.utils.random;

import com.szaumoor.utils.datatypes.Numbers;

/**
 * Record that encapsulates an interval of valid double numbers.
 *
 * @param origin The inclusive lower bound of the interval. Must be lower than bound.
 * @param bound The exclusive upper bound of the interval. Must be higher than origin.
 */
public record IntervalDouble(double origin, double bound) {
    /**
     * Canonical constructor for this record.
     *
     * @param origin The inclusive lower bound of the interval. Must be lower than bound.
     * @param bound The exclusive upper bound of the interval. Must be higher than origin.
     * @throws IllegalArgumentException if origin is equal or higher than bound
     */
    public IntervalDouble {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Version of the constructor that assumes an origin of zero, for convenience.
     *
     * @param bound The exclusive upper bound of the interval. Must be higher than 0.
     * @throws IllegalArgumentException if bound is equal or less than zero
     */
    public IntervalDouble(final double bound) {
        this(0.0, bound);
    }

    /**
     * Factory method to create an IntervalDouble. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalDouble of(final double origin, final double bound) {
        return new IntervalDouble(origin, bound);
    }

    /**
     * Factory method to create an IntervalDouble starting from zero. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalDouble until(final double bound) {
        return new IntervalDouble(bound);
    }

    /**
     * Checks if the given number is within this interval, as per the
     * {@link Numbers#between(double, double, double)} method.
     *
     * @param number The number to check
     * @return True if it is within this interval, false otherwise
     */
    public boolean accepts(final double number) {
        return Numbers.between(origin, number, bound);
    }

    /**
     * Checks if the given number is not within this interval, as per the
     * {@link Numbers#notBetween(double, double, double)} method.
     *
     * @param number The number to check
     * @return True if it is outside this interval, false otherwise
     */
    public boolean rejects(final double number) {
        return !accepts(number);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
