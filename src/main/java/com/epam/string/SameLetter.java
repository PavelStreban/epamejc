package com.epam.string;

public class SameLetter {

    public static void main(String[] args) {
        String sentens = "  Привет, ккак деела??";
        int count = 0;
        char[] chArray = sentens.toCharArray();
        for (int i = 0; i < chArray.length - 1; i++) {
            char letter = chArray[i];
            if (letter == chArray[++i]) {
                count++;
                System.out.println(letter + "" + chArray[i]);
            }
        }
        System.out.println("Количество одинаковых соседних символов в строке = " + count);
    }
}

