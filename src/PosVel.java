public class PosVel {

    private double px;
    private double py;
    private double vx;
    private double vy;
    private int sx;
    private int sy;
    private int ex;
    private int ey;

    public PosVel(Ball b){
        this.px = b.getXPos();
        this.py = b.getYPos();
        this.vx = b.getXVel();
        this.vy = b.getXVel();
    }

    public PosVel(Flapper f){
        sx = f.getStartX();
        sy = f.getStartY();
        ex = f.getEndX();
        ey = f.getEndY();
    }

    public String toString(){
        return ("Ball: (" +  px + " ," + py + " ," + vx + " ," + vy + ")"/*+
                "\n Flapper: (" +  sx + " ," + sy + " ," + ex + " ," + ey + ")"*/);
    }

}
