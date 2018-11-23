package com.epam.arrays;

        import java.util.Arrays;

/**
 * 12.271 The program that prints a word formed by several consecutive characters
 * with given numbers located in a certain line of the array
 */
public class ArrayTask271 {

    public static String getWordBetweenIndex(char[][] array, int row, int firstIndex, int lastIndex) {
        if ((row < 0) || (firstIndex < 0) || (lastIndex < 0)) {
            throw new IllegalArgumentException("Indexes must be more than 0!");
        }
        if ((row >= array.length) || (lastIndex >= array[row].length)) {
            throw new ArrayIndexOutOfBoundsException("Please check the length!");
        }
        return new String(Arrays.copyOfRange(array[row], firstIndex, lastIndex + 1));
    }
}

