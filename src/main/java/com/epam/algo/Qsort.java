package com.epam.algo;

/**
 * Qsort
 */
public class Qsort {

    public void sort(int[] inputArray) {
        int low = 0;
        int high = inputArray.length - 1;
        qsort(inputArray, low, high);
    }

    private void qsort(int[] inputArray, int low, int high) {
        if (inputArray == null || inputArray.length == 0) {
            return;
        }
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = inputArray[middle];
        int i = low;
        int j = high;

        while (i <= j) {
            while (inputArray[i] < pivot) {
                i++;
            }
            while (inputArray[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapPosition(inputArray, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            qsort(inputArray, low, j);
        }
        if (high > i) {
            qsort(inputArray, i, high);
        }
    }

    private void swapPosition(int[] inputArray, int first, int second) {
        int temp = inputArray[first];
        inputArray[first] = inputArray[second];
        inputArray[second] = temp;
    }
}


