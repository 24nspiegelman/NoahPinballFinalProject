import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Ball {

    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private final double gravity;


    public Ball(){
        xPos = 0;
        yPos = 0;
        xVel = 3;
        yVel = 3;
        gravity = 2.5;
    }
    public void moveBall(Flipper l, Flipper r) {
        yVel += gravity;
        xPos = xPos + xVel;
        yPos = yPos + yVel;
        bounce();
        flapHit(l, r);
    }
    public void bounce(){
        if ((xPos > 560 && xVel > 0) || (xPos < 0 && xVel <0)){
            xVel *= -1;
        }
        if ((yPos < 0 && yVel < 0) || (yPos > 717 && yVel > 0)){
            yVel *= -1;
        }
        if (yVel < 0 && yVel > -1 && yPos > 749){
            reset();
        }
    }

    public void paintBall(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval( getXPos(),getYPos(), 10, 10);
    }

    public void flapHit(Flipper l, Flipper r){
        System.out.println("Start: " + r.getStartY()+ "\n" + "Ball: " + yPos);
        if (xPos >= l.getStartX() && xPos <= l.getEndX() && (yPos <= l.getStartY() && (yPos + yVel) >= l.getStartY())) {
            yVel *= -1;
        }
        if (xPos <= r.getStartX() && xPos >= r.getEndX() && (yPos <= r.getStartY() && (yPos + yVel) >= r.getStartY())) {
            yVel *= -1;
        }
    }

        public void reset(){
            xPos = 350;
            yPos = 350;
            xVel = 0.75;
            yVel = 0.75;
        }

    public int getXPos(){
        return (int) xPos;
    }
    public int getYPos(){
        return (int) yPos;
    }
    public double getXVel(){
        return this.xVel;
    }
    public double getYVel(){
        return this.yVel;
    }
}
