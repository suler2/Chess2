package Pieces;

import java.awt.image.BufferedImage;

public class Whiterook extends Rook {
    private static final int ID = 13;

    public Whiterook(int x, int y) {
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
