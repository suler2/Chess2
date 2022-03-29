package Pieces;

import java.awt.image.BufferedImage;

public class Blackrook extends Rook {
    private static final int ID = 23;

    public Blackrook(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Blackrook(int x, int y, BufferedImage wholeImage) {
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
        pieceImage = wholeImage.getSubimage(4 * width, 1 * height, width, height);
    }
}
