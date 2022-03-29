package Pieces;

import java.awt.image.BufferedImage;

public class Whitepawn extends Pawn {
    private static final int ID = 10;

    public Whitepawn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getID() {
        return ID;
    }

    public boolean isMoveValid(int[][] sahovnica, int x, int y) {
        return false;
    }
}
