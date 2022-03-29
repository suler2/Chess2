import java.util.*;

import java.awt.*;
import javax.swing.*;

import Pieces.*;

public class Sahovnica {
    private static Polje[][] sahovnica;
        
    private static JFrame frame;
    private static JPanel panel;

    private static final int defaultSizeWindowX = 640;
    private static final int defaultSizeWindowY = 640;

    private static int sizePanelX;
    private static int sizePanelY;

    private static ArrayList<Piece> white;
    private static ArrayList<Piece> black;

    public Sahovnica() {
        initSahovnica();
        grafika();
        startPosition();
        printSahovnica();
    }

    private static void initSahovnica() {
        sahovnica = new Polje[8][8];
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(i % 2 == 0) {
                    if(j % 2 == 0) sahovnica[i][j] = new Polje("W");
                    else sahovnica[i][j] = new Polje("B");
                }
                else {
                    if(j % 2 == 0) sahovnica[i][j] = new Polje("B");
                    else sahovnica[i][j] = new Polje("W");
                }
            }
        }
    }

    private static void grafika() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(defaultSizeWindowX, defaultSizeWindowY));
        frame.pack();

        sizePanelX = (int)frame.getContentPane().getWidth();
        sizePanelY = (int)frame.getContentPane().getHeight();
            

        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                boolean white = true;
                for(int i = 0; i < 8; i++) {
                    for(int j = 0; j < 8; j++) {
                        int sizeX = sizePanelX / 8;
                        int sizeY = sizePanelY / 8;
                        int posX = j * sizeX;
                        int posY = i * sizeY;
                        if(white) 
                           g.setColor(Color.white);
                        else 
                            g.setColor(Color.black);
                        g.fillRect(posX, posY, sizeX, sizeY);
                        white = !white;
                        sahovnica[i][j].initPosition(posX, posY, sizeX, sizeY);
                    }
                    white = !white;
                }
            }
        };

        panel.setSize(new Dimension(sizePanelX, sizePanelY));
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        frame.add(panel);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public static Polje getPolje(int x, int y) {
        return sahovnica[y][x];
    }

    public static Polje[][] getSahovnica() {
        return sahovnica;
    }

    public static void startPosition() {
        white = new ArrayList<Piece>();
        black = new ArrayList<Piece>();
            
        for(int i = 0; i < 8; i++) {
            white.add(new Whitepawn(i, 6));
            black.add(new Blackpawn(i, 1));
       }
            
        white.add(new Whiterook(0, 7));
        white.add(new Whiteknight(1, 7));
        white.add(new Whitebishop(2, 7));
        white.add(new Whitequeen(3, 7));
        white.add(new Whiteking(4, 7));
        white.add(new Whitebishop(5, 7));
        white.add(new Whiteknight(6, 7));
        white.add(new Whiterook(7, 7));

        black.add(new Blackrook(0, 0));
        black.add(new Blackknight(1, 0));
        black.add(new Blackbishop(2, 0));
        black.add(new Blackqueen(3, 0));
        black.add(new Blackking(4, 0));
        black.add(new Blackbishop(5, 0));
        black.add(new Blackknight(6, 0));
        black.add(new Blackrook(7, 0));

        for(Piece figura : white) 
            sahovnica[figura.getY()][figura.getX()].setPiece(figura);
        for(Piece figura : black) 
            sahovnica[figura.getY()][figura.getX()].setPiece(figura);
    }

    public static void printSahovnica() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(sahovnica[i][j].getPiece() == null)
                    System.out.print(sahovnica[i][j].getColor() + "\t");
                else 
                    System.out.print(sahovnica[i][j].getPiece().getID() + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
