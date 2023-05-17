import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
	JFrame frame;
	Ball ball;
	Flapper lFlapper;
	Flapper rFlapper;

	public Game(){

	}

	public void start(){
		ball = new Ball();
		lFlapper = new Flapper(150, lFlapper.getStartX() + lFlapper.getFlapLength(), 550, 550);
		rFlapper = new Flapper(350, rFlapper.getStartX() + rFlapper.getFlapLength(), 550, 550);
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);
		lFlapper.paintFlapper(g);
		rFlapper.paintFlapper(g);
		lFlapper.moveFlapper(lFlapper, 10);
	}


	public JFrame getFrame(){
		return this.frame;
	}
	public Ball getBall(){
		return this.ball;
	}
	public Flapper getLFlapper(){
		return this.lFlapper;
	}
	public Flapper getRFlapper(){
		return this.rFlapper;
	}



}