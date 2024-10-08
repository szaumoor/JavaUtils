package com.szaumoor.utils.containers;

import static java.util.Objects.requireNonNull;

/**
 * Utility class that encapsulates a triad of objects.
 *
 * @param first  The first object
 * @param second The second object
 * @param third  The third object
 * @param <T>    The type of the first object
 * @param <S>    The type of the second object
 * @param <R>    The type of the third object
 */
public record Triad<T, S, R>(T first, S second, R third) {
    @Override
    public String toString() {
        return "Triad[" + first + ", " + second + ", " + third + "]";
    }

    /**
     * Factory method to get a Triad. It checks for null in the parameters,
     * and throws an exception if null is found
     *
     * @param first  The first object
     * @param second The second object
     * @param third  The third object
     * @param <T>    The type of the first object
     * @param <S>    The type of the second object
     * @param <R>    The type of the third object
     */
    public static <T, S, R> Triad<T, S, R> of( final T first, final S second, final R third ) {
        return new Triad<>( requireNonNull( first ),
                requireNonNull( second ),
                requireNonNull( third )
        );
    }
}
