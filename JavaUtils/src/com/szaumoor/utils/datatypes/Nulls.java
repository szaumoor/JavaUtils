package com.szaumoor.utils.datatypes;

import java.util.Arrays;
import java.util.Objects;

/**
 * This is a utility class that provides functions for null checking.
 */
public final class Nulls {
    private Nulls() {
        throw new AssertionError("Utility class");
    }

    // NON NULL CHECKING METHODS

    /**
     * A function that checks if both objects are non-null.
     *
     * @param obj1 first object to check
     * @param obj2 second object to check
     * @return true if both objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2) {
        return obj1 != null && obj2 != null;
    }

    /**
     * Checks if each of the three objects is not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @return true if all three objects are not null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3) {
        return obj1 != null && obj2 != null && obj3 != null;
    }

    /**
     * Checks if all the given objects are non-null.
     *
     * @param obj1 the first object to be checked
     * @param obj2 the second object to be checked
     * @param obj3 the third object to be checked
     * @param obj4 the fourth object to be checked
     * @return true if all the objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null;
    }

    /**
     * Checks if all the provided objects are non-null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @return true if all objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null;
    }

    /**
     * Checks if all the given objects are non-null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @return true if all objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null;
    }

    /**
     * Checks if all the given objects are not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @return true if all the objects are not null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null && obj7 != null;
    }

    /**
     * Checks if all the given objects are non-null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @param obj8 the eighth object to check
     * @return true if all objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7, final Object obj8) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null && obj7 != null &&
                obj8 != null;
    }

    /**
     * Checks if all the given objects are non-null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @param obj8 the eighth object to check
     * @param obj9 the ninth object to check
     * @return true if all the objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null && obj7 != null &&
                obj8 != null && obj9 != null;
    }

    /**
     * Checks if all the given objects are non-null.
     *
     * @param obj1  the first object to check
     * @param obj2  the second object to check
     * @param obj3  the third object to check
     * @param obj4  the fourth object to check
     * @param obj5  the fifth object to check
     * @param obj6  the sixth object to check
     * @param obj7  the seventh object to check
     * @param obj8  the eighth object to check
     * @param obj9  the ninth object to check
     * @param obj10 the tenth object to check
     * @return true if all the objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        return obj1 != null && obj2 != null && obj3 != null && obj4 != null && obj5 != null && obj6 != null && obj7 != null &&
                obj8 != null && obj9 != null && obj10 != null;
    }

    /**
     * Checks if all the objects passed as arguments are non-null.
     *
     * @param objs the objects to be checked
     * @return true if all objects are non-null, false otherwise
     */
    public static boolean nonNull(final Object... objs) {
        return Arrays.stream(objs).allMatch(Objects::nonNull);
    }

    // ANY NULL CHECKING METHODS

    /**
     * Determines if any of the provided objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2) {
        return obj1 == null || obj2 == null;
    }

    /**
     * Checks if any of the given objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3) {
        return obj1 == null || obj2 == null || obj3 == null;
    }

    /**
     * Determines whether any of the given objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2,
                                  final Object obj3, final Object obj4) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null;
    }

    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3,
                                  final Object obj4, final Object obj5) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null;
    }

    /**
     * Checks if any of the provided objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3,
                                  final Object obj4, final Object obj5, final Object obj6) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null || obj6 == null;
    }

    /**
     * Checks if any of the given objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                  final Object obj5, final Object obj6, final Object obj7) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null || obj6 == null || obj7 == null;
    }

    /**
     * Checks if any of the given objects are null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @param obj8 the eighth object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                  final Object obj5, final Object obj6, final Object obj7, final Object obj8) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null || obj6 == null || obj7 == null || obj8 == null;
    }

    /**
     * Checks if any of the given objects are null.
     *
     * @param obj1 the first object
     * @param obj2 the second object
     * @param obj3 the third object
     * @param obj4 the fourth object
     * @param obj5 the fifth object
     * @param obj6 the sixth object
     * @param obj7 the seventh object
     * @param obj8 the eighth object
     * @param obj9 the ninth object
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null || obj6 == null || obj7 == null || obj8 == null || obj9 == null;
    }

    /**
     * Checks if any of the given objects are null.
     *
     * @param obj1  the first object to check
     * @param obj2  the second object to check
     * @param obj3  the third object to check
     * @param obj4  the fourth object to check
     * @param obj5  the fifth object to check
     * @param obj6  the sixth object to check
     * @param obj7  the seventh object to check
     * @param obj8  the eighth object to check
     * @param obj9  the ninth object to check
     * @param obj10 the tenth object to check
     * @return true if any of the objects are null, false otherwise
     */
    public static boolean anyNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                  final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        return obj1 == null || obj2 == null || obj3 == null || obj4 == null || obj5 == null
                || obj6 == null || obj7 == null || obj8 == null || obj9 == null || obj10 == null;
    }

    /**
     * Checks if any of the given objects is null.
     *
     * @param objects the objects to check for null
     * @return true if any object is null, false otherwise
     */
    public static boolean anyNull(final Object... objects) {
        return Arrays.stream(objects).anyMatch(Objects::isNull);
    }

    // ANY NON NULL CHECKING METHODS

    /**
     * Determines if any of the given objects are not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @return true if any of the objects are not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2) {
        return obj1 != null || obj2 != null;
    }

    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3) {
        return obj1 != null || obj2 != null || obj3 != null;
    }

    /**
     * Determines whether any of the given objects are non-null.
     *
     * @param obj1 the first object
     * @param obj2 the second object
     * @param obj3 the third object
     * @param obj4 the fourth object
     * @return true if any of the objects are non-null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2,
                                     final Object obj3, final Object obj4) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null;
    }

    /**
     * Checks if any of the given objects is not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @return true if any of the objects is not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3,
                                     final Object obj4, final Object obj5) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null;
    }

    /**
     * Checks if any of the given objects is not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @return true if any of the objects is not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3,
                                     final Object obj4, final Object obj5, final Object obj6) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null || obj6 != null;
    }

    /**
     * Determines if any of the given objects are not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @return true if any of the objects are not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                     final Object obj5, final Object obj6, final Object obj7) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null || obj6 != null || obj7 != null;
    }

    /**
     * Checks if any of the given objects is not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @param obj8 the eighth object to check
     * @return true if any of the objects is not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4,
                                     final Object obj5, final Object obj6, final Object obj7, final Object obj8) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null || obj6 != null || obj7 != null || obj8 != null;
    }

    /**
     * Checks if any of the given objects are not null.
     *
     * @param obj1 the first object to check
     * @param obj2 the second object to check
     * @param obj3 the third object to check
     * @param obj4 the fourth object to check
     * @param obj5 the fifth object to check
     * @param obj6 the sixth object to check
     * @param obj7 the seventh object to check
     * @param obj8 the eighth object to check
     * @param obj9 the ninth object to check
     * @return true if any of the objects are not null, false otherwise
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                     final Object obj6, final Object obj7, final Object obj8, final Object obj9) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null || obj6 != null || obj7 != null || obj8 != null || obj9 != null;
    }

    /**
     * Returns true if any of the given objects are not null.
     *
     * @param obj1  the first object
     * @param obj2  the second object
     * @param obj3  the third object
     * @param obj4  the fourth object
     * @param obj5  the fifth object
     * @param obj6  the sixth object
     * @param obj7  the seventh object
     * @param obj8  the eighth object
     * @param obj9  the ninth object
     * @param obj10 the tenth object
     * @return true if any of the given objects are not null
     */
    public static boolean anyNonNull(final Object obj1, final Object obj2, final Object obj3, final Object obj4, final Object obj5,
                                     final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10) {
        return obj1 != null || obj2 != null || obj3 != null || obj4 != null || obj5 != null
                || obj6 != null || obj7 != null || obj8 != null || obj9 != null || obj10 != null;
    }

    /**
     * Checks if any of the given objects is not null.
     *
     * @param objects the objects to check
     * @return true if any of the objects is not null, false otherwise
     */
    public static boolean anyNonNull(final Object... objects) {
        return Arrays.stream(objects).anyMatch(Objects::nonNull);
    }


}
