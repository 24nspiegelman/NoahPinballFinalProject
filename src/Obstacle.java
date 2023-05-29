import java.awt.*;

public class Obstacle extends Rectangle {
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public Obstacle(int xPos, int yPos, int width, int height){
        this.xPos = xPos;
        this.yPos = yPos;

        this.width = width;
        this.height = height;
    }
    public void PaintObstacle(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillRect(xPos, yPos, width, height);

    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
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
}
