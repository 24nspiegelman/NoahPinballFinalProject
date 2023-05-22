import javax.swing.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pinball");
        Game game = new Game();
        frame.add(game);
        frame.setSize(550, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.start();

        game.requestFocus();

        while (true) {
            game.act();
            Thread.sleep(10);
        }
    }
}