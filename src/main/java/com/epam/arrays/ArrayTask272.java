package com.epam.arrays;

/**
 * 12.272 Given a two-dimensional array of size 5x5, filled with letters. Type
 *        word formed by array elements marked with an asterisk :, while reading them:
 * a) from left to right in each row, starting with the first;
 * b) from top to bottom in each column, starting with the first.
 * |*| |*| |*|
 * | |*| |*| |
 * |*| |*| |*|
 * | |*| |*| |
 * |*| |*| |*|
 */
public class ArrayTask272 {

    public static StringBuilder printRow(char[][] array) {
        StringBuilder stringFromArray = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    stringFromArray.append(array[i][j]);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    stringFromArray.append(array[i][j]);
                }
            }
        }
        return stringFromArray;
    }

    public static StringBuilder printColum(char[][] array) {
        StringBuilder stringFromArray = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    stringFromArray.append(array[j][i]);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    stringFromArray.append(array[j][i]);
                }
            }
        }
        return stringFromArray;
    }
}
