// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.AWTException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Demo2 {
   public Demo2() {
   }

   public static void main(String[] var0) {
      try {
         Robot var1 = new Robot();
         GraphicsDevice var2 = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
         Rectangle var3 = var2.getDefaultConfiguration().getBounds();
         BufferedImage var4 = var1.createScreenCapture(var3);
         JLabel var5 = new JLabel(new ImageIcon(var4));
         JFrame var6 = new JFrame();
         var6.setDefaultCloseOperation(3);
         var6.getContentPane().add(var5);
         var6.setUndecorated(true);
         var2.setFullScreenWindow(var6);
      } catch (AWTException var7) {
         System.err.println(var7);
      }

   }
}
