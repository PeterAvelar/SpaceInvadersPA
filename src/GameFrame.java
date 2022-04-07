import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame {
	
	static final int PLAYER_WIDTH  = 25;
	static final int PLAYER_HEIGHT = 25;
	static final Dimension PLAYER_SIZE = new Dimension(PLAYER_WIDTH, PLAYER_HEIGHT);
	
	GamePanel panel;
	player player1 = new player();
	JLabel label = new JLabel();	
	
	GameFrame() throws IOException{
		panel = new GamePanel();
		this.add(panel);
		
		//label.setPreferredSize();
		label.setIcon(new ImageIcon(player1.getSprite()));
		this.add(label);
		
		this.setTitle("Space Invaders");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

}
