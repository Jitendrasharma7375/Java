import java.awt.Color;
import javax.swing.*;

public class MainRectMoving extends JFrame {

    MainRectMoving()
    {
        this.setTitle("Moving Rectangle");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MovingRect panel=new MovingRect(780,560);
        panel.setBackground(Color.BLACK);
        this.add(panel);
    }
    public static void main(String[] args) {
        MainRectMoving frame=new MainRectMoving();
        
        frame.setVisible(true);
    }
}