package com.epam.recursion;

public class PrintData {

    public void printData() {
        Factorial factorial = new Factorial();
        System.out.println("Factorial 5 is " + factorial.factorial(5));
        System.out.println("Factorial 15 is " + factorial.factorial(15));
        System.out.println();

        Exponentiation exponentiation = new Exponentiation();
        System.out.println("a = 2, n = 0, an answer is " + exponentiation.power(2, 0));
        System.out.println("a = 2, n = 2, an answer is " + exponentiation.power(2, 2));
        System.out.println();

        NaturalNumber naturalNumber = new NaturalNumber();
        System.out.println("The number is 12124, the sum of digit is " + naturalNumber.sumDigits(12124));
        System.out.println("The number is 12124, the count is " + naturalNumber.count(12124));
    }
}
