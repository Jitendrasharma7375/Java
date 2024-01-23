import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Body extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Draw head
        g.setColor(Color.BLACK);
        g.fillOval(100, 100, 100, 100);
        
        // Draw body
        g.setColor(Color.BLACK);
        g.drawLine(150, 200, 150, 400);
        
        // Draw hands
        g.setColor(Color.BLACK);
        g.drawLine(150, 250, 50, 300);
        g.drawLine(150, 250, 250, 300);
        
        // Draw feet
        g.setColor(Color.BLACK);
        g.drawLine(150, 400, 100, 500);
        g.drawLine(150, 400, 200, 500);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Man Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        frame.add(new Body());
        frame.setVisible(true);
    }
}
