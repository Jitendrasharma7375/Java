import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{
    JLabel user,pass,Email,gender,role;
    JTextField userText,EmailText;
    JPasswordField passText;
    JCheckBox checkBox;
    JRadioButton male,female;
    JComboBox roleList;
    JButton register;
    public MyFrame()
    {
        setTitle("Registration Form");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        user=new JLabel("Username:");
        user.setBounds(50,50,100,30);
        add(user);

        userText=new JTextField();
        userText.setBounds(150,50,100,30);
        add(userText);

        pass=new JLabel("Password:");
        pass.setBounds(50,100,100,30);
        add(pass);

        passText=new JPasswordField();
        passText.setBounds(150,100,100,30);
        passText.setEchoChar('*');
        add(passText);

        Email=new JLabel("Email:");
        Email.setBounds(50,150,100,30);
        add(Email);

        EmailText=new JTextField();
        EmailText.setBounds(150,150,100,30);
        add(EmailText);

        checkBox=new JCheckBox("Subscribe to our newsletter");
        checkBox.setBounds(50,200,300,30);
        add(checkBox);

        gender=new JLabel("Gender");
        gender.setBounds(50,250,100,30);
        add(gender);

        male=new JRadioButton("Male");
        male.setBounds(150,250,100,30);
        add(male);

        female=new JRadioButton("Female");
        female.setBounds(250,250,100,30);
        add(female);
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);

        role=new JLabel("Role");
        role.setBounds(50,300,100,30);
        add(role);

        String[] roles={"Admin","User","Guest"};
        roleList=new JComboBox(roles);
        roleList.setBounds(150,300,100,30);
        add(roleList);
        register=new JButton("Register");
        register.setBounds(150,350,100,30);
        add(register);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==register)
        {
            JOptionPane.showMessageDialog(this,"Registered Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        
        }
    }
}

public class AshikaSwing {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        frame.setVisible(true);
    }
}
