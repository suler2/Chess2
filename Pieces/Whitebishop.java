package Pieces;

import java.awt.image.BufferedImage;

public class Whitebishop extends Bishop {
    private static final int ID = 11;

    public Whitebishop(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getID() {
        return ID;
    }

    public boolean validMoves(int[][] sahovnica, int x, int y) {
        return false;
    }
}
