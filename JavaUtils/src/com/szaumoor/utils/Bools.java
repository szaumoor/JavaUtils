package com.szaumoor.utils;

/**
 * This is a utility class that provides functions designed to test boolean values with different types of logical operations.
 */
public final class Bools {
    private Bools() {
        throw new AssertionError("Utility class");
    }

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
     * @param b1  The first value.
     * @param b2  The second value.
     * @param b3  The third value.
     * @param b4  The fourth value.
     * @param b5  The fifth value.
     * @param b6  The sixth value.
     * @param b7  The seventh value.
     * @param b8  The eighth value.
     * @param b9  The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return b1 && b2 && b3 && b4 && b5 && b6 && b7 && b8 && b9 && b10;
    }

    /**
     * Returns the result of the logical AND operation on the given values.
     * It will be considered false if the array passed is empty.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical AND operation.
     */
    public static boolean allTrue(final boolean... bools) {
        if (bools.length == 0) return false;
        for (final boolean bool : bools) {
            if (!bool) return false;
        }
        return true;
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
     * @param b1  The first value.
     * @param b2  The second value.
     * @param b3  The third value.
     * @param b4  The fourth value.
     * @param b5  The fifth value.
     * @param b6  The sixth value.
     * @param b7  The seventh value.
     * @param b8  The eighth value.
     * @param b9  The ninth value.
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
    public static boolean allFalse(final boolean... bools) {
        if (bools.length == 0) return false;
        for (final boolean bool : bools) {
            if (bool) return false;
        }
        return true;
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
     * @param b1  The first value.
     * @param b2  The second value.
     * @param b3  The third value.
     * @param b4  The fourth value.
     * @param b5  The fifth value.
     * @param b6  The sixth value.
     * @param b7  The seventh value.
     * @param b8  The eighth value.
     * @param b9  The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                   final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return !b1 || !b2 || !b3 || !b4 || !b5 || !b6 || !b7 || !b8 || !b9 || !b10;
    }

    /**
     * Returns the result of the logical NOT OR operation on the given values.
     * An empty array will return false.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical NOT OR operation.
     */
    public static boolean anyFalse(final boolean... bools) {
        for (final boolean b : bools) if (!b) return true;
        return false;
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
     * @param b1  The first value.
     * @param b2  The second value.
     * @param b3  The third value.
     * @param b4  The fourth value.
     * @param b5  The fifth value.
     * @param b6  The sixth value.
     * @param b7  The seventh value.
     * @param b8  The eighth value.
     * @param b9  The ninth value.
     * @param b10 The tenth value.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean b1, final boolean b2, final boolean b3, final boolean b4, final boolean b5,
                                  final boolean b6, final boolean b7, final boolean b8, final boolean b9, final boolean b10) {
        return b1 || b2 || b3 || b4 || b5 || b6 || b7 || b8 || b9 || b10;
    }

    /**
     * Returns the result of the logical OR operation on the given values.
     * An empty array will return false.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical OR operation.
     */
    public static boolean anyTrue(final boolean... bools) {
        for (final boolean bool : bools) if (bool) return true;
        return false;
    }

    /**
     * Returns the result of the logical XOR operation on the given values, such that
     * it returns true only if one of the elements is true.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical XOR operation.
     */
    public static boolean oneTrue(final boolean... bools) {
        var count = 0;
        for (var bool : bools) if (bool) count++;
        return count == 1;
    }

    /**
     * Returns the result of the logical XNOR operation on the given values, such that
     * it returns true only if one of the elements is false.
     *
     * @param bools The array containing the arbitrary number of values to check.
     * @return The result of the logical XOR operation.
     */
    public static boolean oneFalse(final boolean... bools) {
        var count = 0;
        for (var bool : bools) if (!bool) count++;
        return count == 1;
    }

    /**
     * Calculates whether a specified number of Booleans are true.
     *
     * @param matches the number of Booleans that must be true
     * @param orMore  if true, only checks if the exact number of Booleans are true; if false, checks if at least the specified number of Booleans are true
     * @param bools   the array of Booleans to be checked
     * @return true if the specified number of Booleans is true; false otherwise
     */
    public static boolean someTrue(final int matches, final boolean orMore, final boolean... bools) {
        if (matches < 1) throw new IllegalArgumentException("Matches must be at least 1");
        if (bools.length == 0) return false;
        var count = 0;
        for (var bool : bools) {
            if (bool) {
                count++;
                if (!orMore && count > matches) return false;
            }
        }
        if (orMore) return count >= matches;
        return count == matches;
    }

    /**
     * Calculates whether a specified number of Booleans are false.
     *
     * @param matches the number of Booleans that must be true
     * @param orMore  if true, only checks if the exact number of Booleans are true; if false, checks if at least the specified number of Booleans are true
     * @param bools   the array of Booleans to be checked
     * @return true if the specified number of Booleans is true; false otherwise
     */
    public static boolean someFalse(final int matches, final boolean orMore, final boolean... bools) {
        if (matches < 1) throw new IllegalArgumentException("Matches must be at least 1");
        if (bools.length == 0) return false;
        var count = 0;
        for (var bool : bools) {
            if (!bool) {
                count++;
                if (!orMore && count > matches) return false;
            }
        }
        if (orMore) return count >= matches;
        return count == matches;
    }
}
