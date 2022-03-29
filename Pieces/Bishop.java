package Pieces;

import java.awt.image.BufferedImage;

public abstract class Bishop extends Piece {
    protected static int value = 30;

    public int getValue() {
        return value;
    }

    public boolean validMoves(int[][] sahovnica, int x, int y) {
        return false;
    }
}
