package com.epam.recursion;

/**
 * 10.42 Write recursive function
 * a) calculate the sum of digits of a natural number
 * b) calculating the number of digits of a natural number
 */
public class NaturalNumber {

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return sumDigits(n / 10) + sumDigits(n % 10);
        }
    }

    public static int count(int n) {
        if (n < 10) {
            return 1;
        } else {
            return count(n / 10) + 1;
        }
    }
}
