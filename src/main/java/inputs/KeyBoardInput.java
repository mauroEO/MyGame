package inputs;

import eo.mauron.main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardInput implements KeyListener {

    private GamePanel gamePanel;

    public KeyBoardInput(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        int rateOfChange = 15;
        switch (keyEvent.getKeyCode()) {
            case KeyEvent.VK_W -> gamePanel.changeYAxisDelta(-rateOfChange);
            case KeyEvent.VK_S -> gamePanel.changeYAxisDelta(+rateOfChange);
            case KeyEvent.VK_D -> gamePanel.changeXAxisDelta(+rateOfChange);
            case KeyEvent.VK_A -> gamePanel.changeXAxisDelta(-rateOfChange);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}
