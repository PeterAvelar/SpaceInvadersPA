import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class player {
	
	int xPosition;
	
	public void move() {
		
	}
	
	public BufferedImage getSprite() throws IOException {
		File imageFile = new File("C:\\Users\\pedro\\eclipse-workspace\\SpaceInvadersPA\\res\\Spacecraft.png");
		BufferedImage image = null;
		
		image = ImageIO.read(imageFile);
			
		return image;
		
	}
}
