# JavaUtils
A collection of various utility functions that I've found were missing in the Java SDK as it stands now, or that I find myself using often.
Many don't encapsulate a particularly difficult or verbose operation, but they provide, regardless, an expressive way of performing an operation in code.

All the utility classes that accept a variable number of arguments follow the Java convention of providing overloaded methods of up to 10 arguments
to avoid performance hits when only a varargs method is available. Consequently, do not use these methods for a single input argument.
May grow in the future.

# How to use
You can use it in your project by importing the given JAR in the releases section, or download the source code and use it as you see fit.

# Requirements
A machine that has at least Java 11 installed.

# Contents so far

## Strings class
Contains utility methods to manipulate or check strings in various ways such as capitalizing, checking for content, length, substrings.

## Performance class
Contains utility methods to measure execution time of runnables with nanosecond precision.

## Optionals class
Contains utility methods to check for presence or emptiness in any number of optionals.

## Bools class
Contains utility methods to perform logical operations on any number of boolean values.

## Nulls class
Contains utility methods to check for null presence or absence in any number of object values.

## Numbers class
Contains utility methods to perform various operations such as factorials and parsing strings for numbers without risking exceptions.
