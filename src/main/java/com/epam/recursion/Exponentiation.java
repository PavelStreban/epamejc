package com.epam.recursion;

/**
 * 10.42 Write a recursive function for calculating the degree n of a real number a
 * (n is a positive integer)
 */
public class Exponentiation {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return a;
        }
        if (n % 2 == 0) {
            int temp = power(a, n / 2);
            return temp * temp;
        } else {
            return a * (power(a, n - 1));
        }
    }
}
