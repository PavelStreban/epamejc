package com.epam.arrays;

import static com.epam.arrays.ArrayTask270.getString;
import static com.epam.arrays.ArrayTask271.getWordBetweenIndex;
import static com.epam.arrays.ArrayTask272.printColum;
import static com.epam.arrays.ArrayTask272.printRow;
import static com.epam.arrays.ArrayTask273.evenElementsInArray;
import static com.epam.arrays.ArrayTask274.getWordOdd;

public class PrintInfo {

    public int row;
    public int firstIndex = 1;
    public int lastIndex = 4;
    public char[][] array = {{'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'}};

    public void printInfo() {
        System.out.println("Task 12.270, the answer is following:");
        System.out.println(getString(array));
        System.out.println();
        System.out.println("Task 12.271, the answer is following:");
        System.out.println(getWordBetweenIndex(array, row, firstIndex, lastIndex));
        System.out.println();
        System.out.println("Task 12.272(a), the answer is following:");
        System.out.println(printRow(array));
        System.out.println();
        System.out.println("Task 12.272(b), the answer is following:");
        System.out.println(printColum(array));
        System.out.println();
        System.out.println("Task 12.273, the answer is following:");
        System.out.println(evenElementsInArray(array));
        System.out.println();
        System.out.println("Task 12.274, the answer is following:");
        System.out.println(getWordOdd(array));
    }
}
