import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
    private JButton add,sub;
    private JTextField t1,t2,t3;
    private Container c;
   
    MyFrame(){
        this.setTitle("Calculator");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        
        c=getContentPane();
        c.setLayout(null);

        t1=new JTextField();
        t1.setBounds(10,10,100,30);
        c.add(t1);

        t2=new JTextField();
        t2.setBounds(130,10,100,30);
        c.add(t2);

        add=new JButton("Add");
        add.setBounds(10,90,100,30);  //set button's position and size.
        add.addActionListener(this);
        c.add(add);

        sub=new JButton("Sub");
       sub.setBounds(130,90,100,30);  
        sub.addActionListener(this);
        c.add(sub);

       
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
       
    }

}

public class Calculator {
    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}
