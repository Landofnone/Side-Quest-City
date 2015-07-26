package us.terracraft.sqc.items;

import java.awt.event.KeyEvent;

import KTech.components.*;
import KTech.core.*;
import KTech.core.*;
import KTech.graphics.Image;

public class IronSword extends GameObject {

	int x, y;
	
	Image image = new Image("/items/iron_sword.png");
	
	public IronSword(int x, int y) {
		setName("IronSword");
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void update(KTech kt, float time) {
		
	}

	@Override
	public void render(KTech kt, Renderer r) {
		r.drawImage(image, x, y);
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void componentEvent(String name, GameObject object) {
		
	}

}
