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
        println("Добрый день! Пожалуйста, введите Ваше имя: ");
        player1.name = (new Scanner(System.in)).nextLine();
        player2.name = "robot";
        println("Начнем игру, " + player1.name + ".");
        init();
        player1ShotRight = true;
        while (player1.allDeckQty != 0 && player2.allDeckQty != 0) {
            if (player1ShotRight) {
                if (!player1.shooting(player2.field, false, false)) {
                    player1ShotRight = !player1ShotRight;
                } else {
                    if (!player2.shooting(player1.field, true, false)) {
                        player1ShotRight = !player1ShotRight;
                    }
                }
            }
            textView.showSea(player1, player2, true, false);
        }
        if (player1.allDeckQty == 0) {
            println("Победил игрок " + player2.name + "!");
        } else {
            println("Победил игрок " + player1.name + "!");
        }
    }

    void init() {
        textView.showSea(player1, player2, true, false);
        player1.field.placeShipsByPlayer(player1.ships, textView);
        player2.field.placeShipsRandomly(player2.ships);
        textView.showSea(player1, player2, true, false);
    }
}

