import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.TimerTask;

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

        java.util.Timer t = new java.util.Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                game.act();
            }
        };
        long delay = 5;
        t.scheduleAtFixedRate(task, delay, 30);
    }
}