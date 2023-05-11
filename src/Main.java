import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Game game = new Game();
        game.start();

        while (true) {
            game.render();
            game.getBall().moveBall();
            game.getFrame().repaint();
            Thread.sleep(10);
        }
    }
}