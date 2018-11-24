package com.epam.algo;

/**
 * BubbleSortable
 */
public class BubbleSortable {

    public void sort(int[] inputArray) {
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int countToSwap = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = countToSwap;
                }
            }
        }
    }
}

