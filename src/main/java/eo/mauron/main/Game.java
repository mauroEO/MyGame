package eo.mauron.main;

public class Game implements Runnable {
    private GameWindows gameWindows;
    private GamePanel gamePanel;
    private Thread gameThread;
    private final int FPS_SET = 60;

    public Game() {
        gamePanel = new GamePanel();
        gameWindows = new GameWindows(gamePanel);
        gamePanel.requestFocus();
    }

    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double timePerFrame = 1000000000 / FPS_SET;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        boolean isCorrectFtsAmount  = now - lastFrame >= timePerFrame;

        while (true) {

            if (isCorrectFtsAmount ) {
                gamePanel.repaint();
                lastFrame = now;
            }
        }
    }
}
