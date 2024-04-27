package com.szaumoor.utils.random;

/**
 * Record that encapsulates an interval of valid float numbers.
 *
 * @param origin The inclusive lower bound of the interval
 * @param bound The exclusive upper bound of the interval
 */
public record IntervalFloat(float origin, float bound) {
    public IntervalFloat {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Factory method to create an IntervalFloat.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalFloat of(final float origin, final float bound) {
        return new IntervalFloat(origin, bound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
