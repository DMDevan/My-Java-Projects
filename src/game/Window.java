// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
package game;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends Canvas {
   private static final long serialVersionUID = -4369730830015653927L;

   public Window(int width, int height, String title, MainGame game) {
      JFrame frame = new JFrame(title);
      frame.setPreferredSize(new Dimension(width, height));
      frame.setMaximumSize(new Dimension(width, height));
      frame.setMinimumSize(new Dimension(width, height));
      frame.setDefaultCloseOperation(3);
      frame.setResizable(false);
      frame.setLocationRelativeTo((Component)null);
      frame.add(game);
      frame.setVisible(true);
      game.start();
   }
}
