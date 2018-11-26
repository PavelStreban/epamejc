package com.epam.seabattle.model;

/**
 * Created by Pavel Streban on 23.11.2018.
 */
public class Ship {
    int deckQty;
    public int liveDeckQty;
    Cell upperLeftCell;
    boolean isHorizontal;
    Field field;

    public Ship(Cell upperLeftCell, int deckQty, boolean isHorizontal, Field field) {
        this.upperLeftCell = upperLeftCell;
        this.deckQty = deckQty;
        liveDeckQty = deckQty;
        this.isHorizontal = isHorizontal;
        this.field = field;
        for (int i = 0; i < deckQty; i++) {
            if (isHorizontal) {
                field.cells[upperLeftCell.xCoordinate + i][upperLeftCell.yCoordinate].ship = this;
            } else {
                field.cells[upperLeftCell.xCoordinate][upperLeftCell.yCoordinate + i].ship = this;
            }
        }
    }
}
