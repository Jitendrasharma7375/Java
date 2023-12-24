import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
public class Button extends JFrame implements ActionListener{
    private JTextField t1,t2;
    private JButton button;
    Button()
    {
        this.setTitle("Copy");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);
        this.setLayout(new FlowLayout());
        t1=new JTextField(20);
        //t1.setBounds();
        t2=new JTextField(20);
        add(t1);
        add(t2);
        button=new JButton("Copy");
        add(button);
        button.addActionListener(this);     
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String s=t1.getText();
        t2.setText(s);
    }
    
    public static void main(String[] args) {
        Button frame=new Button();
        frame.setVisible(true);
    }
}
