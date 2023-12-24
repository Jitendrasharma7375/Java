
import java.awt.*;
import javax.swing.*;

public class JRadioButtonDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Radio Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500);
        frame.setVisible(true);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JRadioButton radio1=new JRadioButton("Gender:");
        radio1.setBounds(100, 50, 100, 20);
        radio1.setFocusable(false);
        c.add(radio1);
        radio1.setSelected(true);

        JRadioButton radio2=new JRadioButton("Male");
        radio2.setBounds(200, 50, 100, 20);
        radio2.setFocusable(false);
        c.add(radio2);

        JRadioButton radio3=new JRadioButton("Female");
        radio3.setBounds(300, 50, 100, 20);
        radio3.setFocusable(false);
        c.add(radio3);

        ButtonGroup gender=new ButtonGroup();
        gender.add(radio1);
        gender.add(radio2);
        gender.add(radio3);
    }
    
}
