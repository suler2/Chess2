package Pieces;

import java.awt.image.BufferedImage;

public class Rook extends Piece {
    private static final int ID = 5;
    private static int value = 50;

    public Rook() {
        super(true);
    }

    public Rook(boolean side) {
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
