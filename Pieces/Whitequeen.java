package Pieces;

import java.awt.image.BufferedImage;

public class Whitequeen extends Queen {
    private static final int ID = 14;

    public Whitequeen(int x, int y) {
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