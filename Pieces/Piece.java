/** Top level class za figure.
 */

package Pieces;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import java.io.*;

import java.lang.*;

public abstract class Piece {
    protected BufferedImage piecesImage;

    protected boolean alive;
    protected int x;
    protected int y;

    public Piece() {
        this.alive = true;
        initPieceImage();
    }

    public boolean getAliveStatus() {
        return alive;
    }

    public void kill() {
        this.alive = false;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int[] getPos() {
        int[] pos = {x, y};
        return pos;
    }

    public boolean[][] getValidMoves(int[][] sahovnica, int x, int y) {
        boolean[][] validMoves = new boolean[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(validMoves(sahovnica, i, j)) validMoves[i][j] = true;
            }
        }
        return validMoves;
    }
    
    public abstract int getID();
    public abstract int getValue();
    public abstract boolean validMoves(int[][] sahovnica, int x, int y);

    public void initPieceImage() {
        try {
            piecesImage = ImageIO.read(new File("img/640px-Chess_Pieces_Sprite.svg.png"));
        }
        catch (Exception e) {
            System.out.println("Piece image initialization error!");
            e.printStackTrace();
            System.out.println(e);
            
        }
    }

//    public abstract void createPieceImage();

/**
 *  Za dobivanje posameznih figur
    public void createPieceImage() {
        int width = piecesImage.getwidth() / 6;
        int height = piecesImage.getHeight() / 2;
        BufferedImage whitepawnImage = piecesImage.getSubimage(
                                       5 * (piecesImage.getwidth() / 6),
                                       0,
                                       piecesImage.getwidth() / 6,
                                       piecesImage.getwidth() / 2);
        
    }
    */
}