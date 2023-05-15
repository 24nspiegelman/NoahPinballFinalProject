import javax.swing.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pinball");
        Game game = new Game();
        frame.add(game);
        frame.setSize(563, 750);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.start();

        while (true) {
            game.getBall().moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }
}