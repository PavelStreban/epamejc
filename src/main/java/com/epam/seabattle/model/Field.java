package com.epam.seabattle.model;

import com.epam.seabattle.view.TextView;
import java.util.Random;
import java.util.Scanner;
import static com.epam.seabattle.view.Printable.println;

/**
 * Created by Pavel Streban on 24.11.18.
 */
public class Field {
    public Cell[][] cells = new Cell[10][10];
    Player player;

    Field(Player player) {
        this.player = player;
        init();
    }

    void init() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cells[i][j] = new Cell(i, j, null, false);
            }
        }
    }

    void placeShipsRandomly(Ship[][] ships) {
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < ships[i].length; j++) {
                int upperLeftX;
                int upperLeftY;
                int deckQty;
                boolean isHorizontal;
                do {
                    upperLeftX = random.nextInt(10);
                    upperLeftY = random.nextInt(10);
                    deckQty = i + 1;
                    isHorizontal = random.nextBoolean();
                } while (!checkFreeSpace(upperLeftX, upperLeftY, deckQty, isHorizontal, this));
                ships[i][j] = new Ship(this.cells[upperLeftX][upperLeftY], deckQty, isHorizontal, this);
            }
        }
    }

    void placeShipsByPlayer(Ship[][] ships, TextView textView) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < ships[i].length; j++) {
                int upperLeftX;
                int upperLeftY;
                int deckQty;
                boolean isHorizontal = true;
                String isHorizontalStr;
                do {
                    boolean error;
                    deckQty = i + 1;
                    if (i > 0) {
                        do {
                            error = false;
                            println("Orientation " + (j + 1) + "deck " + deckQty
                                    + "-ship(h - horizontal, v - vertical):");
                            isHorizontalStr = (new Scanner(System.in)).nextLine();
                            if (isHorizontalStr.equals("h")) {
                                isHorizontal = true;
                            } else {
                                if (isHorizontalStr.equals("v")) {
                                    isHorizontal = false;
                                } else error = true;
                            }
                            if (error) {
                                println("Symbol is not correct! Please, enter one more.");
                            }
                        } while (error);
                    }
                    do {
                        error = false;
                        println("Enter the coordinate of the upper or left " + (j + 1) + "deck " + deckQty
                                + "-ship (for example: c2)");
                        String s = (new Scanner(System.in)).nextLine();
                        upperLeftX = s.charAt(0) - 97;
                        upperLeftY = s.charAt(1) - 49;
                        if (s.length() > 2) {
                            upperLeftY = (s.charAt(1) - 48) * 10 + s.charAt(2) - 49;
                        }
                        if (upperLeftX < 0 || upperLeftX > 9 || upperLeftY < 0 || upperLeftY > 9) {
                            error = true;
                        }
                        if (error) {
                            println("Value out of bounds! Pleas, try again.");
                        }
                    } while (error);
                    if (!checkFreeSpace(upperLeftX, upperLeftY, deckQty, isHorizontal, this)) {
                        println("You can not have a ship. Please, try again.");
                    }
                }
                while (!checkFreeSpace(upperLeftX, upperLeftY, deckQty, isHorizontal, this));
                ships[i][j] = new Ship(this.cells[upperLeftX][upperLeftY], deckQty, isHorizontal, this);
                textView.showSea(this.player, true);
            }
        }
    }

    boolean checkFreeSpace(int a, int b, int deckQty, boolean isHorizontal, Field field) {
        if (isHorizontal && (a + deckQty) > 10) {
            return false;
        }
        if (!isHorizontal && (b + deckQty) > 10) {
            return false;
        }
        for (int i = 0; i < deckQty; i++) {
            for (int j = a - 1; j < a + 2; j++) {
                for (int k = b - 1; k < b + 2; k++) {
                    try {
                        if (isHorizontal && field.cells[j + i][k].ship != null) {
                            return false;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                    try {
                        if (!isHorizontal && field.cells[j][k + i].ship != null) {
                            return false;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                    }
                }
            }
        }
        return true;
    }
}

