
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DrawHouse extends JPanel{
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        //top border
        g.setColor(Color.YELLOW);
        //g.fillRect(0, 0, 792, 5);
        g.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 30));
        
        //Top triangle
        g.setColor(Color.CYAN);
        int x[]={150,250,350};
        int y[]={160,80,160};
        int n=3;
        //g.setColor(Color.YELLOW);
        g.fillPolygon(x, y, n);

        //bottom left rectangle
        g.setColor(Color.DARK_GRAY);
        g.fillRect(150, 160, 200, 150);
        
        //top right rectangle with lines
        // g.drawLine(250, 80, 550, 80);
        // g.drawLine(550, 80, 650, 160);
        // g.drawLine(250, 160, 650, 160);

        //top right rectangle
        g.setColor(Color.RED);
        int a[]={250,560,650,350};
        int b[]={80,80,160,160};
        n=4;
        g.fillPolygon(a, b, n);

        //Sweet Home
        g.setColor(Color.white);
        g.drawString("Sweet Home ", 350, 130);

        //circle in triangle
        g.fillOval(238, 130, 20, 20);
         
        //Bottom right rectangle
        g.setColor(Color.PINK);
        g.fillRect(350, 160, 300, 150);

        //House door
        g.setColor(Color.CYAN);
        g.drawRect(220, 230, 50, 80);

        //Yellow left door
        int j[]={220,240,240,220};
        int k[]={230,240,310,310};
        n=4;
        g.setColor(Color.YELLOW);
        g.fillPolygon(j, k, n);

        //Yellow right door
        int l[]={250,270,270,250};
        int m[]={240,230,310,310};
        n=4;
        g.setColor(Color.YELLOW);
        g.fillPolygon(l, m, n);

        //Window
        g.setColor(Color.RED);
        g.fillRect(470, 220, 20, 20);
        g.setColor(Color.GREEN);
        g.fillRect(495, 220, 20, 20);
        g.setColor(Color.BLUE);
        g.fillRect(470, 245, 20, 20);
        g.setColor(Color.YELLOW);
        g.fillRect(495, 245, 20, 20);

    }


}
