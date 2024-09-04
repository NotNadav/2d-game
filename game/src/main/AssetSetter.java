package main;

import objects.OBJ_Door;
import objects.OBJ_Key;

public class AssetSetter {
	
	GamePanel gp;
	
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObj() {
		gp.obj[0] = new OBJ_Key();
		gp.obj[0].worldX = 8 * gp.tilesize;
		gp.obj[0].worldY = 16* gp.tilesize;
		
		gp.obj[1] = new OBJ_Door();
		gp.obj[1].worldX = 10 * gp.tilesize;
		gp.obj[1].worldY = 11 * gp.tilesize;
		gp.obj[1].collision = true;
		
	}

}
