import javax.swing.*;
import java.awt.*;
public class FirstSwing {


    public static void main(String[] args) {
        JFrame frame=new JFrame("First Program");

        //frame.setLocation(100,100);
        //frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(100,100,500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("Click Me");
        button.setBounds(200,200,100,40);

        frame.add(button);
       
        Container c=frame.getContentPane();
        c.setBackground(Color.RED);
        c.setForeground(Color.BLUE);
        
    }
}
