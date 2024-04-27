package com.szaumoor.utils.random;

/**
 * Record that encapsulates an interval of valid integer numbers.
 *
 * @param origin The inclusive lower bound of the interval
 * @param bound The exclusive upper bound of the interval
 */
public record IntervalInt(int origin, int bound) {
    public IntervalInt {
        if (bound <= origin) throw new IllegalArgumentException();
    }

    /**
     * Factory method to create an IntervalInt.
     *
     * @param origin The inclusive lower bound of the interval
     * @param bound The exclusive upper bound of the interval
     */
    public static IntervalInt of(final int origin, final int bound) {
        return new IntervalInt(origin, bound);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + origin + ", " + bound + "]";
    }
}
