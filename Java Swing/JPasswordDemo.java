import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;

class JPasswordDemo //implements ActionListener
{
    public static void main(String[] args) {
        JFrame frame=new JFrame("JLabel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100,500, 500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JLabel label=new JLabel("Username:");
        label.setBounds(50, 10, 120, 30);
        c.add(label);

        JTextField text=new JTextField();
        text.setBounds(120, 11, 120, 30);
        c.add(text);

        JLabel label1=new JLabel("Password:");
        label1.setBounds(50, 50, 120, 30);
        c.add(label1);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(120,50,120,30);
        c.add(pass);    
        //pass.setText("12345");
        pass.setFont(new Font("Arial",Font.PLAIN,10));
        pass.setEchoChar('*');
        //pass.setEchoChar('0');

        JButton button=new JButton("Submit");
        button.setBounds(120, 95, 90, 30);
        c.add(button);
        //button.addActionListener(null);

        frame.setVisible(true);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     System.out.println("Hello");
    // }
  
}