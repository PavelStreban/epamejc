package com.epam.arrays;

/**
 * 12.274 Type the words formed by the odd elements of each column in the array
 */
public class ArrayTask274 {

    public static StringBuilder getWordOdd(char[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (Util.isEven(i) && Util.isEven(j)) {
                    stringBuilder.append(array[j][i]);
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder;
    }
}
