package Pieces;

import java.awt.image.BufferedImage;

public class Bishop extends Piece {
    private static final int ID = 3;
    private static int value = 30;

    public Bishop() {
        super(true);
    }

    public Bishop(boolean side) {
        super(true);
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
