package Pieces;

import java.awt.image.BufferedImage;

public abstract class Rook extends Piece {
    private static int value = 50;

    public int getValue() {
        return value;
    }

    public boolean isMoveValid(int[][] sahovnica, int x, int y) {
        return false;
    }
}
