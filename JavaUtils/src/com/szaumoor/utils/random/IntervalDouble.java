package com.szaumoor.utils.random;

/**
 * Record that encapsulates an interval of valid double numbers.
 *
 * @param origin The inclusive lower bound of the interval
 * @param bound The exclusive upper bound of the interval
 */
public record IntervalDouble(double origin, double bound) {
    public IntervalDouble {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Factory method to create an IntervalDouble.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalDouble of(final double origin, final double bound) {
        return new IntervalDouble(origin, bound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
