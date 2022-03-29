package Pieces;

import java.awt.image.BufferedImage;

public class King extends Piece {
    private static final int ID = 7;
    private static int value = 1000;

    public King() {
        super(true);
    }

    public King(boolean side) {
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
