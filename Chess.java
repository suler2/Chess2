import java.awt.*;
import javax.swing.*;

public class Chess {
    public static void main(String[] args) {
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
                        g.fillRect(j * 80, i * 80, 80, 80);
                        white = !white;
                    }
                    white = !white;
                }
            }
        };
    panel.setBorder(BorderFactory.createLineBorder(Color.black));
    panel.
    frame.add(panel);
    frame.setDefaultCloseOperation(3);
    frame.setVisible(true);
//    frame.setResizable(false);
    //    Player first = new Player();
    //    Player secnd = new Player();
    }
}