import java.awt.Color;

import javax.swing.JFrame;

public class FanMain extends JFrame{
    FanMain()
    {
        this.setTitle("Moving Fan");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fan panel=new Fan(780,560);
        panel.setBackground(Color.BLACK);
        this.add(panel);
    }
    public static void main(String[] args) {
        FanMain frame=new FanMain();
        
        frame.setVisible(true);
    }
    
    
}
