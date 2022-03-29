import Pieces.*;

public class Polje {
    private String color;
    private Piece piece;

    //relative to top left pixel of window
    private int posX;
    private int posY;
    private int sizeX;
    private int sizeY;

    //v primeru brez grafike
    public Polje(String color) {
        this.color = color;
        this.piece = null;
    }

    //v primeru z grafiko
    public Polje(String color, int posX, int posY, int sizeX, int sizeY) {
        this.color = color;
        initPosition(posX, posY, sizeX, sizeY);
    }

    //naknadno inicializrianje grafike
    public void initPosition(int posX, int posY, int sizeX, int sizeY) {
        this.posX = posX;
        this.posY = posY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public String getColor() {
        return this.color;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return this.piece;
    }
}