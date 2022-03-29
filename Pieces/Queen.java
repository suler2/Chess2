package Pieces;

import java.awt.image.BufferedImage;

public class Queen extends Piece {
    private static final int ID = 5;
    private static int value = 80;

    public Queen(int x, int y) {
        super(true, x, y);
    }

    public Queen(boolean side, int x, int y) {
        super(true, x, y);
    }

    public int getID() {
        return ID;
    }

    public int getValue() {
        return value;
    }

    public boolean isMoveValid(int[][] sahovnica, int x, int y) {
        return false;
    }
}
