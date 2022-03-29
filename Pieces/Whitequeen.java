package Pieces;

import java.awt.image.BufferedImage;

public class Whitequeen extends Queen {
    private static final int ID = 14;

    public Whitequeen(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Whitequeen(int x, int y, BufferedImage wholeImage) {
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
        pieceImage = wholeImage.getSubimage(1 * width, 0 * height, width, height);
    }
}