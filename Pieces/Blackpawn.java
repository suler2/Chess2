package Pieces;

import java.awt.image.BufferedImage;

public class Blackpawn extends Piece {
    private static final int ID = 2;
    private static int value = 10;

    public Blackpawn() {
        super(true);
    }

    public Blackpawn(boolean side) {
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
