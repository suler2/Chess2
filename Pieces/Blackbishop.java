package Pieces;

import java.awt.image.BufferedImage;

public class Blackbishop extends Bishop {
    private static final int ID = 21;

    public Blackbishop(int x, int y) {
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