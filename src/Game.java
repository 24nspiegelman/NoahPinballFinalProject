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
		this.ball = new Ball();
		this.lFlapper = new Flapper(150, 535, 226, 550);
		this.rFlapper = new Flapper(150, 535, 226, 550);
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);
		lFlapper.paintFlapper(g);
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