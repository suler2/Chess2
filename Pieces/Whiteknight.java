package Pieces;

import java.awt.image.BufferedImage;

public class Whiteknight extends Knight {
    private static final int ID = 12;

    public Whiteknight(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Whiteknight(int x, int y, BufferedImage wholeImage) {
        this.x = x;
        this.y = y;
        createPieceImage(wholeImage);
    }

    public int getID() {
        return ID;
    }

    public boolean validMoves(int[][] sahovnica, int x, int y) {
        return false;
    }

    public void createPieceImage(BufferedImage wholeImage) {
        int width = wholeImage.getWidth() / 6;
        int height = wholeImage.getHeight() / 2;
        pieceImage = wholeImage.getSubimage(3 * width, 0 * height, width, height);
    }
}