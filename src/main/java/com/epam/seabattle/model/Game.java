package com.epam.seabattle.model;

import com.epam.seabattle.view.TextView;

import java.util.Scanner;

import static com.epam.seabattle.view.Printable.println;

/**
 * Created by Pavel Streban.
 * oneDeckShipQty = 4; twoDeckShipQty = 3; threeDeckShipQty = 2; fourDeckShipQty = 1;
 */
public class Game {

    Player player1 = new Player();
    Player player2 = new Player();
    TextView textView = new TextView();
    boolean player1ShotRight;

    public void newStart() {

        println("Hello! Please, enter your name: ");
        player1.name = (new Scanner(System.in)).nextLine();
        player2.name = "robot";
        println("Game is started, " + player1.name + ".");
        // создание и расстановка кораблей игроков
        init();
        player1ShotRight = true;
        while (player1.allDeckQty != 0 && player2.allDeckQty != 0) {
            if (player1ShotRight) {
                if (!player1.shooting(player2.field, false, false)) {
                    player1ShotRight = !player1ShotRight;
                }
            } else {
                if (!player2.shooting(player1.field, true, false)) {
                    player1ShotRight = !player1ShotRight;
                }
            }
            textView.showSea(player1, player2, true, false);
        }
        if (player1.allDeckQty == 0) {
            println("Player win " + player2.name + "!");
        } else {
            println("Player win " + player1.name + "!");
        }
    }

    void init() {
        textView.showSea(player1, player2, true, false);
        player1.field.placeShipsByPlayer(player1.ships, textView);
        player2.field.placeShipsRandomly(player2.ships);
        textView.showSea(player1, player2, true, false);
    }
}

