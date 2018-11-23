package com.epam.recursion;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursionTest {
    int n;
    Factorial factorial = new Factorial();
    NaturalNumber naturalNumber = new NaturalNumber();
    Exponentiation exponentiation = new Exponentiation();

    @Test(expected = StackOverflowError.class)
    public void testEnteredValue() {
        n = factorial.factorial(0);
        assertEquals(0, n);
    }

    @Test
    public void testEnteredValue1() {
        n = factorial.factorial(1);
        assertEquals(1, n);
    }

    @Test
    public void testEnteredValue5() {
        n = factorial.factorial(5);
        assertEquals(120, n);
    }

    @Test
    public void testSumDigits() {
        n = naturalNumber.sumDigits(1234);
        assertEquals(10, n);
    }

    @Test
    public void testCount() {
        n = naturalNumber.count(1234);
        assertEquals(4, n);
    }

    @Test
    public void testExponentiation() {
        n = exponentiation.power(2, 3);
        assertEquals(8, n);
    }
}