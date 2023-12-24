import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class ActionDemo2 {
    public static Container c;
    public static void main(String[] args) {
        JFrame frame=new JFrame("JLabel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100,500, 500);
        c=frame.getContentPane();
        c.setLayout(null);

        JButton button=new JButton("Click ME");
        button.setBounds(120, 95, 90, 30);
        c.add(button);
        button.addActionListener(new ButtonClass());
        frame.setVisible(true);
    }
    
}
class ButtonClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo2.c.setBackground(Color.red);
      
    }
    
}
