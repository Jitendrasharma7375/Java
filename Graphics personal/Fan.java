import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class Fan extends JPanel {
    int x;
    int y;
    int fanWidth=300;
    int fanHeight=300;
    int centerX;
    int centerY;
    int angle=0;

    Fan(int w,int h)
    {
        this.centerX=w/2;
        this.centerY=h/2;
        this.x=centerX-fanWidth/2;
        this.y=centerY-fanHeight/2;
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        g.setColor(Color.white);
        g.fillArc(x,y,fanWidth,fanHeight,angle,30);
        g.fillArc(x,y,fanWidth,fanHeight,angle+120,30);
        g.fillArc(x,y,fanWidth,fanHeight,angle+240,30);
        g.drawRect(centerX-3, centerY, 6, 2*fanHeight);
        angle=(angle-30)%360;

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        repaint();
    }
}
