package com.szaumoor.utils.datatypes;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 * Utility class that provides functions designed to test or transform String, StringBuffer and StringBuilder objects in various ways.
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
     * Returns -1 if the string is null or empty, or if the substring is null.
     *
     * @param str the original string
     * @param sub the substring to count
     * @return the number of occurrences within the string
     */
    public static int count(final String str, final String sub) {
        if (!hasContent(str) || (sub == null || sub.isEmpty())) return -1;
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
    public static int count(final String str, final char character) {
        final String replaced = str.replace(character, '\0');
        return str.length() - replaced.length();
    }

    /**
     * Capitalizes the first letter of a given string using the default locale.
     *
     * @param str the string to be capitalized
     * @return the capitalized string
     */
    public static String capitalize(final String str) {
        if (str.length() <= 1) return str.toUpperCase();
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * Capitalizes the first letter of a given string using the provided locale.
     *
     * @param str the string to be capitalized
     * @return the capitalized string
     */
    public static String capitalize(final String str, final Locale locale) {
        if (str.length() <= 1) return str.toUpperCase();
        return str.substring(0, 1).toUpperCase(locale) + str.substring(1);
    }

    /**
     * Lowercases the first letter of a given string using the default locale.
     *
     * @param str the string to be capitalized
     * @return the capitalized string
     */
    public static String decapitalize(final String str) {
        if (str.length() <= 1) return str.toLowerCase();
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    /**
     * Lowercases the first letter of a given string using the provided locale.
     *
     * @param str the string to be capitalized
     * @return the capitalized string
     */
    public static String decapitalize(final String str, final Locale locale) {
        if (str.length() <= 1) return str.toLowerCase();
        return str.substring(0, 1).toLowerCase(locale) + str.substring(1);
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

    /**
     * Clears the StringBuilder of characters.
     *
     * @param builder The StringBuilder to clear
     * @return the same instance of StringBuilder that was cleared
     */
    public static StringBuilder clear(final StringBuilder builder) {
        return builder.delete(0, builder.length());
    }

    /**
     * Clears the StringBuffer of characters.
     *
     * @param builder The StringBuilder to clear
     * @return the same instance of StringBuilder that was cleared
     */
    public static StringBuffer clear(final StringBuffer builder) {
        return builder.delete(0, builder.length());
    }

    /**
     * Returns a String with the passed suffix removed, if it exists. Otherwise,
     * it returns the original String.
     *
     * @param string The string to transform
     * @param suffix The suffix to remove
     * @return The new string with the suffix removed, or the original string, if the suffix was not there
     */
    public static String removeSuffix(final String string, final String suffix) {
        return !string.endsWith(suffix) ? string : getStringWithoutSuffix(string, suffix);
    }

    /**
     * Returns a String with the passed prefix removed, if it exists. Otherwise,
     * it returns the original String.
     *
     * @param string The string to transform
     * @param prefix The prefix to remove
     * @return The new string with the prefix removed, or the original string, if the prefix was not there
     */
    public static String removePrefix(final String string, final String prefix) {
        return !string.startsWith(prefix) ? string : getStringWithoutPrefix(string, prefix);
    }

    /**
     * Returns a String with the passed prefix and suffix removed, if they both exist. Otherwise,
     * it returns the original String.
     *
     * @param string The string to transform
     * @param prefix The prefix to remove
     * @param suffix The suffix to remove
     * @return The new string with the prefix and suffix removed, or the original string, if the prefix and suffix were not there
     */
    public static String removeSurrounding(final String string, final String prefix, final String suffix) {
        return !string.startsWith(prefix) || !string.endsWith(suffix) ? string :
                getStringWithoutSuffix(getStringWithoutPrefix(string, prefix), suffix);
    }

    /**
     * Returns a String with the passed delimiter removed from the start and end of the passed String,
     * if it starts and ends with the delimiter. Otherwise, it returns the original String.
     *
     * @param string The string to transform
     * @param delimiter The delimiter to remove from the start and end of the string
     * @return The new string with the prefix and suffix removed, or the original string, if they both were not there
     */
    public static String removeSurrounding(final String string, final String delimiter) {
        return removeSurrounding(string, delimiter, delimiter);
    }

    /**
     * Returns a String with the passed suffix removed from the original String.
     *
     * @param string The string to transform.
     * @param suffix The suffix to remove
     * @return The String with the suffix removed.
     */
    private static String getStringWithoutSuffix(final String string, final String suffix) {
        return string.substring(0, string.length() - suffix.length());
    }

    /**
     * Returns a String with the passed suffix removed from the original String.
     *
     * @param string The string to transform.
     * @param prefix The prefix to remove
     * @return The String with the prefix removed.
     */
    private static String getStringWithoutPrefix(final String string, final String prefix) {
        return string.substring(prefix.length());
    }

    /**
     * Returns a list of every character contained in the string passed.
     *
     * @param string The String
     * @return A {@link List} containing the character of the string
     */
    public static List<Character> toCharList(final String string) {
      return string.chars()
                .mapToObj(value -> (char) value)
                .toList();
    }

    /**
     * Joins the elements in a list of CharSequence objects to create a String
     * without a delimiter. It exists only for the convenience of using a non-delimited join
     * with only one argument.
     *
     * @param elements The elements to join in a String.
     * @return The joined String.
     */
    public static String join(final Iterable<? extends CharSequence> elements) {
        return java.lang.String.join("", elements);
    }

    /**
     * Joins the elements in a list of CharSequence objects to create a String
     * without a delimiter.
     *
     * @param elements The elements to join in a String.
     * @return The joined String.
     */
    public static String join(final CharSequence... elements) {
        return java.lang.String.join("", elements);
    }

    /**
     * Retrieves the last character in a String. It will throw
     * and index out of bounds exception for Strings with length == 0.
     * This method exists mostly because I got tired of typing length() - 1,
     * and this is more expressive.
     *
     * @param string The String to get the last character from.
     * @return the char at the last position of the string
     */
    public static char lastAsChar(final String string) {
        return string.charAt(string.length() - 1);
    }

    /**
     * Retrieves the last character in a String. It will throw
     * and index out of bounds exception for Strings with length == 0.
     * It will retrieve it as a String object.
     * This method exists mostly because I got tired of typing length() - 1,
     * and this is more expressive.
     *
     * @param string The String to get the last character from.
     * @return the String representing the last character of the string
     */
    public static String lastAsString(final String string) {
        return String.valueOf(lastAsChar(string));
    }

    /**
     * Deletes the last character inside a StringBuilder.
     * Useful sometimes when constructing delimited chains
     * of characters in a loop. It exists only to provide a more readable syntax.
     *
     * @param builder The StringBuilder
     * @return the StringBuilder instance
     */
    public static StringBuilder deleteLast(final StringBuilder builder) {
        return builder.deleteCharAt(builder.length() - 1);
    }

    /**
     * Deletes the last character inside a StringBuffer.
     * Useful sometimes when constructing delimited chains
     * of characters in a loop. It exists only to provide a more readable syntax.
     *
     * @param builder The StringBuffer
     * @return the StringBuffer instance
     */
    public static StringBuffer deleteLast(final StringBuffer builder) {
        return builder.deleteCharAt(builder.length() - 1);
    }
}
