package com.epam.seabattle.view;

/**
 * Created by Pavel Streban.
 */
public interface Printable {
    static void print(String s) {
        System.out.print(s);
    }

    static void println(String s) {
        System.out.println(s);
    }
}
