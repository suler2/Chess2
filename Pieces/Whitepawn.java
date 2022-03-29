package Pieces;

import java.awt.image.BufferedImage;

public class Whitepawn extends Piece {
    private static final int ID = 0;
    private static int value = 10;

    public Whitepawn(int x, int y) {
        super(true, x, y);
    }

    public Whitepawn(boolean side, int x, int y) {
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
