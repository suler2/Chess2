import java.util.*;

import java.awt.*;
import javax.swing.*;

import Pieces.*;

public class Chess {
    public static void main(String[] args) {

        int[][] sahovnica = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(i %  2 == 0) {
                    if(j % 2 == 0) {
                        sahovnica[i][j] = 8;
                    }
                    else {
                        sahovnica[i][j] = 7;
                    }
                }
                else {
                    if(j % 2 == 0) {
                        sahovnica[i][j] = 7;
                    }
                    else {
                        sahovnica[i][j] = 8;
                    }
                }
            }
        }

        inicializirajSahovnico(sahovnica);
        printSahovnica(sahovnica);

        JFrame frame = new JFrame();
        frame.setBounds(10, 10, 640, 640);
        JPanel panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                boolean white = true;
                int y = (int)frame.getContentPane().getHeight();
                int x = (int)frame.getContentPane().getWidth();
                for(int i = 0; i < 8; i++) {
                    for(int j = 0; j < 8; j++) {
                        if(white) 
                            g.setColor(Color.white);
                        else 
                            g.setColor(Color.black);
                        g.fillRect(j * x / 8, i * y / 8, x / 8, y / 8);
                        white = !white;
                    }
                    white = !white;
                }
            }
        };
    panel.setBorder(BorderFactory.createLineBorder(Color.black));
    frame.add(panel);
    frame.setDefaultCloseOperation(3);
    frame.setVisible(true);
    
    }

    public static void printSahovnica(int[][] sahovnica) {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) 
                System.out.print(sahovnica[i][j] + "\t");
            System.out.println();
            System.out.println();
        }
    }

    public static void inicializirajSahovnico(int[][] sahovnica) {
        ArrayList<Piece> white = new ArrayList<Piece>();
        ArrayList<Piece> black = new ArrayList<Piece>();
        
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

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                for(Piece figura : white) 
                    if(figura.getX() == j && figura.getY() == i)
                        sahovnica[i][j] = figura.getID();
                for(Piece figura : black) 
                    if(figura.getX() == j && figura.getY() == i)
                        sahovnica[i][j] = figura.getID();
            }
        }
    }
}
    
//    frame.setResizable(false);