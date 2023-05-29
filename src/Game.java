import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{
	JFrame frame;
	Ball ball;
	Flipper lFlip;
	Flipper rFlip;
	boolean lShiftDown, rShiftDown;
	Obstacle one;


	public Game(){
		setFocusable(true);
		this.addKeyListener(this);
	}

	public void start(){
		ball = new Ball();
		one = new Obstacle();
		lFlip = new Flipper(150, 250, 540, 540);
		rFlip = new Flipper(330, 440, 540, 540);
	}

	public void act(){
		ball.moveBall(lFlip, rFlip, one);
		lFlip.keyPressed(lShiftDown);
		rFlip.keyPressed(rShiftDown);
		repaint();
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);
		one.paintObstacle(g);
		setLFlipper(lFlip.getFlipAngleIndex());
		setRFlipper(rFlip.getFlipAngleIndex());
		lFlip.paintFlipper(g);
		rFlip.paintFlipper(g);
	}
	public void setLFlipper(int pos){
		if (pos == 1){
			lFlip.moveLFlipper(540);
		}
		else if(pos == 2){
			lFlip.moveLFlipper(556);
		}
		else if(pos == 3){
			lFlip.moveLFlipper(572);
		}
		else if(pos == 4){
			lFlip.moveLFlipper(588);
		}
		else if (pos == 5){
			lFlip.moveLFlipper(604);
		}
		if (ball.getXPos() >= lFlip.getStartX() && ball.getXPos() <= lFlip.getEndX() && (ball.getYPos() <= lFlip.getStartY() && (ball.getYPos() + ball.getYVel()) >= lFlip.getStartY() - 16) && ball.getYVel() > 0) {
//            yVel += 3;
			ball.setYVel((ball.getYVel() * -1) - ball.getGravity());
		}
		if (ball.getXPos() >= rFlip.getStartX() && ball.getXPos() <= rFlip.getEndX() && (ball.getYPos() <= rFlip.getStartY() && (ball.getYPos() + ball.getYVel()) >= rFlip.getStartY() - 16) && ball.getYVel() > 0) {
//            yVel += 3;
			ball.setYVel((ball.getYVel() * -1) - ball.getGravity());
		}

	}

	public void setRFlipper(int pos){
		if (pos == 1){
			rFlip.moveRFlipper(540);
		}
		else if(pos == 2){
			rFlip.moveRFlipper(556);
		}
		else if(pos == 3){
			rFlip.moveRFlipper(572);
		}
		else if(pos == 4){
			rFlip.moveRFlipper(588);
		}
		else if (pos == 5){
			rFlip.moveRFlipper(604);
		}
	}


	public JFrame getFrame(){
		return this.frame;
	}
	public Ball getBall(){
		return this.ball;
	}
	public Flipper getLFlip(){
		return this.lFlip;
	}
	public Flipper getRFlip(){
		return this.rFlip;
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SHIFT && e.getKeyLocation() == KeyEvent.KEY_LOCATION_LEFT) {
			lShiftDown = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT && e.getKeyLocation() == KeyEvent.KEY_LOCATION_RIGHT) {
			rShiftDown = true;
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_SHIFT && e.getKeyLocation() == KeyEvent.KEY_LOCATION_LEFT) {
			lShiftDown = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SHIFT && e.getKeyLocation() == KeyEvent.KEY_LOCATION_RIGHT) {
			rShiftDown = false;
		}
	}
}