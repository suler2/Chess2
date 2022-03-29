package Pieces;

import java.awt.image.BufferedImage;

public abstract class Queen extends Piece {
    private static int value = 80;

    public int getValue() {
        return value;
    }

    public boolean isMoveValid(int[][] sahovnica, int x, int y) {
        return false;
    }
}
