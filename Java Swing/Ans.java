import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ans extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label1;
    private JLabel label2;
    public Ans()
    {
        this.setTitle("Answer");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,400,300);

        setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
        label1=new JLabel("What is the Capital of India?");
        this.add(label1);
        label2=new JLabel();
        button=new JButton("CHeck Answer");
        this.add(button);
        this.add(label2);
        button.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label2.setText("\"DELHI\"");
    }
    public static void main(String[] args) {
        Ans a=new Ans();
    }
}
