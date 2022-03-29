package Pieces;

import java.awt.image.BufferedImage;

public abstract class King extends Piece {
    protected static int value = 1000;

    public int getValue() {
        return value;
    }

    public boolean validMoves(int[][] sahovnica, int x, int y) {
        return false;
    }
}
