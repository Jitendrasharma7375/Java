import java.awt.*;
import javax.swing.*;

public class MyAnimationEx extends JPanel{
    int x=0;
    int y=100;
    int width=100;
    int height=50;
    int stepSize=10;
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.WHITE);
        g.drawRect(x,y,width,height);

        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
         
            e.printStackTrace();
        }
        if(x>400 || x<0) stepSize=-stepSize;
       
         x+=stepSize;
        repaint();
    }
    
}
