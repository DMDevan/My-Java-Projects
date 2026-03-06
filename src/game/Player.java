// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends GameObject {
   Handler handler;

   public Player(int x, int y, ID id, Handler handler) {
      super(x, y, id);
      this.handler = handler;
   }

   public void tick() {
      this.x += this.velX;
      this.y += this.velY;
      if (this.playerWallCollision()) {
         this.velX = 0;
         this.velY = 0;
      }

      this.collectCoin();
   }

   private void collectCoin() {
      for(int i = 0; i < this.handler.object.size(); ++i) {
         GameObject tempObject = (GameObject)this.handler.object.get(i);
         if (tempObject.getId() == ID.Coin && this.getBounds().intersects(tempObject.getBounds())) {
            this.handler.removeObject(tempObject);
            HUD.COINS += 10;
         }
      }

   }

   public void render(Graphics g) {
      g.setColor(Color.blue);
      g.fillRect(this.x, this.y, 32, 32);
   }

   private boolean playerWallCollision() {
      if (this.y <= 0 && this.x <= 0) {
         this.y = 0;
         this.x = 0;
         return true;
      } else if (this.x >= 604 && this.y >= 417) {
         this.x = 604;
         this.y = 417;
         return true;
      } else if (this.x >= 604 && this.y == 0) {
         this.x = 604;
         this.y = 0;
         return true;
      } else if (this.y >= 417 && this.x <= 0) {
         this.x = 0;
         this.y = 417;
         return true;
      } else if (this.y <= 0) {
         this.y = 0;
         return true;
      } else if (this.y >= 417) {
         this.y = 417;
         return true;
      } else if (this.x >= 604) {
         this.x = 604;
         return true;
      } else if (this.x <= 0) {
         this.x = 0;
         return true;
      } else {
         return false;
      }
   }

   public Rectangle getBounds() {
      return new Rectangle(this.x, this.y, 32, 32);
   }
}
