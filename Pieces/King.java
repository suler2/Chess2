package Pieces;

import java.awt.image.BufferedImage;

public class King extends Piece {
    private static final int ID = 6;
    private static int value = 1000;

    public King(int x, int y) {
        super(true, x, y);
    }

    public King(boolean side, int x, int y) {
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
