import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

class RandomButton
{
        public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Random Button on click");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    
        JButton btn=new JButton("Click me " ); 
        frame.setLayout(null);
        btn.setBounds(120, 95, 90, 30);
        frame.add(btn);
        btn.setFocusable(false);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            { 
                Random random=new Random();
                int maxX=frame.getWidth()-btn.getWidth();
                int maxY=frame.getHeight()-btn.getHeight();;
                int newX=random.nextInt(maxX);
                int newY=random.nextInt(maxY);
                btn.setLocation(newX, newY);
            }
            });
        }
}

       
