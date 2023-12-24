
import java.awt.*;
import javax.swing.*;

class JFrameDemo
{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(700, 500);
        //frame.setLocation(100,50);
        frame.setBounds(100, 100, 1000, 500);
        frame.setTitle("JFrame Demo");
        ImageIcon icon=new ImageIcon("j.JPEG");
        frame.setIconImage(icon.getImage());
        Container c=frame.getContentPane();
        //Color color=new Color(10,150,34);
        //c.setBackground(color);
        frame.setResizable(false);
    }
}