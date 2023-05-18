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
        xVel = 0.75;
        yVel = 0.75;
        gravity = 0.5;
    }
    public void moveBall() {
        yVel += gravity;
        xPos = xPos + xVel;
        yPos = yPos + yVel;
        bounce();
    }
    public void bounce(){
        if ((xPos > 560 && xVel > 0) || (xPos < 0 && xVel <0)){
            xVel *= -1;
        }
        if ((yPos < 0 && yVel < 0) || (yPos > 717 && yVel > 0)){
            yVel *= -1;
        }
    }

    public void paintBall(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval((int) getXPos(), (int) getYPos(), 10, 10);
    }

    public void flapHit(Flapper l, Flapper r){
        if (xPos > (l.getStartX() - 5)  && xPos < (l.getEndX() + 5) && yPos > (l.getStartY() - 15) && yPos < (l.getStartY() + 10) && yVel > 0){
                yVel *= -1;
        }
        if (xPos > r.getStartX() && xPos < r.getEndX() && yPos > (r.getStartY() - 15) && yPos < (r.getStartY() + 10) && yVel > 0){
                yVel *= -1;

        }

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
