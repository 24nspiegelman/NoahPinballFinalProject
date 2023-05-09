import javax.swing.*;
import java.awt.*;

public class Machine {

    JFrame frame;

    JPanel launchPanel, mainPanel;

    public Machine() {
        frame = new JFrame("Whole Machine");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setPreferredSize(new Dimension(563, 750));

        frame.pack();
        frame.setVisible(true);
    }
}
