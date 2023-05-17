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
		lFlapper = new Flapper(150, 226, 535, 535);
		rFlapper = new Flapper(359, 442, 535, 535);
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);
		lFlapper.paintFlapper(g);
		rFlapper.paintFlapper(g);
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