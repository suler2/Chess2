package Pieces;

import java.awt.image.BufferedImage;

public class Bishop extends Piece {
    private static final int ID = 2;
    private static int value = 30;

    public Bishop(int x, int y) {
        super(true, x, y);
    }

    public Bishop(boolean side, int x, int y) {
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
