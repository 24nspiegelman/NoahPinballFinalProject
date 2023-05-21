import java.awt.*;

public class Flipper {

    private int startX;
    private int startY;
    private int endX;
    private int endY;
    static final int flapLength = 80;
    private int flipAngleIndex = 5;


    public Flipper(int startX, int endX, int startY, int endY){
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
    }

    public void paintFlipper(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setStroke(new BasicStroke(6));
        g2d.drawLine(startX, startY, endX, endY);
    }

    public void moveLFlipper(int place){
        //setStartY(place);
        setEndY(place);
        setEndX(getStartX() + (int)(Math.sqrt(((Math.pow(flapLength, 2))) - ((Math.pow((getEndY() - getStartY()),2))))));
    }

    public void moveRFlipper(int place){
        setEndY(place);
        setEndX(getStartX() - (int)(Math.sqrt(((Math.pow(flapLength, 2))) - ((Math.pow((getEndY() - getStartY()),2))))));
    }

    public int keyPressed() {
        if (flipAngleIndex > 1){
            setFlipAngleIndex(flipAngleIndex-1);
            System.out.println(flipAngleIndex);
        }
        return flipAngleIndex;
    }


    public int getStartX(){
        return startX;
    }
    public int getStartY(){
        return startY;
    }
    public void setStartY(int yPos){
        startY = yPos;
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
    public int getFlipAngleIndex(){
        return flipAngleIndex;
    }
    public void setFlipAngleIndex(int i){
        flipAngleIndex = i;
    }

}
