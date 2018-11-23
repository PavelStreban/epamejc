package com.epam.lambda;

public class LambdaDemo {

    public static void main(String[] args) {
        RandomNumber randomNumber;
        randomNumber = () -> Math.random() * 100;

        EvenNumber evenNumber;
        evenNumber = (n) -> (n % 2) == 0;

        System.out.println(randomNumber.gatValue());
        System.out.println(evenNumber.test(2));
    }
}
