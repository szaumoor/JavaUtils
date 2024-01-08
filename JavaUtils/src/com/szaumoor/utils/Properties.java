package com.szaumoor.utils;

import java.io.File;
import java.nio.file.Path;

/**
 * Utility class to return convenient data from the system
 */
public final class Properties {
    private Properties() {
        throw new AssertionError("Utility class");
    }

    /**
     * Returns the current working directory as a string
     *
     * @return the current working directory as a string
     */
    private static String location() {
        return System.getProperty("user.dir");
    }

    /**
     * Returns the current directory as a File object.
     *
     * @return a File object representing the current directory
     */
    public static File locationDir() {
        return new File(location());
    }

    /**
     * Returns the current directory as a Path object.
     *
     * @return a Path object representing the current directory
     */
    public static Path locationPath() {
        return Path.of(location());
    }

    /**
     * Returns the current home directory as a string
     *
     * @return the current home directory as a string
     */
    private static String home() {
        return System.getProperty("user.home");
    }

    /**
     * Returns the home directory as a File object.
     *
     * @return a File object representing the home directory
     */
    public static File homeDir() {
        return new File(home());
    }

    /**
     * Returns the home directory as a Path object.
     *
     * @return a Path object representing the home directory
     */
    public static Path homePath() {
        return Path.of(home());
    }

    /**
     * Gets the name of the operating system.
     *
     * @return the name of the operating system
     */
    public static String os() {
        return System.getProperty("os.name");
    }


}
