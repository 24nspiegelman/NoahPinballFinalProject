public class Ball {

    private double exactX;
    private double exactY;
    private double velocityX;
    private double velocityY;
    private static final double VELOCITY = Math.sqrt(32);
    private boolean x = true;

    public Ball(){
        this.velocityX = 4;
        this.velocityY = -4;
    }

}
