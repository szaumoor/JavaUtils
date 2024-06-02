package com.szaumoor.utils.datatypes;

import java.util.*;

/**
 * Utility class that provides functions designed to test optional values with different types of logical operations.
 */
public final class Optionals {
    private Optionals() {
        throw new AssertionError("Utility class");
    }

    /**
     * Boxes an OptionalInt into an Optional<Integer>.
     *
     * @param  opInt  the OptionalInt to box
     * @return          an Optional<Integer> containing the boxed value
     */
    public static Optional<Integer> boxInt(final OptionalInt opInt) {
        return opInt.stream().boxed().findFirst();
    }

    /**
     * Converts an Optional<Integer> to an OptionalInt by unboxing the Integer value.
     *
     * @param  integer  the Optional<Integer> to be unboxed
     * @return          an OptionalInt containing the unboxed value, or an empty OptionalInt if the input is empty
     */
    public static OptionalInt unboxInt(final Optional<Integer> integer) {
        return integer.stream().mapToInt(i -> i).findFirst();
    }

    /**
     * Boxes an OptionalInt into an Optional<Long>.
     *
     * @param  opLong  the OptionalLong to box
     * @return          an Optional<Long> containing the boxed value
     */
    public static Optional<Long> boxLong(final OptionalLong opLong) {
        return opLong.stream().boxed().findFirst();
    }

    /**
     * Converts an Optional<Long> to an OptionalLong by unboxing the Integer value.
     *
     * @param  opLong  the Optional<Long> to be unboxed
     * @return          an OptionalLong containing the unboxed value, or an empty OptionalInt if the input is empty
     */
    public static OptionalLong unboxLong(final Optional<Long> opLong) {
        return opLong.stream().mapToLong(l -> l).findFirst();
    }

    /**
     * Boxes an OptionalInt into an Optional<Double>.
     *
     * @param  opDouble  the OptionalDouble to box
     * @return          an Optional<Double> containing the boxed value
     */
    public static Optional<Double> boxDouble(final OptionalDouble opDouble) {
        return opDouble.stream().boxed().findFirst();
    }

    /**
     * Converts an Optional<Long> to an OptionalDouble by unboxing the Double value.
     *
     * @param  opDouble  the Optional<Long> to be unboxed
     * @return          an OptionalDouble containing the unboxed value, or an empty OptionalDouble if the input is empty
     */
    public static OptionalDouble unboxDouble(final Optional<Double> opDouble) {
        return opDouble.stream().mapToDouble(d -> d).findFirst();
    }

    /**
     * Determines if both optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if both optional values are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2) {
        return op1.isPresent() && op2.isPresent();
    }

    /**
     * Check if all three optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @return true if all three optional parameters are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent();
    }

    /**
     * Check if all three optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @param op4 the fourth optional parameter
     * @return true if all three optional parameters are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent();
    }

    /**
     * Checks if all the optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent();
    }

    /**
     * Checks if all the optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @param op4 the fourth optional parameter
     * @param op5 the fifth optional parameter
     * @param op6 the sixth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent();
    }

    /**
     * Determines if all the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent();
    }

    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent();
    }

    /**
     * Checks if all the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @param op8 the eighth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent();
    }

    /**
     * Checks if all the given optional parameters are present.
     *
     * @param op1  the first optional parameter
     * @param op2  the second optional parameter
     * @param op3  the third optional parameter
     * @param op4  the fourth optional parameter
     * @param op5  the fifth optional parameter
     * @param op6  the sixth optional parameter
     * @param op7  the seventh optional parameter
     * @param op8  the eighth optional parameter
     * @param op9  the ninth optional parameter
     * @param op10 the tenth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9, final Optional<?> op10) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent() && op10.isPresent();
    }

    /**
     * Check if all the given Optional objects are present.
     *
     * @param optionals the Optional objects to check
     * @return true if all the Optional objects are present, false otherwise
     */
    public static boolean allPresent(final Optional<?>... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(Optional::isPresent);
    }

    /**
     * Determines if either of the given optional values is present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2) {
        return op1.isPresent() || op2.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent();
    }

    /**
     * Determines whether any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent();
    }

    /**
     * Checks if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent();
    }

    /**
     * Checks if any of the given optional values are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent();
    }

    /**
     * Checks if all the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if all the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent();
    }

    /**
     * Checks if all the given Optional objects are present.
     *
     * @param op1  the first Optional object
     * @param op2  the second Optional object
     * @param op3  the third Optional object
     * @param op4  the fourth Optional object
     * @param op5  the fifth Optional object
     * @param op6  the sixth Optional object
     * @param op7  the seventh Optional object
     * @param op8  the eighth Optional object
     * @param op9  the ninth Optional object
     * @param op10 the tenth Optional object
     * @return true if all the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                     final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9, final Optional<?> op10) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent() || op10.isPresent();
    }

    /**
     * Checks if any of the given optionals are present.
     *
     * @param optionals the optionals to check
     * @return true if any of the optionals are present, false otherwise
     */
    public static boolean anyPresent(final Optional<?>... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(Optional::isPresent);
    }

    /**
     * Determines if both Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @return true if both Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2) {
        return op1.isEmpty() && op2.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if all the given Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty();
    }

    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty();
    }

    /**
     * Checks if all the input optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if all the input optional values are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty();
    }

    /**
     * Checks if all the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty();
    }

    /**
     * Checks if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @param op8 the eighth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1  the first Optional parameter
     * @param op2  the second Optional parameter
     * @param op3  the third Optional parameter
     * @param op4  the fourth Optional parameter
     * @param op5  the fifth Optional parameter
     * @param op6  the sixth Optional parameter
     * @param op7  the seventh Optional parameter
     * @param op8  the eighth Optional parameter
     * @param op9  the ninth Optional parameter
     * @param op10 the tenth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9, final Optional<?> op10) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty() && op10.isEmpty();
    }

    /**
     * A function that checks if all the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects
     * @return a boolean value indicating whether all the optionals are empty
     */
    public static boolean allEmpty(final Optional<?>... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(Optional::isEmpty);
    }

    /**
     * Determines if either of the given optional values is empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2) {
        return op1.isEmpty() || op2.isEmpty();
    }

    /**
     * Determines if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty();
    }

    /**
     * Checks if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty();
    }

    /**
     * Determines if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @return true if any of the Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty();
    }

    /**
     * A function that checks if any of the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects is empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @param op5 the fifth Optional object to check
     * @param op6 the sixth Optional object to check
     * @param op7 the seventh Optional object to check
     * @param op8 the eighth Optional object to check
     * @param op9 the ninth Optional object to check
     * @return true if any of the given Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty();
    }

    /**
     * Checks if any of the given Optional parameters are empty.
     *
     * @param op1  Optional parameter 1
     * @param op2  Optional parameter 2
     * @param op3  Optional parameter 3
     * @param op4  Optional parameter 4
     * @param op5  Optional parameter 5
     * @param op6  Optional parameter 6
     * @param op7  Optional parameter 7
     * @param op8  Optional parameter 8
     * @param op9  Optional parameter 9
     * @param op10 Optional parameter 10
     * @return true if any of the given Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?> op1, final Optional<?> op2, final Optional<?> op3, final Optional<?> op4, final Optional<?> op5,
                                   final Optional<?> op6, final Optional<?> op7, final Optional<?> op8, final Optional<?> op9, final Optional<?> op10) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty() || op10.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects to be checked
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final Optional<?>... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(Optional::isEmpty);
    }

    /**
     * Determines if both optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if both optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2) {
        return op1.isPresent() && op2.isPresent();
    }

    /**
     * Check if all three optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @return true if all three optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent();
    }

    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent();
    }

    /**
     * Checks if all the optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent();
    }

    /**
     * Checks if all the optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @param op4 the fourth optional parameter
     * @param op5 the fifth optional parameter
     * @param op6 the sixth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent();
    }

    /**
     * Determines if all the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent();
    }

    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent();
    }

    /**
     * Checks if all the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @param op8 the eighth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent();
    }

    /**
     * Checks if all the given optional parameters are present.
     *
     * @param op1  the first optional parameter
     * @param op2  the second optional parameter
     * @param op3  the third optional parameter
     * @param op4  the fourth optional parameter
     * @param op5  the fifth optional parameter
     * @param op6  the sixth optional parameter
     * @param op7  the seventh optional parameter
     * @param op8  the eighth optional parameter
     * @param op9  the ninth optional parameter
     * @param op10 the tenth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9, final OptionalInt op10) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent() && op10.isPresent();
    }

    /**
     * Check if all the given Optional objects are present.
     *
     * @param optionals the Optional objects to check
     * @return true if all the Optional objects are present, false otherwise
     */
    public static boolean allPresent(final OptionalInt... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalInt::isPresent);
    }

    /**
     * Determines if either of the given optional values is present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2) {
        return op1.isPresent() || op2.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent();
    }

    /**
     * Determines whether any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent();
    }

    /**
     * Checks if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1  the first Optional object
     * @param op2  the second Optional object
     * @param op3  the third Optional object
     * @param op4  the fourth Optional object
     * @param op5  the fifth Optional object
     * @param op6  the sixth Optional object
     * @param op7  the seventh Optional object
     * @param op8  the eighth Optional object
     * @param op9  the ninth Optional object
     * @param op10 the tenth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                     final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9, final OptionalInt op10) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent() || op10.isPresent();
    }

    /**
     * Checks if any of the given optionals are present.
     *
     * @param optionals the optionals to check
     * @return true if any of the optionals are present, false otherwise
     */
    public static boolean anyPresent(final OptionalInt... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalInt::isPresent);
    }

    /**
     * Determines if both Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @return true if both Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2) {
        return op1.isEmpty() && op2.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if all the given Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty();
    }

    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty();
    }

    /**
     * Checks if all the input optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if all the input optional values are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty();
    }

    /**
     * Checks if all the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty();
    }

    /**
     * Checks if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @param op8 the eighth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1  the first Optional parameter
     * @param op2  the second Optional parameter
     * @param op3  the third Optional parameter
     * @param op4  the fourth Optional parameter
     * @param op5  the fifth Optional parameter
     * @param op6  the sixth Optional parameter
     * @param op7  the seventh Optional parameter
     * @param op8  the eighth Optional parameter
     * @param op9  the ninth Optional parameter
     * @param op10 the tenth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9, final OptionalInt op10) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty() && op10.isEmpty();
    }

    /**
     * A function that checks if all the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects
     * @return a boolean value indicating whether all the optionals are empty
     */
    public static boolean allEmpty(final OptionalInt... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalInt::isEmpty);
    }

    /**
     * Determines if either of the given optional values is empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2) {
        return op1.isEmpty() || op2.isEmpty();
    }

    /**
     * Determines if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty();
    }

    /**
     * Checks if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty();
    }

    /**
     * Determines if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @return true if any of the Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty();
    }

    /**
     * Checks if any of the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects is empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @param op5 the fifth Optional object to check
     * @param op6 the sixth Optional object to check
     * @param op7 the seventh Optional object to check
     * @param op8 the eighth Optional object to check
     * @param op9 the ninth Optional object to check
     * @return true if any of the given Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty();
    }

    /**
     * Checks if any of the given Optional parameters are empty.
     *
     * @param op1  Optional parameter 1
     * @param op2  Optional parameter 2
     * @param op3  Optional parameter 3
     * @param op4  Optional parameter 4
     * @param op5  Optional parameter 5
     * @param op6  Optional parameter 6
     * @param op7  Optional parameter 7
     * @param op8  Optional parameter 8
     * @param op9  Optional parameter 9
     * @param op10 Optional parameter 10
     * @return true if any of the given Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt op1, final OptionalInt op2, final OptionalInt op3, final OptionalInt op4, final OptionalInt op5,
                                   final OptionalInt op6, final OptionalInt op7, final OptionalInt op8, final OptionalInt op9, final OptionalInt op10) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty() || op10.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects to be checked
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalInt... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalInt::isEmpty);
    }

    /**
     * Determines if both optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if both optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2) {
        return op1.isPresent() && op2.isPresent();
    }

    /**
     * Check if all three optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @return true if all three optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent();
    }

    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent();
    }

    /**
     * Checks if all the optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent();
    }

    /**
     * Checks if all the optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @param op4 the fourth optional parameter
     * @param op5 the fifth optional parameter
     * @param op6 the sixth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent();
    }

    /**
     * Determines if all the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent();
    }

    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent();
    }

    /**
     * Checks if all the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @param op8 the eighth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent();
    }

    /**
     * Checks if all the given optional parameters are present.
     *
     * @param op1  the first optional parameter
     * @param op2  the second optional parameter
     * @param op3  the third optional parameter
     * @param op4  the fourth optional parameter
     * @param op5  the fifth optional parameter
     * @param op6  the sixth optional parameter
     * @param op7  the seventh optional parameter
     * @param op8  the eighth optional parameter
     * @param op9  the ninth optional parameter
     * @param op10 the tenth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9, final OptionalLong op10) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent() && op10.isPresent();
    }

    /**
     * Check if all the given Optional objects are present.
     *
     * @param optionals the Optional objects to check
     * @return true if all the Optional objects are present, false otherwise
     */
    public static boolean allPresent(final OptionalLong... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalLong::isPresent);
    }

    /**
     * Determines if either of the given optional values is present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2) {
        return op1.isPresent() || op2.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent();
    }

    /**
     * Determines whether any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent();
    }

    /**
     * Checks if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1  the first Optional object
     * @param op2  the second Optional object
     * @param op3  the third Optional object
     * @param op4  the fourth Optional object
     * @param op5  the fifth Optional object
     * @param op6  the sixth Optional object
     * @param op7  the seventh Optional object
     * @param op8  the eighth Optional object
     * @param op9  the ninth Optional object
     * @param op10 the tenth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                     final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9, final OptionalLong op10) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent() || op10.isPresent();
    }

    /**
     * Checks if any of the given optionals are present.
     *
     * @param optionals the optionals to check
     * @return true if any of the optionals are present, false otherwise
     */
    public static boolean anyPresent(final OptionalLong... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalLong::isPresent);
    }

    /**
     * Determines if both Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @return true if both Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2) {
        return op1.isEmpty() && op2.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if all the given Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty();
    }

    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty();
    }

    /**
     * Checks if all the input optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if all the input optional values are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty();
    }

    /**
     * Checks if all the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty();
    }

    /**
     * Checks if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @param op8 the eighth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1  the first Optional parameter
     * @param op2  the second Optional parameter
     * @param op3  the third Optional parameter
     * @param op4  the fourth Optional parameter
     * @param op5  the fifth Optional parameter
     * @param op6  the sixth Optional parameter
     * @param op7  the seventh Optional parameter
     * @param op8  the eighth Optional parameter
     * @param op9  the ninth Optional parameter
     * @param op10 the tenth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9, final OptionalLong op10) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty() && op10.isEmpty();
    }

    /**
     * A function that checks if all the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects
     * @return a boolean value indicating whether all the optionals are empty
     */
    public static boolean allEmpty(final OptionalLong... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalLong::isEmpty);
    }

    /**
     * Determines if either of the given optional values is empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2) {
        return op1.isEmpty() || op2.isEmpty();
    }

    /**
     * Determines if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty();
    }

    /**
     * Checks if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty();
    }

    /**
     * Determines if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @return true if any of the Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty();
    }

    /**
     * A function that checks if any of the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects is empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @param op5 the fifth Optional object to check
     * @param op6 the sixth Optional object to check
     * @param op7 the seventh Optional object to check
     * @param op8 the eighth Optional object to check
     * @param op9 the ninth Optional object to check
     * @return true if any of the given Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty();
    }

    /**
     * Checks if any of the given Optional parameters are empty.
     *
     * @param op1  Optional parameter 1
     * @param op2  Optional parameter 2
     * @param op3  Optional parameter 3
     * @param op4  Optional parameter 4
     * @param op5  Optional parameter 5
     * @param op6  Optional parameter 6
     * @param op7  Optional parameter 7
     * @param op8  Optional parameter 8
     * @param op9  Optional parameter 9
     * @param op10 Optional parameter 10
     * @return true if any of the given Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong op1, final OptionalLong op2, final OptionalLong op3, final OptionalLong op4, final OptionalLong op5,
                                   final OptionalLong op6, final OptionalLong op7, final OptionalLong op8, final OptionalLong op9, final OptionalLong op10) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty() || op10.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects to be checked
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalLong... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalLong::isEmpty);
    }

    /**
     * Determines if both optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if both optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2) {
        return op1.isPresent() && op2.isPresent();
    }

    /**
     * Check if all three optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @return true if all three optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent();
    }

    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent();
    }

    /**
     * Checks if all the optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent();
    }

    /**
     * Checks if all the optional parameters are present.
     *
     * @param op1 the first optional parameter
     * @param op2 the second optional parameter
     * @param op3 the third optional parameter
     * @param op4 the fourth optional parameter
     * @param op5 the fifth optional parameter
     * @param op6 the sixth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent();
    }

    /**
     * Determines if all the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent();
    }

    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent();
    }

    /**
     * Checks if all the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @param op8 the eighth optional value
     * @return true if all optional values are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent();
    }

    /**
     * Checks if all the given optional parameters are present.
     *
     * @param op1  the first optional parameter
     * @param op2  the second optional parameter
     * @param op3  the third optional parameter
     * @param op4  the fourth optional parameter
     * @param op5  the fifth optional parameter
     * @param op6  the sixth optional parameter
     * @param op7  the seventh optional parameter
     * @param op8  the eighth optional parameter
     * @param op9  the ninth optional parameter
     * @param op10 the tenth optional parameter
     * @return true if all the optional parameters are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9, final OptionalDouble op10) {
        return op1.isPresent() && op2.isPresent() && op3.isPresent() && op4.isPresent() && op5.isPresent() && op6.isPresent() && op7.isPresent() &&
                op8.isPresent() && op9.isPresent() && op10.isPresent();
    }

    /**
     * Check if all the given Optional objects are present.
     *
     * @param optionals the Optional objects to check
     * @return true if all the Optional objects are present, false otherwise
     */
    public static boolean allPresent(final OptionalDouble... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalDouble::isPresent);
    }

    /**
     * Determines if either of the given optional values is present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2) {
        return op1.isPresent() || op2.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent();
    }

    /**
     * Determines whether any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent();
    }

    /**
     * Determines if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent();
    }

    /**
     * Checks if any of the given optional values are present.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @param op7 the seventh optional value
     * @return true if any of the optional values are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent();
    }

    /**
     * Checks if any of the given Optional parameters are present.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if any of the Optional parameters are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent();
    }

    /**
     * Checks if any of the given Optional objects are present.
     *
     * @param op1  the first Optional object
     * @param op2  the second Optional object
     * @param op3  the third Optional object
     * @param op4  the fourth Optional object
     * @param op5  the fifth Optional object
     * @param op6  the sixth Optional object
     * @param op7  the seventh Optional object
     * @param op8  the eighth Optional object
     * @param op9  the ninth Optional object
     * @param op10 the tenth Optional object
     * @return true if any of the Optional objects are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                     final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9, final OptionalDouble op10) {
        return op1.isPresent() || op2.isPresent() || op3.isPresent() || op4.isPresent() || op5.isPresent() || op6.isPresent() || op7.isPresent() ||
                op8.isPresent() || op9.isPresent() || op10.isPresent();
    }

    /**
     * Checks if any of the given optionals are present.
     *
     * @param optionals the optionals to check
     * @return true if any of the optionals are present, false otherwise
     */
    public static boolean anyPresent(final OptionalDouble... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalDouble::isPresent);
    }

    /**
     * Determines if both Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @return true if both Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2) {
        return op1.isEmpty() && op2.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if all the given Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty();
    }

    /**
     * Determines if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty();
    }

    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty();
    }

    /**
     * Checks if all the input optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if all the input optional values are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty();
    }

    /**
     * Checks if all the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty();
    }

    /**
     * Checks if all the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @param op8 the eighth Optional object
     * @return true if all the Optional objects are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @param op9 the ninth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty();
    }

    /**
     * Checks if all the provided Optional parameters are empty.
     *
     * @param op1  the first Optional parameter
     * @param op2  the second Optional parameter
     * @param op3  the third Optional parameter
     * @param op4  the fourth Optional parameter
     * @param op5  the fifth Optional parameter
     * @param op6  the sixth Optional parameter
     * @param op7  the seventh Optional parameter
     * @param op8  the eighth Optional parameter
     * @param op9  the ninth Optional parameter
     * @param op10 the tenth Optional parameter
     * @return true if all the Optional parameters are empty, false otherwise
     */
    public static boolean allEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9, final OptionalDouble op10) {
        return op1.isEmpty() && op2.isEmpty() && op3.isEmpty() && op4.isEmpty() && op5.isEmpty() && op6.isEmpty() && op7.isEmpty() &&
                op8.isEmpty() && op9.isEmpty() && op10.isEmpty();
    }

    /**
     * A function that checks if all the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects
     * @return a boolean value indicating whether all the optionals are empty
     */
    public static boolean allEmpty(final OptionalDouble... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).allMatch(OptionalDouble::isEmpty);
    }

    /**
     * Determines if either of the given optional values is empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @return true if either of the optional values is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2) {
        return op1.isEmpty() || op2.isEmpty();
    }

    /**
     * Determines if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty();
    }

    /**
     * Checks if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty();
    }

    /**
     * Determines if any of the given optional values are empty.
     *
     * @param op1 the first optional value
     * @param op2 the second optional value
     * @param op3 the third optional value
     * @param op4 the fourth optional value
     * @param op5 the fifth optional value
     * @param op6 the sixth optional value
     * @return true if any of the optional values are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param op1 the first Optional object
     * @param op2 the second Optional object
     * @param op3 the third Optional object
     * @param op4 the fourth Optional object
     * @param op5 the fifth Optional object
     * @param op6 the sixth Optional object
     * @param op7 the seventh Optional object
     * @return true if any of the Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty();
    }

    /**
     * A function that checks if any of the given Optional parameters are empty.
     *
     * @param op1 the first Optional parameter
     * @param op2 the second Optional parameter
     * @param op3 the third Optional parameter
     * @param op4 the fourth Optional parameter
     * @param op5 the fifth Optional parameter
     * @param op6 the sixth Optional parameter
     * @param op7 the seventh Optional parameter
     * @param op8 the eighth Optional parameter
     * @return true if any of the Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects is empty.
     *
     * @param op1 the first Optional object to check
     * @param op2 the second Optional object to check
     * @param op3 the third Optional object to check
     * @param op4 the fourth Optional object to check
     * @param op5 the fifth Optional object to check
     * @param op6 the sixth Optional object to check
     * @param op7 the seventh Optional object to check
     * @param op8 the eighth Optional object to check
     * @param op9 the ninth Optional object to check
     * @return true if any of the given Optional objects is empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty();
    }

    /**
     * Checks if any of the given Optional parameters are empty.
     *
     * @param op1  Optional parameter 1
     * @param op2  Optional parameter 2
     * @param op3  Optional parameter 3
     * @param op4  Optional parameter 4
     * @param op5  Optional parameter 5
     * @param op6  Optional parameter 6
     * @param op7  Optional parameter 7
     * @param op8  Optional parameter 8
     * @param op9  Optional parameter 9
     * @param op10 Optional parameter 10
     * @return true if any of the given Optional parameters are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble op1, final OptionalDouble op2, final OptionalDouble op3, final OptionalDouble op4, final OptionalDouble op5,
                                   final OptionalDouble op6, final OptionalDouble op7, final OptionalDouble op8, final OptionalDouble op9, final OptionalDouble op10) {
        return op1.isEmpty() || op2.isEmpty() || op3.isEmpty() || op4.isEmpty() || op5.isEmpty() || op6.isEmpty() || op7.isEmpty() ||
                op8.isEmpty() || op9.isEmpty() || op10.isEmpty();
    }

    /**
     * Checks if any of the given Optional objects are empty.
     *
     * @param optionals an array of Optional objects to be checked
     * @return true if any of the Optional objects are empty, false otherwise
     */
    public static boolean anyEmpty(final OptionalDouble... optionals) {
        if (optionals == null) throw new NullPointerException("optionals cannot be null");
        if (optionals.length == 0) {
            return false;
        }
        return Arrays.stream(optionals).anyMatch(OptionalDouble::isEmpty);
    }
}
