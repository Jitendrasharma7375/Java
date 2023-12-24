
import java.awt.Color;
import javax.swing.*;

public class DrawHouseMain extends JFrame {
    DrawHouseMain()
    {
        this.setTitle("Draw Example");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawHouse panel=new DrawHouse();
        panel.setBackground(Color.MAGENTA);
        this.add(panel);
        
    }
    public static void main(String[] args) {
        DrawHouseMain frame=new DrawHouseMain();
        
        frame.setVisible(true);
    }
    
}
