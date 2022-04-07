import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.JPanel;


public class GamePanel extends JPanel implements Runnable{

	static final int GAME_WIDTH = 500;
	static final int GAME_HEIGHT = 650;//(int)(GAME_WIDTH * (1.3));
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH, GAME_HEIGHT);
		
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	
		
	
	GamePanel(){		
		this.setFocusable(true);
		this.setPreferredSize(SCREEN_SIZE);
		//this.setBackground(Color.blue);
				
		
		
		gameThread = new Thread(this);
		gameThread.start();
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
