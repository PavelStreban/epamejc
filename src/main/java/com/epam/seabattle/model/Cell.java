package com.epam.seabattle.model;

/**
 * Created by Pavel Streban on 24.11.18.
 */
public class Cell {
    int xCoordinate;
    int yCoordinate;
    public Ship ship = null;
    public boolean isShoot;

    public Cell(int x, int y, Ship ship, boolean isShoot) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.ship = ship;
        this.isShoot = isShoot;
    }
}
