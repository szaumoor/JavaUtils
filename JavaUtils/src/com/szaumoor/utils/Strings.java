package com.szaumoor.utils;

import java.util.Arrays;

/**
 * This is a utility class that provides functions designed to test String objects in various ways.
 */
public final class Strings {
    private Strings() {
        throw new AssertionError("Utility class");
    }

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
        return hasContent(str1, str2) && hasContent(str3, str4);
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
        return hasContent(str1, str2, str3) && hasContent(str4, str5);
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
        return hasContent(str1, str2, str3) && hasContent(str4, str5, str6);
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
        return hasContent(str1, str2, str3, str4) && hasContent(str5, str6, str7);
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
        return hasContent(str1, str2, str3, str4) && hasContent(str5, str6, str7, str8);
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
        return hasContent(str1, str2, str3, str4, str5) && hasContent(str6, str7, str8, str9);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param str1  First string to check
     * @param str2  Second string to check
     * @param str3  Third string to check
     * @param str4  Fourth string to check
     * @param str5  Fifth string to check
     * @param str6  Sixth string to check
     * @param str7  Seventh string to check
     * @param str8  Eighth string to check
     * @param str9  Ninth string to check
     * @param str10 Tenth string to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String str1, final String str2, final String str3, final String str4, final String str5,
                                     final String str6, final String str7, final String str8, final String str9, final String str10) {
        return hasContent(str1, str2, str3, str4, str5) && hasContent(str6, str7, str8, str9, str10);
    }

    /**
     * Verifies if the provided string references are both not null and have characters other than whitespace.
     * This exists only to provide an expressive way to test this common check.
     *
     * @param strings The array of strings to check
     * @return True if all elements have content, false otherwise
     */
    public static boolean hasContent(final String... strings) {
        if (strings.length == 0) return false;
        return Arrays.stream(strings).allMatch(Strings::hasContent);
    }

    /**
     * Checks if a given string has a length within a specified range.
     *
     * @param str       The string to check the length of.
     * @param minLength The minimum allowed length of the string.
     * @param maxLength The maximum allowed length of the string.
     * @return Returns true if the length of the string is within the specified range, false otherwise.
     * @throws IllegalArgumentException if minimum and max are incorrect, that is, max is less than or equal to min or min is negative
     */
    public static boolean between(final String str, final int minLength, final int maxLength) {
        if (minLength < 0) throw new IllegalArgumentException("Minimum length of String cannot be negative");
        if (maxLength <= minLength)
            throw new IllegalArgumentException("Maximum length of String cannot be less or equal to its minimum length");
        var length = str.length();
        return length >= minLength && length <= maxLength;
    }

    /**
     * Counts how many occurrences of a substring exist within a given string.
     * Returns -1 if either string is null, indicating incorrect parameters.
     *
     * @param str the original string
     * @param sub the substring to count
     * @return the number of occurrences within the string
     */
    public static int countSubstring(final String str, final String sub) {
        if (!hasContent(str) || sub == null) return -1;
        final var withSubRemoved = str.replace(sub, "");
        return (str.length() - withSubRemoved.length()) / sub.length();
    }

    /**
     * Counts how many occurrences of a character exist within a given string.
     *
     * @param str       the original string
     * @param character the character to count
     * @return the number of occurrences within the string
     */
    public static int countChars(final String str, final char character) {
        final String replaced = str.replace(character, '\0');
        return str.length() - replaced.length();
    }

    /**
     * Capitalizes the first letter of a given string and converts the remaining letters to lowercase.
     *
     * @param str the string to be capitalized
     * @return the capitalized string
     */
    public static String capitalize(final String str) {
        if (str.length() <= 1) return str.toUpperCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * Reverses the given string.
     *
     * @param str the string to be reversed
     * @return the reversed string
     */
    public static String reverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
