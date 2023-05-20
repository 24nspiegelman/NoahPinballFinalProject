import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
	JFrame frame;
	Ball ball;
	Flipper lFlipper;
	Flipper rFlipper;

	public Game(){
		addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_SHIFT){
					if (e.getKeyLocation() == KeyEvent.VK_SHIFT + KeyEvent.VK_LEFT){
						setLFlipper(lFlipper.keyPressed());
					}
					if (e.getKeyLocation() == KeyEvent.VK_SHIFT + KeyEvent.VK_RIGHT){
						setRFlipper(rFlipper.keyPressed());
					}
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {

			}
		});
	}

	public void start(){
		ball = new Ball();
		lFlipper = new Flipper(150, 230, 540, 540);
		rFlipper = new Flipper(430, 350, 540, 540);
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
			rFlipper.moveRFlapper(540);
		}
		else if(pos == 2){
			rFlipper.moveRFlapper(556);
		}
		else if(pos == 3){
			rFlipper.moveRFlapper(572);
		}
		else if(pos == 4){
			rFlipper.moveRFlapper(588);
		}
		else if (pos == 5){
			rFlipper.moveRFlapper(604);
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



}