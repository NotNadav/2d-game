package objects;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import main.GamePanel;

public class SuperObject {
	
	public BufferedImage image;
	public String name;
	public boolean collision = false;
	public int worldX, worldY;
	
	public void draw(Graphics2D g2, GamePanel gp) {
		
		int screenX = worldX - gp.player.worldX + gp.player.screenX;
		int screenY = worldY - gp.player.worldY + gp.player.screenY;
		
		
		if (worldX + gp.tilesize > gp.player.worldX - gp.player.screenX &&
			worldX - gp.tilesize < gp.player.worldX + gp.player.screenX &&
			worldY + gp.tilesize > gp.player.worldY - gp.player.screenY &&
			worldY - gp.tilesize < gp.player.worldY + gp.player.screenY) {
		
			g2.drawImage(image, screenX, screenY, gp.tilesize, gp.tilesize, null);
		}
		
	}
	

}
