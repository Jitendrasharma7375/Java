import java.awt.*;
import javax.swing.*;
public class JLabelDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("JLabel Demo");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100,500, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);
        JLabel label=new JLabel("Username");
        //label.setBounds(50, 100, 200, 30);
        //label.setText("Password");
        //Font font=new Font("Arial",Font.ITALIC, 30);
        //label.setFont(font);
        //c.add(label);
        //ImageIcon icon=new ImageIcon("j.JPEG", null);
        //JLabel label=new JLabel(icon);
        //label.setBounds(10,10,icon.getIconWidth(),icon.getIconHeight());
        //ImageIcon icon=new ImageIcon("R.PNG");
        //JLabel label=new JLabel("Text",icon,JLabel.CENTER);
        label.setBounds(100, 100, 500, 500);
        c.add(label);
    }
    
}
