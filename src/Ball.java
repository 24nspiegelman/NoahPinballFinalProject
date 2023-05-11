import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball {

    private int x;
    private int y;
    private double velX;
    private double velY;


    public Ball(){
        x = 0;
        y = 0;
        velX = 1;
        velY = -1;
    }
    public void moveBall() {
        x = x + 1;
        y = y + 1;
    }
    public void bounce(){
        if (x == 560 || x == 0){
            velX *= -1;
        }
        if (y == 0 || y == 745){
            velY *= -1;
        }
    }

    public void paint(JPanel j, Graphics g, Ball b) {
        j.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(b.getX(), b.getY(), 7, 7);
    }


    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public double getVelX(){
        return this.velX;
    }
    public double getVelY(){
        return this.velY;
    }

}
