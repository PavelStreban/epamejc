package com.epam.algo;

import java.util.Arrays;

/**
 * Radix Sort
 */
public class RadixSortable {

    public void sort(int[] inputArray) {
        int maxNumber = getMaxNumber(inputArray);
        for (int rank = 1; maxNumber / rank > 0; rank *= 10) {
            countSort(inputArray, rank);
        }
    }

    private int getMaxNumber(int[] inputArray) {
        int maxNumber = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxNumber) {
                maxNumber = inputArray[i];
            }
        }
        return maxNumber;
    }

    private void countSort(int[] inputArray, int rank) {
        int[] outputArray = new int[inputArray.length];
        int i;
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < inputArray.length; i++) {
            count[(inputArray[i] / rank) % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (i = inputArray.length - 1; i >= 0; i--) {
            outputArray[count[(inputArray[i] / rank) % 10] - 1] = inputArray[i];
            count[(inputArray[i] / rank) % 10]--;
        }

        for (i = 0; i < inputArray.length; i++) {
            inputArray[i] = outputArray[i];
        }
    }
}

