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
		lFlapper = new Flapper(150, 230, 540, 540);
		rFlapper = new Flapper(430, 350, 540, 540);
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