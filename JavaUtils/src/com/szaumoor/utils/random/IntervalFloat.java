package com.szaumoor.utils.random;

import com.szaumoor.utils.datatypes.Numbers;

/**
 * Record that encapsulates an interval of valid float numbers.
 *
 * @param origin The inclusive lower bound of the interval
 * @param bound The exclusive upper bound of the interval
 */
public record IntervalFloat(float origin, float bound) {
    /**
     * Canonical constructor for this record.
     *
     * @param origin The inclusive lower bound of the interval. Must be lower than bound.
     * @param bound The exclusive upper bound of the interval. Must be higher than origin.
     * @throws IllegalArgumentException if origin is equal or higher than bound
     */
    public IntervalFloat {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Version of the constructor that assumes an origin of zero, for convenience.
     *
     * @param bound The exclusive upper bound of the interval. Must be higher than 0.
     * @throws IllegalArgumentException if bound is equal or less than zero
     */
    public IntervalFloat(final float bound) {
        this(0.0F, bound);
    }

    /**
     * Factory method to create an IntervalFloat. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalFloat of(final float origin, final float bound) {
        return new IntervalFloat(origin, bound);
    }

    /**
     * Factory method to create an IntervalFloat starting from zero. It only exists
     * to provide an alternate, perhaps more readable syntax.
     *
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalFloat until(final float bound) {
        return new IntervalFloat(bound);
    }

    /**
     * Checks if the given number is within this interval, as per the
     * {@link Numbers#between(float, float, float)} method.
     *
     * @param number The number to check
     * @return True if it is within this interval, false otherwise
     */
    public boolean accepts(final float number) {
        return Numbers.between(origin, number, bound);
    }

    /**
     * Checks if the given number is not within this interval, as per the
     * {@link Numbers#notBetween(float, float, float)} method.
     *
     * @param number The number to check
     * @return True if it is outside this interval, false otherwise
     */
    public boolean rejects(final float number) {
        return !accepts(number);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
