package com.epam.seabattle;

import com.epam.seabattle.model.Game;
import java.util.Scanner;
import static com.epam.seabattle.view.Printable.println;

/**
 * Created by Pavel Streban on 25.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        int n = 0;
        while (n != 3) {
            println("Main menu. Please select one of mode:");
            println("1 - Demo version ");
            println("2 - Play ");
            println("3 - Exit");
            n = Integer.parseInt((new Scanner(System.in)).nextLine());
            if (n == 1) {
                Game game = new Game();
            }
            if (n == 2) {
                Game game = new Game();
                game.newStart();
            }
        }
    }
}
