package com.epam.recursion;

/**
 * 10.41 Write a recursive function to calculate the factorial of a natural number n
 */
public class Factorial {
    int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int result = factorial(n - 1) * n;
        return result;
    }
}
