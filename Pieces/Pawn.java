package Pieces;

import java.awt.image.BufferedImage;

public abstract class Pawn extends Piece {
    private static int value = 10; 

    public int getValue() {
        return value;
    }

    public boolean isMoveValid(int[][] sahovnica, int x, int y) {
        return false;
    }
}