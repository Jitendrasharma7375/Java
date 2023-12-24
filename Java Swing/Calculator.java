import javax.swing.*;
import java.awt.event.ActionListener;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
//import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame implements ActionListener {
    private JButton button;
    private JTextField input1;
    private JTextField input2;
    private JTextField input3;
    private FlowLayout flow1;
    private JLabel label;
   
    public Calculator()
    {
        this.setTitle("Calculator");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,250,300);


        input1=new JTextField(10);
        label=new JLabel("+");
        this.add(label);
       // input1.addFocusListener(new FocusListener());
        input2=new JTextField(10);
       // input2.addFocusListener(new FocusListener());
        input3=new JTextField(20);
        flow1=new FlowLayout(FlowLayout.CENTER,0, 5);
        this.setLayout(flow1);
    
        
       
        this.add(input1);
        this.add(label);
        this.add(input2);
        button=new JButton("Calculate", null);
        button.setForeground(Color.red);
        this.add(button);
        this.add(input3);
        button.addActionListener(this);
        input3.setEditable(false);

    }
    // public class FocusListener implements java.awt.event.FocusListener {
    // public void focusGained(FocusEvent f)
    // {
    //     input1.setText(""); 
    //     input2.setText("");  

    // }
    // public void focusLost(FocusEvent f)
    // {
    //     input1.setText(input1.getText());
    // }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
        double num1=Double.parseDouble(input1.getText());
        double num2=Double.parseDouble(input2.getText());
        Double result;
        result=sum(num1,num2);
        input3.setText(Double.toString(result));
        
        }
        catch(Exception k)
        {
            input3.setText("Invalid input");
        }
    }
    public double sum(double num1,double num2)
    {
        double result=num1+num2;
        return result;

    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.setVisible(true);
    }
}
    

