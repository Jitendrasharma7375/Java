import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyLabel extends JFrame implements ActionListener{
    JLabel l1,l2;
    JTextField t1;
    JButton b1;
    JFrame frame;
    JPasswordField t2;
    JRadioButton r1;
    JTextArea textarea;
   
    MyLabel(){
       frame=new JFrame("My Swing");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(100,100,500,500);

       Container c=frame.getContentPane();
       c.setLayout(null);
       
       l1=new JLabel("Username:");
       l1.setBounds(10,100,120,30);
       c.add(l1);

       t1=new JTextField();
       t1.setBounds(90,100,120,30);
       c.add(t1);

       //Font font=new Font("Arial",Font.ITALIC,15);

       //t1.setText("Username");
       // t1.setFont(font);
       t1.setForeground(Color.RED);

       l2=new JLabel("Password");
       l2.setBounds(10,140,120,30);
       c.add(l2);

       t2=new JPasswordField();
       t2.setBounds(90,140,120,30);
       t2.setEchoChar('*');
       c.add(t2);

       b1=new JButton("Login");
       b1.setBounds(50,180,120,30);
       b1.setForeground(Color.BLUE);
       b1.addActionListener(this);
       
       c.add(b1);

       Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
       b1.setCursor(cursor);

       r1=new JRadioButton("Remember me");
       r1.setBounds(10,220,150,30);
       c.add(r1);

       textarea=new JTextArea();
       textarea.setBounds(10,260,480,200);
       c.add(textarea);

       

       frame.setVisible(true); 
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String username=t1.getText();
        String password=new String(t2.getPassword());
        if(username.equals("admin") && password.equals("admin")){
            JOptionPane.showMessageDialog(frame, "Login Successful");
        }else{
            JOptionPane.showMessageDialog(frame, "Invalid Credentials");
        }
     }
    
    public static void main(String[] args) {
        MyLabel f=new MyLabel();
    //frame.setVisible(true);
    }
}
