package com.epam.trafficlight;

import java.util.Scanner;

/**
 * Created by PavelStreban on 18.09.2018.
 */
public class TrafficLight {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите целое число (количество минут работы светофора)");
            Scanner numberOfEntered = new Scanner(System.in);
            if (numberOfEntered.hasNextInt()) {
                int num = numberOfEntered.nextInt();
                int time = num % 10;
                if (time <= 2 & time > 0) {
                    System.out.println("красный");
                } else {
                    if (time <= 5 & time > 0) {
                        System.out.println("жёлтый");
                    } else {
                        if (time < 0) {
                            System.out.println("Вы ввели отрицательное число!");
                        } else {
                            System.out.println("зелёный");
                        }
                    }
                }
            } else {
                System.out.println("Вы ввели нецелое число!");
            }
        }
    }
}
