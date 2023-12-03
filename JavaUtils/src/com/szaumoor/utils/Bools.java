package com.szaumoor.utils;

import java.util.Arrays;

/**
 * This is a utility class that provides functions designed to test boolean values with different types of logical operations.
 * @author Szaumoor
 * @version 1.0
 */
public enum Bools {
    ;

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2) {
        return b1 && b2;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3) {
        return b1 && b2 && b3;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4) {
        return b1 && b2 && b3 && b4;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return b1 && b2 && b3 && b4 && b5;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        return b1 && b2 && b3 && b4 && b5 && b6;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7) {
        return b1 && b2 && b3 && b4 && b5 && b6 && b7;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8) {
        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9) {
        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 && b10;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final Boolean ... bools) {
        return Arrays.stream(bools).allMatch(aBoolean -> aBoolean);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2) {
        return !allTrue(b1, b2);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3) {
        return !allTrue(b1, b2, b3);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4) {
        return !allTrue(b1, b2, b3, b4);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return !allTrue(b1, b2, b3, b4, b5);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        return !allTrue(b1, b2, b3, b4, b5, b6);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7) {
        return !allTrue(b1, b2, b3, b4, b5, b6, b7);
    }


    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8) {
        return !allTrue(b1, b2, b3, b4, b5, b6, b7, b8);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9) {
        return !allTrue(b1, b2, b3, b4, b5, b6, b7, b8, b9);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return !allTrue(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10);
    }

    /**
     * Returns the result of the logical NOT AND operation on the given values.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical NOT AND operation.
     */
    public static boolean allFalse(final Boolean ... bools) {
        return Arrays.stream(bools).noneMatch(aBoolean -> aBoolean);
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2) {
        return !b1 || !b2;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3) {
        return !b1 || !b2 || !b3;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4) {
        return !b1 || !b2 || !b3 || !b4;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return !b1 || !b2 || !b3 || !b4 || !b5;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6 || !b7;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6 || !b7 || !b8;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8, final boolean b9) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6 || !b7 || !b8 || !b9;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6 || !b7 || !b8 || !b9 || !b10;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final Boolean ... bools) {
        return Arrays.stream(bools).anyMatch(aBoolean -> !aBoolean);
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2) {
        return b1 || b2;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3) {
        return b1 || b2 || b3;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4) {
        return b1 || b2 || b3 || b4;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return b1 || b2 || b3 || b4 || b5;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5, final boolean b6) {
        return b1 || b2 || b3 || b4 || b5 || b6;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7) {
        return b1 || b2 || b3 || b4 || b5 || b6 || b7;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8) {
        return b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8, final boolean b9) {
        return b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8 || b9;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param b1 The first value.
     * @param b2 The second value.
     * @param b3 The third value.
     * @param b4 The fourth value.
     * @param b5 The fifth value.
     * @param b6 The sixth value.
     * @param b7 The seventh value.
     * @param b8 The eighth value.
     * @param b9 The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8 || b9 || b10;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final Boolean ... bools) {
        return Arrays.stream(bools).anyMatch(aBoolean -> aBoolean);
    }
}
