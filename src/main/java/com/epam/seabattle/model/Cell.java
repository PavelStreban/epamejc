package com.epam.seabattle.model;

/**
 * Created by Pavel Streban on 24.11.18.
 */
public class Cell {
    int xCoordinate;
    int yCoordinate;
    public Ship ship = null;
    public boolean isShoot;

    public Cell(int xCoordinate, int yCoordinate, Ship ship, boolean isShoot) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.ship = ship;
        this.isShoot = isShoot;
    }
}
