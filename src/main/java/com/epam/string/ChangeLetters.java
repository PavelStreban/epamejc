package com.epam.string;

public class ChangeLetters {

    public static void main(String[] args) {
        String word = "abcdefghj";
        char[] wordArray = word.toCharArray();
        char temp = wordArray[0];
        wordArray[0] = wordArray[5];
        wordArray[5] = temp;
        System.out.println(wordArray);
    }
}