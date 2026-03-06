package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class HUD {
	
	Handler handler;
	Random rand;
	
	public static int COINS = 0;
	
//-------------------------------------------------------------------------------
	public void tick() {
		
	}
//-------------------------------------------------------------------------------
	public void render(Graphics g, Handler handler, Random rand) {
		this.handler = handler;
		this.rand = rand;
		g.setColor(Color.white);
		g.fillRect(10, 10, 300, 34);
		g.setColor(Color.YELLOW);
		g.fillRect(10, 10, COINS, 34);
		g.setColor(Color.CYAN);
		g.drawRect(10, 10, 300, 34);
		
		
		if(HUD.COINS == 300) {
			Color one[] = { 
					Color.YELLOW,
					Color.MAGENTA,
					Color.GREEN,
					Color.PINK,
					Color.RED,
					Color.WHITE,
					Color.ORANGE
			};
			
			g.setColor(one[rand.nextInt(7)]);
			Font stringFont = new Font( "SansSerif", Font.PLAIN, 24 ); 
			g.setFont(stringFont);
			g.drawString("You Have Collected All of the Coins!!!!", MainGame.WIDTH/2 - 200, MainGame.HEIGHT/2 - 32);
		}
	}

}
