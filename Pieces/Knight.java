package Pieces;

import java.awt.image.BufferedImage;

public class Knight extends Piece {
    private static final int ID = 4;
    private static int value = 35;

    public Knight() {
        super(true);
    }

    public Knight(boolean side) {
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
