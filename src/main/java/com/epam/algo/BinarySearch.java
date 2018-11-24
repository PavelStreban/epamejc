package com.epam.algo;

/**
 * BinarySearch
 */
public class BinarySearch {

    public int search(int[] inputArray, int count) {
        int result = -1;
        int lowBoundary = 0;
        int highBoundary = inputArray.length;
        int middleBoundary;

        while (lowBoundary < highBoundary) {
            middleBoundary = (lowBoundary + highBoundary) / 2;

            if (inputArray[middleBoundary] == count) {
                result = middleBoundary;
                break;
            } else {
                if (count <= inputArray[middleBoundary]) {
                    highBoundary = middleBoundary;
                } else if (count > inputArray[middleBoundary]) {
                    lowBoundary = middleBoundary + 1;
                }
            }
        }
        return result;
    }
}

