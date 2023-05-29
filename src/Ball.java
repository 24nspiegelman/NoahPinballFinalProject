import java.awt.*;

public class Ball {

    private double xPos;
    private double yPos;
    private double xVel;
    private double yVel;
    private double gravity;
    int x = 0;


    public Ball(){
        xPos = 520;
        yPos = 735;
        xVel = -15;
        yVel = -15;
        gravity = 0.125;
    }
    public void moveBall(Flipper l, Flipper r) {
        yVel += gravity;
        xPos = xPos + xVel;
        yPos = yPos + yVel;
        bounce();
        flapHit(l, r);
    }
    public void bounce(){
        if ((xPos > 550 && xVel > 0) || (xPos < 0 && xVel <0)){
            xVel *= -1;
        }
        if (yPos < 0 && yVel < 0){
            if (gravity < 0 && x == 0){
                gravity = 3;
                x = 1;
            }
            yVel *= -1;
        }
        if ((yPos > 717 && yVel > 0)){
            yVel *= -1;
        }
        if (yVel <= 0 && yPos >= 900){
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
        if (xPos >= l.getStartX() && xPos <= l.getEndX() && (yPos <= l.getStartY() && (yPos + yVel) >= l.getStartY())) {
//            yVel += 3;
            yVel *= -1;
        }
        if (xPos >= r.getStartX() && xPos <= r.getEndX() && (yPos <= r.getStartY() && ((yPos + yVel) >= r.getStartY())) && yVel >= 0) {
//            yVel += 3;
            yVel *= -1;

        }
    }

    public void obstacleHit(Obstacle o){
        if (xPos >= o.getXPos() && xPos <= o.getEX()){
            if (yPos <= o.getYPos() && o.getYPos() <= (yPos + yVel) && yVel > 0){

            }
            if ()
        }
    }
        public void reset(){
            xPos = 520;
            yPos = 735;
            xVel = -3;
            yVel = -3;
            gravity = 2;
            x = 0;
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
    public void setXVel(double x){
        xVel = x;
    }
    public double getYVel(){
        return this.yVel;
    }
    public void setYVel(double y){
        yVel = y;
    }
    public double getGravity(){
        return gravity;
    }
}
