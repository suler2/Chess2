package Pieces;

import java.awt.image.BufferedImage;

public class Whiteking extends King {
    private static final int ID = 15;

    public Whiteking(int x, int y) {
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