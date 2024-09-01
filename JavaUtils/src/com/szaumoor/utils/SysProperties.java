package com.szaumoor.utils;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import static java.lang.System.getProperty;

/**
 * Utility class to return convenient data from the system without having to remember property Strings.
 */
public final class SysProperties {
    private SysProperties() {
        throw new AssertionError("Utility class");
    }

    /**
     * Retrieves the default character set's display name for the file encoding.
     *
     * @return the display name of the default character set
     */
    public static String fileEncoding() {
        return Charset.defaultCharset().displayName();
    }

    /**
     * Gets the name of the operating system.
     *
     * @return the name of the operating system
     */
    public static String osName() {
        return getProperty("os.name");
    }

    /**
     * Retrieves the version of the operating system.
     *
     * @return the version of the operating system
     */
    public static String osVersion() {
        return getProperty("os.version");
    }

    /**
     * Retrieves the version of the operating system.
     *
     * @return the version of the operating system
     */
    public static String osArch() {
        return getProperty("os.arch");
    }


    /**
     * Retrieves the file separator of the current operating system.
     *
     * @return the file separator
     */
    public static String fileSeparator() {
        return FileSystems.getDefault().getSeparator();
    }

    /**
     * Retrieves the line separator of the current operating system.
     *
     * @return the line separator
     */
    public static String separatorLine() {
        return System.lineSeparator();
    }

    /**
     * Retrieves the path separator of the current operating system.
     *
     * @return the path separator
     */
    public static String separatorPath() {
        return File.pathSeparator;
    }

    /**
     * Retrieves the username of the current user.
     *
     * @return the username of the current user
     */
    public static String username() {
        return getProperty("user.name");
    }

    /**
     * Returns the current working directory as a string
     *
     * @return the current working directory as a string
     */
    private static String userDir() {
        return getProperty("user.dir");
    }

    private static String userCountry() {
        return getProperty("user.country");
    }

    /**
     * Returns the current directory as a File object.
     *
     * @return a File object representing the current directory
     */
    public static File userDirAsFile() {
        return new File(userDir());
    }

    /**
     * Returns the current directory as a Path object.
     *
     * @return a Path object representing the current directory
     */
    public static Path userDirAsPath() {
        return Path.of(userDir());
    }

    /**
     * Returns the current home directory as a string
     *
     * @return the current home directory as a string
     */
    private static String userHome() {
        return getProperty("user.home");
    }

    /**
     * Returns the home directory as a File object.
     *
     * @return a File object representing the home directory
     */
    public static File userHomeAsFile() {
        return new File(userHome());
    }

    /**
     * Returns the home directory as a Path object.
     *
     * @return a Path object representing the home directory
     */
    public static Path userHomeAsPath() {
        return Path.of(userHome());
    }
}
