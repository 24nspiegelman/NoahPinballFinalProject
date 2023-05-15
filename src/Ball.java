import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ball {

    private double x;
    private double y;
    private double velX;
    private double velY;
    private double gravity;


    public Ball(){
        x = 0;
        y = 0;
        velX = 1;
        velY = 1;
        gravity = 0.5;
    }
    public void moveBall() {
        x = x + velX;
        y = y + velY + gravity;
        bounce();
    }
    public void bounce(){
        if (x == 560 || x == 0){
            velX *= -1;
        }
        if (y == 0 || y == 717){
            velY *= -1;
        }
    }

    public void paintBall(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval((int) getX(), (int) getY(), 10, 10);
    }


    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public double getVelX(){
        return this.velX;
    }
    public double getVelY(){
        return this.velY;
    }

}
