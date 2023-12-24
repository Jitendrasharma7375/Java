import javax.swing.*;

import java.awt.FlowLayout;
//import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
public class MouseHover
{
    //public static Container c;
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        //c=frame.getContentPane();
        frame.setTitle("Mouse Hover");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setLayout(null);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 250));

        //JPanel panel=new JPanel();
        //frame.add(panel);

        JButton button=new JButton("Click me", null);
        button.setBounds(100,100,120,30);
        button.setFocusable(false);
        //panel.add(button);
        frame.add(button);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                Random random=new Random();
                int maxX=frame.getWidth()-button.getWidth()-50;
                int maxY=frame.getHeight()-button.getHeight()-50;
                int newX=random.nextInt(maxX);
                int newY=random.nextInt(maxY);
                button.setLocation(newX,newY);
            }
            // @Override
            // public void mouseExited(MouseEvent e)
            // {
            //     Random random=new Random();
            //     int maxX=frame.getWidth()-button.getWidth();
            //     int maxY=frame.getHeight()-button.getHeight();;
            //     int newX=random.nextInt(maxX);
            //     int newY=random.nextInt(maxY);
            //     button.setLocation(newX,newY);
            //     //button.setLocation(button.getX()-10,button.getY());
            // }
        });
        frame.setVisible(true);
    }
}