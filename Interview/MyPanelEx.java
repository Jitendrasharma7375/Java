import javax.swing.*;
import java.awt.*;

public class MyPanelEx extends JPanel {
    public void paint(Graphics g){
        super.paint(g);

        g.setColor(Color.WHITE);
        g.drawString("Hello World",50,50);

        g.drawRect(100,100,100,100);


        g.setColor(Color.GREEN);
        g.fillRect(150,150,100,100);

        g.drawLine(100,150,100,100);
    }
}
