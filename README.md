# JavaUtils
A collection of various utility functions that I've found were missing in the Java SDK as it stands now in Java 17, or that I find myself using often.
Many don't encapsulate a particularly difficult or verbose operation, but they provide, regardless, an expressive way of performing an operation in code.

This was inspired by my degree's end project, as I found many of the functions I needed were functions I needed in other projects too.

# How to use
You can use it in your project by importing the given JAR in the releases section, or download the source code and use it as you see fit.

# Requirements
A machine that has at least Java 17 installed.

# Contents

## Containers package
Contains utility classes to manipulate collections, arrays, and encapsulate pairs and triads of objects.

## Datatypes package
Contains utility classes to manipulate or check various datatypes, including optionals, booleans, nulls, numbers, and strings. It also includes functions for throw exceptions easily based on various conditions applied to any number of objects.

## Performance package
Contains utility classes and functions to measure execution of runnables, including functions to repeatedly test them and obtain basic statistical data.

## Random package
Contains utility classes to create lists or arrays of randomized values of primitive types. It also contains utility classes to encapsulate intervals of numbers and automatically check for validity. 

## Utils package
Currently only contains a utility class to retrieve system properties easily, i.e. without having to know how to retrieve them by memory.
