package com.szaumoor.utils.containers;

import static java.util.Objects.requireNonNull;

/**
 * Utility class that encapsulates a pair of objects.
 *
 * @param first  The first object
 * @param second The second object
 * @param <T>    The type of the first object
 * @param <S>    The type of the second object
 */
public record Pair<T, S>(T first, S second) {

    @Override
    public String toString() {
        return "Pair[" + first + ", " + second + "]";
    }

    /**
     * Factory method to get a Triad. It checks for null, and throws an exception
     * if null is found.
     *
     * @param first  The first object
     * @param second The second object
     * @param <T>    The type of the first object
     * @param <S>    The type of the second object
     */
    public static <T, S> Pair<T, S> of(T first, S second) {
        return new Pair<>(
                requireNonNull(first),
                requireNonNull(second)
        );
    }
}
