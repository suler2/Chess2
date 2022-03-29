package Pieces;

import java.awt.image.BufferedImage;

public class Knight extends Piece {
    private static final int ID = 3;
    private static int value = 35;

    public Knight(int x, int y) {
        super(true, x, y);
    }

    public Knight(boolean side, int x, int y) {
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
