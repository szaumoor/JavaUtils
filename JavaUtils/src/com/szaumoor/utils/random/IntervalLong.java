package com.szaumoor.utils.random;

/**
 * Record that encapsulates an interval of valid long integer numbers.
 *
 * @param origin The inclusive lower bound of the interval
 * @param bound The exclusive upper bound of the interval
 */
public record IntervalLong(long origin, long bound) {
    public IntervalLong {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Factory method to create an IntervalLong.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalLong of(final long origin, final long bound) {
        return new IntervalLong(origin, bound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}

