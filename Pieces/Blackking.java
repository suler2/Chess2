package Pieces;

import java.awt.image.BufferedImage;

public class Blackking extends King {
    private static final int ID = 25;

    public Blackking(int x, int y) {
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