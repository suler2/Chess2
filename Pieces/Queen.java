package Pieces;

import java.awt.image.BufferedImage;

import javax.print.attribute.standard.QueuedJobCount;

public class Queen extends Piece {
    private static final int ID = 6;
    private static int value = 80;

    public Queen() {
        super(true);
    }

    public Queen(boolean side) {
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
