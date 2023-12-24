import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class MovingRect extends JPanel {
        int x=0;
        int y=100;
        int width=100;
        int height=50;

        int x1=0;
        int y1=300;
        int width1=100;
        int height1=100;

        int stepsize=10;
        int max_x,max_y;
        MovingRect(int w,int h)
        {
            this.max_x=w;
            this.max_y=h;
        }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
    
        g.setColor(Color.WHITE);
        g.fillRect(x,y,width,height);
        g.setColor(Color.YELLOW);
        g.fillOval(x1,y1,width1,height1);

        if(x+width>max_x || x<0)
            stepsize=-stepsize;
        x=x+stepsize;
        x1=x1+stepsize;
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
    
            e.printStackTrace();
        }
        
        repaint();

    }
}
