package com.szaumoor.utils.random;

import com.szaumoor.utils.datatypes.Numbers;

/**
 * Record that encapsulates an interval of valid integer numbers.
 *
 * @param origin The inclusive lower bound of the interval. Must be lower than bound.
 * @param bound The exclusive upper bound of the interval. Must be higher than origin.
 */
public record IntervalInt(int origin, int bound) {
    /**
     * Canonical constructor for this record.
     *
     * @param origin The inclusive lower bound of the interval. Must be lower than bound.
     * @param bound The exclusive upper bound of the interval. Must be higher than origin.
     * @throws IllegalArgumentException if origin is equal or higher than bound
     */
    public IntervalInt {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Version of the constructor that assumes an origin of zero, for convenience.
     *
     * @param bound The exclusive upper bound of the interval. Must be higher than 0.
     * @throws IllegalArgumentException if bound is equal or less than zero
     */
    public IntervalInt(final int bound) {
        this(0, bound);
    }

    /**
     * Factory method to create an IntervalInt. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalInt of(final int origin, final int bound) {
        return new IntervalInt(origin, bound);
    }

    /**
     * Factory method to create an IntervalInt starting from zero. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalInt until(final int bound) {
        return new IntervalInt(bound);
    }

    /**
     * Checks if the given number is within this interval, as per the
     * {@link Numbers#between(int, int, int)} method.
     *
     * @param number The number to check
     * @return True if it is within this interval, false otherwise
     */
    public boolean accepts(final int number) {
        return Numbers.between(origin, number, bound);
    }

    /**
     * Checks if the given number is not within this interval, as per the
     * {@link Numbers#notBetween(int, int, int)} method.
     *
     * @param number The number to check
     * @return True if it is outside this interval, false otherwise
     */
    public boolean rejects(final int number) {
        return !accepts(number);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
