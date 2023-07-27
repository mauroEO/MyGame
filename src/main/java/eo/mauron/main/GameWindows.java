package eo.mauron.main;

import javax.swing.*;

public class GameWindows {
    private JFrame jFrame;

    public GameWindows(GamePanel gamePanel) {
        jFrame = new JFrame();
        jFrame.setSize(800, 800);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);


        jFrame.setVisible(true);
    }
}
