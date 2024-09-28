package play;

import java.awt.*;

public interface Game {
    public void move();

    void gameOver(Graphics graphics);

    public void checkHit();
    public void checkFood();
    public void addFood();
    public void playGame();
    public void draw(Graphics graphics);

}
