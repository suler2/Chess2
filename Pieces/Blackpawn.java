package Pieces;

import java.awt.image.BufferedImage;

public class Blackpawn extends Pawn {
    private static final int ID = 20;

    public Blackpawn(int x, int y) {
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
