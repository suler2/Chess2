package Pieces;

import java.awt.image.BufferedImage;

public class Blackrook extends Rook {
    private static final int ID = 23;

    public Blackrook(int x, int y) {
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
