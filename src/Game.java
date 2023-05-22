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
	boolean lShiftDown;
	boolean rShiftDown;

	public Game(){
		setFocusable(true);
		this.addKeyListener(this);
	}

	public void start(){
		ball = new Ball();
		lFlipper = new Flipper(150, 230, 540, 540);
		rFlipper = new Flipper(430, 350, 540, 540);
	}

	public void act(){
		getBall().moveBall();
		getBall().flapHit(getLFlapper(), getRFlapper());
		if (lShiftDown){
			lFlipper.keyPressed(lShiftDown);
			setLFlipper(lFlipper.getFlipAngleIndex() - 1);
		}
		else{
			lFlipper.keyPressed(lShiftDown);
			setLFlipper(lFlipper.getFlipAngleIndex() + 1);
		}

		if (rShiftDown){
			rFlipper.keyPressed(rShiftDown);
			setLFlipper(rFlipper.getFlipAngleIndex() - 1);
		}
		else{
			rFlipper.keyPressed(rShiftDown);
			setLFlipper(rFlipper.getFlipAngleIndex() + 1);
		}
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