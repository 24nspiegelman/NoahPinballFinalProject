import java.awt.*;

public class Obstacle extends Rectangle {
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    int x = 0;

    public Obstacle(int xPos, int yPos, int width, int height){
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        color = Color.BLACK;
    }
    public void paintObstacle(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(color);
        g2d.fillRect(xPos, yPos, width, height);
        if (!color.equals(Color.BLACK)){
            x++;
            if (x == 15) {
                color = Color.BLACK;
                x = 0;
            }
        }
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
