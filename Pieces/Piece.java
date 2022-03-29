package Pieces;

public abstract class Piece {
    public boolean alive;
    public abstract int[][] validMoves(int x, int y);
}