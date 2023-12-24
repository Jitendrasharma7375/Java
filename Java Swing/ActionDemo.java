import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    private Container c;
    private JButton btn;
    private JButton btn1;
    private JButton btn2;
    MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);

        btn=new JButton("Yellow" , null);
        btn.setBounds(120, 95, 90, 30);
        c.add(btn);
        btn.setFocusable(false);
        btn.addActionListener(this);

        btn1=new JButton("Red" , null);
        btn1.setBounds(200, 95, 90, 30);
        c.add(btn1);
        btn1.setFocusable(false);
        btn1.addActionListener(this);

        btn2=new JButton("Green" , null);
        btn2.setBounds(280, 95, 90, 30);
        c.add(btn2);
        btn2.setFocusable(false);
        btn2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //btn.setLocation(new Point());
       if(e.getSource()==btn)
       { 
            c.setBackground(Color.YELLOW);
       }
       else
       {
            if(e.getSource()==btn1)
            { 
            c.setBackground(Color.RED);
            }
            else
            {
                c.setBackground(Color.GREEN);
            }

        }
    }
}
public class ActionDemo {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        frame.setTitle("Action Demo");
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
