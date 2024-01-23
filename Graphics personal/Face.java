import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Face extends JPanel {
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Draw face outline
        g.setColor(Color.PINK);
        g.fillOval(100, 100, 200, 200);
        
        // Draw eyes
        g.setColor(Color.BLACK);
        g.fillOval(150, 160, 40, 40);
        g.fillOval(210, 160, 40, 40);
        
        // Draw nose
        g.setColor(Color.ORANGE);
        g.fillOval(180, 200, 40, 40);
        
        // Draw mouth
        g.setColor(Color.RED);
        g.fillArc(150, 220, 100, 80, 180, 180);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Girl Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Face());
        frame.setVisible(true);
    }
}
