package Pieces;

import java.awt.image.BufferedImage;

public class Whitepawn extends Piece {
    private static final int ID = 1;
    private static int value = 10;

    public Whitepawn() {
        super(true);
    }

    public Whitepawn(boolean side) {
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
