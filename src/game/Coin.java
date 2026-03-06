package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Coin extends GameObject {
   public Coin(int x, int y, ID id) {
      super(x, y, id);
   }

   public void tick() {
   }

   public void render(Graphics g) {
      g.setColor(Color.yellow);
      g.fillRect(this.x, this.y, 10, 10);
   }

   public Rectangle getBounds() {
      return new Rectangle(this.x, this.y, 10, 10);
   }
}
