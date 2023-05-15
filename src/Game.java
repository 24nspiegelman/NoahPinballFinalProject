import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
	JFrame frame;
	Ball ball;

	public Game(){

	}

	public void start(){
		this.ball = new Ball();
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);

	}
	public JFrame getFrame(){
		return this.frame;
	}
	public Ball getBall(){
		return this.ball;
	}


}