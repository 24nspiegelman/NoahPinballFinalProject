import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ball {

    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double gravity;


    public Ball(){
        xPos = 0;
        yPos = 0;
        xVel = 1;
        yVel = 1;
        gravity = 0.5;
    }
    public void moveBall() {
        xPos = xPos + xVel;
        yPos = yPos + yVel + gravity;
        bounce();
    }
    public void bounce(){
        if (xPos == 560 || xPos == 0){
            xVel *= -1;
        }
        if (yPos == 0 || yPos == 717){
            yVel *= -1;
        }
    }

    public void paintBall(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval((int) getXPos(), (int) getYPos(), 10, 10);
    }


    public double getXPos(){
        return this.xPos;
    }
    public double getYPos(){
        return this.yPos;
    }
    public double getXVel(){
        return this.xVel;
    }
    public double getYVel(){
        return this.yVel;
    }

}
