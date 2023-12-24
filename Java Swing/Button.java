import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener

{
    private JButton button;
    
    public MyFrame()
    {
        setTitle("Button Example");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,1000,500);
        setLayout(null);
        button=new JButton("Click ME");
        button.setBounds(450,200,100,30);
        button.setForeground(Color.red);
        button.setBackground(Color.yellow);
        button.addActionListener(this);
        add(button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       System.out.println("Button Clicked");
    }

}



