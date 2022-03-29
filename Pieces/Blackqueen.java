package Pieces;

import java.awt.image.BufferedImage;

public class Blackqueen extends Queen {
    private static final int ID = 24;

    public Blackqueen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Blackqueen(int x, int y, BufferedImage wholeImage) {
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
        pieceImage = wholeImage.getSubimage(1 * width, 1 * height, width, height);
    }
}