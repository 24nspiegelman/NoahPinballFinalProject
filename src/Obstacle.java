import java.awt.*;

public class Obstacle extends Rectangle {
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public Obstacle(){
        xPos = 250;
        yPos = 250;
        width = 100;
        height = 100;
    }
    public void paintObstacle(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRect(xPos, yPos, width, height);

    }

    public int getXPos() {
        return xPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getEX(){
        return xPos + width;
    }
    public int getEY(){
        return yPos + height;
    }
}
