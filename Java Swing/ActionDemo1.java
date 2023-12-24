import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

class MyFrame extends JFrame //implements ActionListener
{
        private Container c;
        private JButton btn;
        MyFrame()
        {
            c=this.getContentPane();
            c.setLayout(null);

            btn=new JButton("Click me " );
            btn.setBounds(120, 95, 90, 30);
            c.add(btn);
            btn.setFocusable(false);
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //c.setBackground(Color.RED);
                    // int min=1,max=100;
                    // int rand= (int) Math.random()*(max-min);
                    // int rand1=(int) Math.random()*(max-min);
                    Random random=new Random();
                    
                    
                
                 }
            });
        }

       
}

public class ActionDemo1 {
     public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        frame.setTitle("Action Demo1");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
