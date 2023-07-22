package eo.mauron.main;

public class Game {
    private GameWindows gameWindows;
    private GamePanel gamePanel;

    public Game(){
        gamePanel   = new GamePanel();
        gameWindows = new GameWindows(gamePanel);

    }
}
