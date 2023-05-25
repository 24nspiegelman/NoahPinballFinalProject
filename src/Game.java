import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements KeyListener{
	JFrame frame;
	Ball ball;
	Flipper lFlipper;
	Flipper rFlipper;
	boolean lShiftDown, rShiftDown;


	public Game(){
		setFocusable(true);
		this.addKeyListener(this);
	}

	public void start(){
		ball = new Ball();
		lFlipper = new Flipper(150, 250, 540, 540);
		rFlipper = new Flipper(330, 440, 540, 540);
	}

	public void act(){
		ball.moveBall(lFlipper, rFlipper);
		System.out.println(ball.getYPos());
		lFlipper.keyPressed(lShiftDown);
		rFlipper.keyPressed(rShiftDown);
		repaint();
	}

	public void paintComponent(Graphics g){
		ball.paintBall(g);
		setLFlipper(lFlipper.getFlipAngleIndex());
		setRFlipper(rFlipper.getFlipAngleIndex());
		lFlipper.paintFlipper(g);
		rFlipper.paintFlipper(g);
	}
	public void setLFlipper(int pos){
		if (pos == 1){
			lFlipper.moveLFlipper(540);
		}
		else if(pos == 2){
			lFlipper.moveLFlipper(556);
		}
		else if(pos == 3){
			lFlipper.moveLFlipper(572);
		}
		else if(pos == 4){
			lFlipper.moveLFlipper(588);
		}
		else if (pos == 5){
			lFlipper.moveLFlipper(604);
		}
//		if (ball.getXPos() >= lFlipper.getStartX() && ball.getXPos() <= lFlipper.getEndX() && (ball.getYPos() <= lFlipper.getStartY() && (ball.getYPos() + ball.getYVel()) >= lFlipper.getStartY() + 16)) {
////            yVel += 3;
//			ball.setYVel(ball.getYVel() * -1);
//		}
//		if (ball.getXPos() >= rFlipper.getStartX() && ball.getXPos() <= rFlipper.getEndX() && (ball.getYPos() <= rFlipper.getStartY() && ((ball.getYPos() + ball.getYVel()) >= rFlipper.getStartY())) && ball.getYVel() >= 0) {
////            yVel += 3;
//			ball.setYVel(ball.getYVel() * -1);
//		}
		Rectangle flipperBounds = lFlipper.getBounds();
		Rectangle ballBounds = ball.getBounds();

		if (lShiftDown && flipperBounds.intersects(ballBounds)) {
			ball.setYVel(ball.getYVel() * -1);
		}
	}

	public void setRFlipper(int pos){
		if (pos == 1){
			rFlipper.moveRFlipper(540);
		}
		else if(pos == 2){
			rFlipper.moveRFlipper(556);
		}
		else if(pos == 3){
			rFlipper.moveRFlipper(572);
		}
		else if(pos == 4){
			rFlipper.moveRFlipper(588);
		}
		else if (pos == 5){
			rFlipper.moveRFlipper(604);
		}
	}


	public JFrame getFrame(){
		return this.frame;
	}
	public Ball getBall(){
		return this.ball;
	}
	public Flipper getLFlapper(){
		return this.lFlipper;
	}
	public Flipper getRFlapper(){
		return this.rFlipper;
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