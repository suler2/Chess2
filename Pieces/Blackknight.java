package Pieces;

import java.awt.image.BufferedImage;

public class Blackknight extends Knight {
    private static final int ID = 22;

    public Blackknight(int x, int y) {
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