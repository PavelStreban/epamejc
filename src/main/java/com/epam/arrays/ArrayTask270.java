package com.epam.arrays;

/**
 * 12.270 Print a string formed by characters located in the four corners of the array (in any order)
 */
public class ArrayTask270 {

    public static String getString(char[][] array) {
        if ((array.length < 2) || (array[array.length - 1].length < 2)) {
            throw new IllegalArgumentException("Must be more than 2");
        }
        return "" + array[0][0] + array[0][array[0].length - 1] + array[array.length - 1][0]
                + array[array.length - 1][array[array.length - 1].length - 1];
    }
}
