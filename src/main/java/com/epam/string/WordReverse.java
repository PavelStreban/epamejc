package com.epam.string;

public class WordReverse {

    public static void main(String[] args) {
        String str = "01234 56789";
        String[] words = str.split("\\s");
        for (String subStr : words) {
            StringBuffer sbf = new StringBuffer(subStr);
            System.out.print(" " + sbf.reverse());
        }
    }
}

