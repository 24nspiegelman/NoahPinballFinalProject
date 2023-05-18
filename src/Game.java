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

	public void setFlaps(int pos){
		if (pos == 1){
			lFlapper.moveLFlapper(540);
			rFlapper.moveRFlapper(540);
		}
		else if(pos == 2){
			lFlapper.moveLFlapper(556);
			rFlapper.moveRFlapper(556);
		}
		else if(pos == 3){
			lFlapper.moveLFlapper(572);
			rFlapper.moveRFlapper(572);
		}
		else if(pos == 4){
			lFlapper.moveLFlapper(588);
			rFlapper.moveRFlapper(588);
		}
		else{
			lFlapper.moveLFlapper(604);
			rFlapper.moveRFlapper(604);
		}
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