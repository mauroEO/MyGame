package eo.mauron.main;

import inputs.KeyBoardInput;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    private int xAxisDelta = 100, yAxisDelta = 100;

    public GamePanel() {
        addKeyListener(new KeyBoardInput(this));
    }

    public void changeYAxisDelta(int value) {
        this.yAxisDelta += value;

    }

    public void changeXAxisDelta(int value) {
        this.xAxisDelta += value;

    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.fillRect(xAxisDelta, yAxisDelta, 100, 100);
        repaint();
    }
}
