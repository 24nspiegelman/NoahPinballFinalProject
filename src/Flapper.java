import java.awt.*;

public class Flapper {

    private int startX;
    private int startY;
    private int endX;
    private int endY;
    static final int flapLength = 80;


    public Flapper(int startX, int endX, int startY, int endY){
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    public void paintFlapper(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawLine(startX, startY, endX, endY);
    }

    public void moveLFlapper(int shift){
        setEndY(getEndY() + shift);
        setEndX(getStartX() + (int)(Math.sqrt(((Math.pow(flapLength, 2))) - ((Math.pow((getEndY() - getStartY()),2))))));
    }

    public void moveRFlapper(int shift){
        setEndY(getEndY() + shift);
        setEndX(getStartX() - (int)(Math.sqrt(((Math.pow(flapLength, 2))) - ((Math.pow((getEndY() - getStartY()),2))))));
    }


    public int getStartX(){
        return startX;
    }
    public int getStartY(){
        return startY;
    }
    public int getEndX(){
        return endX;
    }
    public void setEndX(int xPos){
        endX = xPos;
    }
    public int getEndY(){
        return endY;
    }
    public void setEndY(int yPos){
        endY = yPos;
    }
    public static int getFlapLength(){
        return flapLength;
    }
}
