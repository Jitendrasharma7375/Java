import javax.swing.*;
import java.awt.*;
public class JTextFieldDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);
        //JTextField t=new JTextField("TEXT");
        JTextField t1=new JTextField();
        t1.setBounds(100,50,120,30);
        c.add(t1);
        t1.setText("TEXT");
        t1.setEditable(false);
        t1.setLocation(200, 100);;
        t1.setForeground(Color.green);
        //t1.setEditable(false);
       // t1.setEditable(true);
        frame.setVisible(true);
    }
    
}

