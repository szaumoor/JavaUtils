package com.szaumoor.utils;

import java.util.Arrays;

/**
 *  This is a utility class that provides functions designed to test String objects in various ways.
 */
public enum Strings {
    ;

    /**
     * Verifies if the provided string reference is both not null and has characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str String to check
     * @return True if it has content, false otherwise
     */
    public static boolean hasContent(final String str) {
        return str != null && !str.isBlank();
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2) {
        return hasContent(str1) && hasContent(str2);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3) {
        return hasContent(str1, str2) && hasContent(str3);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4) {
        return hasContent(str1, str2, str3) && hasContent(str4);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5) {
        return hasContent(str1, str2, str3, str4) && hasContent(str5);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @param str6 Sixth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6) {
        return hasContent(str1, str2, str3, str4, str5) && hasContent(str6);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @param str6 Sixth string to check
     * @param str7 Seventh string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6, final String str7) {
        return hasContent(str1, str2, str3, str4, str5, str6) && hasContent(str7);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @param str6 Sixth string to check
     * @param str7 Seventh string to check
     * @param str8 Eighth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6, final String str7, final String str8) {
        return hasContent(str1, str2, str3, str4, str5, str6, str7) && hasContent(str8);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @param str6 Sixth string to check
     * @param str7 Seventh string to check
     * @param str8 Eighth string to check
     * @param str9 Ninth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6, final String str7, final String str8, final String str9) {
        return hasContent(str1, str2, str3, str4, str5, str6, str7, str8) && hasContent(str9);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1 First string to check
     * @param str2 Second string to check
     * @param str3 Third string to check
     * @param str4 Fourth string to check
     * @param str5 Fifth string to check
     * @param str6 Sixth string to check
     * @param str7 Seventh string to check
     * @param str8 Eighth string to check
     * @param str9 Ninth string to check
     * @param str10 Tenth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6, final String str7, final String str8, final String str9, final String str10) {
        return hasContent(str1, str2, str3, str4, str5, str6, str7, str8, str9) && hasContent(str10);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param strings The array of strings to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String ... strings) {
        return Arrays.stream(strings).allMatch(Strings::hasContent);
    }

    /**
     * Checks if the provided string is longer than the provided minimum length
     *
     * @param str The string to check
     * @param min The minimum length
     * @return True if the string is longer than the minimum, false otherwise
     */
    public static boolean longerThan(final String str, final int min) {
        return str.length() > min;
    }

    /**
     * Checks if the provided string is shorter than the provided maximum length
     *
     * @param str The string to check
     * @param max The maximum length
     * @return True if the string is shorter than the maximum, false otherwise
     */
    public static boolean shorterThan(final String str, final int max) {
        return str.length() < max;
    }


    /**
     * Checks if a given string has a length within a specified range.
     *
     * @param  str The string to check the length of.
     * @param  min The minimum allowed length of the string.
     * @param  max The maximum allowed length of the string.
     * @return    Returns true if the length of the string is within the specified range, false otherwise.
     */
    public static boolean between(final String str, final int min, final int max) {
        if (min < 0) throw new IllegalArgumentException("Minimum length of String cannot be negative");
        if (max <= min) throw new IllegalArgumentException("Maximum length of String cannot be less or equal to its minimum length");
        int length = str.length();
        return length >= min && length <= max;
    }

    /**
     * Determines if the length of the given character array is within the specified range.
     *
     * @param  array           the character array to check
     * @param  inclusiveMin    the minimum length of the array (inclusive)
     * @param  inclusiveMax    the maximum length of the array (inclusive)
     * @return                 true if the length of the array is within the specified range, false otherwise
     */
    public static boolean between(final char[] array, final int inclusiveMin, final int inclusiveMax) {
        if (inclusiveMin < 0) throw new IllegalArgumentException("Minimum length of array cannot be negative");
        if (inclusiveMax <= inclusiveMin) throw new IllegalArgumentException("Maximum length of array cannot be less or equal to its minimum length");
        final int size = array.length;
        return size >= inclusiveMin && size <= inclusiveMax;
    }

    /**
     * Constructs a String with all non-digit characters from the given string removed.
     *
     * @param  str  the string to remove non-digit characters from
     * @return      the string with all non-digit characters removed
     */
    public static String removeNonDigits(final String str) {
        return str.replaceAll("\\D", "");
    }

    /**
     * Capitalizes the first letter of a given string and converts the remaining letters to lowercase.
     *
     * @param  str  the string to be capitalized
     * @return      the capitalized string
     */
    public static String capitalize(final String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
