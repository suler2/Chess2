package Pieces;

import java.awt.image.BufferedImage;

public class Rook extends Piece {
    private static final int ID = 4;
    private static int value = 50;

    public Rook(int x, int y) {
        super(true, x, y);
    }

    public Rook(boolean side, int x, int y) {
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
