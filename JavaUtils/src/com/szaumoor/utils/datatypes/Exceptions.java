package com.szaumoor.utils.datatypes;

import java.util.Collection;
import java.util.function.Predicate;

import static com.szaumoor.utils.datatypes.Nulls.anyNull;

/**
 * Utility class with functions that throw exceptions based on various checks.
 */
public final class Exceptions {
    private Exceptions() {
        throw new AssertionError("Utility class");
    }

    /**
     * Throws a RuntimeException with the specified message if any of the provided objects fulfill the passed predicate.
     *
     * @param objects Objects to test
     * @param condition Condition to test for
     * @param exceptionMsg The message that should go with the RuntimeException.
     * @param <T> The type of the object
     */
    public static <T> void throwIfAny(final Collection<T> objects, final Predicate<T> condition, final String exceptionMsg) {
        throwIfAny(objects, condition, new RuntimeException(exceptionMsg));
    }

    /**
     * Throws the specified RuntimeException if any of the provided objects fulfill the passed predicate.
     *
     * @param objects Objects to test
     * @param condition Condition to test for
     * @param exception The RuntimeException that the method should throw is needed.
     * @param <T> The type of the object
     */
    public static <T> void throwIfAny(final Collection<T> objects, final Predicate<T> condition, final RuntimeException exception) {
        boolean anyFound = objects.stream().anyMatch(condition);
        if (anyFound) throw exception;
    }


    /**
     * Throws a NullPointerException if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2) {
        throwIfAnyNull("", obj1, obj2);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2) {
        if (anyNull(obj1, obj2)) throw exception;
    }

    /**
     * Throws a NullPointerException if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3) {
        throwIfAnyNull("", obj1, obj2, obj3);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3) {
        if (anyNull(obj1, obj2, obj3)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4) {
        if (anyNull(obj1, obj2, obj3, obj4)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5, obj6);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5, obj6);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     * @param obj6      Sixth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5, final Object obj6) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5, obj6)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     * @param obj6      Sixth object to check
     * @param obj7      Seventh object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5, final Object obj6, final Object obj7) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5, obj6, obj7)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     * @param obj8 Eighth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     * @param obj8 Eighth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     * @param obj6      Sixth object to check
     * @param obj7      Seventh object to check
     * @param obj8      Eighth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5, final Object obj6, final Object obj7, final Object obj8) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     * @param obj8 Eighth object to check
     * @param obj9 Ninth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param obj1 First object to check
     * @param obj2 Second object to check
     * @param obj3 Third object to check
     * @param obj4 Fourth object to check
     * @param obj5 Fifth object to check
     * @param obj6 Sixth object to check
     * @param obj7 Seventh object to check
     * @param obj8 Eighth object to check
     * @param obj9 Ninth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     * @param obj6      Sixth object to check
     * @param obj7      Seventh object to check
     * @param obj8      Eighth object to check
     * @param obj9      Ninth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9)) throw exception;
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param obj1  First object to check
     * @param obj2  Second object to check
     * @param obj3  Third object to check
     * @param obj4  Fourth object to check
     * @param obj5  Fifth object to check
     * @param obj6  Sixth object to check
     * @param obj7  Seventh object to check
     * @param obj8  Eighth object to check
     * @param obj9  Ninth object to check
     * @param obj10 Tenth object to check
     */
    public static void throwIfAnyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        throwIfAnyNull("", obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg   The message to go with the NullPointerException
     * @param obj1  First object to check
     * @param obj2  Second object to check
     * @param obj3  Third object to check
     * @param obj4  Fourth object to check
     * @param obj5  Fifth object to check
     * @param obj6  Sixth object to check
     * @param obj7  Seventh object to check
     * @param obj8  Eighth object to check
     * @param obj9  Ninth object to check
     * @param obj10 Tenth object to check
     */
    public static void throwIfAnyNull(final String msg, final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                      final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        throwIfAnyNull(new NullPointerException(msg), obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param obj1      First object to check
     * @param obj2      Second object to check
     * @param obj3      Third object to check
     * @param obj4      Fourth object to check
     * @param obj5      Fifth object to check
     * @param obj6      Sixth object to check
     * @param obj7      Seventh object to check
     * @param obj8      Eighth object to check
     * @param obj9      Ninth object to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                      final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        if (anyNull(obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10)) throw exception;
    }


    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param objs Objects to check
     */
    public static void throwIfAnyNull(final Object... objs) {
        throwIfAnyNull("", objs);
    }

    /**
     * Throws a NullPointerException with a specific message if any parameter is null.
     *
     * @param msg  The message to go with the NullPointerException
     * @param objs Objects to check
     */
    public static void throwIfAnyNull(final String msg, final Object... objs) {
        throwIfAnyNull(new NullPointerException(msg), objs);
    }

    /**
     * Throws the provided RuntimeException if any parameter is null.
     *
     * @param exception The exception to throw
     * @param objs Objects to check
     */
    public static void throwIfAnyNull(final RuntimeException exception, final Object... objs) {
        if (anyNull(objs)) throw exception;
    }
}
