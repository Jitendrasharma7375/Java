import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    private Container c;
    private JLabel label1,label2,label3;
    private JTextField t1,t2,t3;
    private JButton Add,Sub,Mul,Div,Erase;
    MyFrame()
    {
        this.setTitle("Simple Calculator");
        this.setSize(500,300);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.c=getContentPane();
        this.c.setLayout(null);

        label1=new JLabel("First Number:");
        label1.setBounds(10,20,100,20);
        this.c.add(label1);

        t1=new JTextField(20);
        t1.setBounds(120,22,100,20);
        this.c.add(t1);

        label2=new JLabel("Second Number:");
        label2.setBounds(10,50,100,20);
        this.c.add(label2);

        t2=new JTextField(20);
        t2.setBounds(120,52,100,20);
        this.c.add(t2);

        Add=new JButton("+"); 
        Add.setBounds(10,80,70,25);
        Add.setFocusable(false);
        Add.setBackground(Color.YELLOW);
        this.c.add(Add);
        Add.addActionListener(this);

        Sub=new JButton("-"); 
        Sub.setBounds(90,80,70,25);
        Sub.setFocusable(false);
        Sub.setBackground(Color.YELLOW);
        this.c.add(Sub);
        Sub.addActionListener(this);

        Mul=new JButton("X"); 
        Mul.setBounds(170,80,70,25);
        Mul.setFocusable(false);
        Mul.setBackground(Color.YELLOW);
        this.c.add(Mul);
        Mul.addActionListener(this);

        Div=new JButton("/"); 
        Div.setBounds(260,80,70,25);
        Div.setFocusable(false);
        Div.setBackground(Color.YELLOW);
        this.c.add(Div);
        Div.addActionListener(this);

        Erase=new JButton("Erase"); 
        Erase.setBounds(350,80,70,25);
        Erase.setFocusable(false);
        Erase.setBackground(Color.YELLOW);
        this.c.add(Erase);
        Erase.addActionListener(this);

        label3=new JLabel("Result :");
        label3.setBounds(10,110,100,20);
        this.c.add(label3);

        t3=new JTextField(30);
        t3.setBounds(70,110,100,20);
        t3.setEditable(false);
        this.c.add(t3);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            double num1=Double.parseDouble(t1.getText());
            double num2=Double.parseDouble(t2.getText());
            Double result;
            if(e.getSource()==Erase)
            {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
            if(e.getSource()==Add)
            {
                result=addition(num1,num2);
                t3.setText(Double.toString(result));
                //t3.setText("Result : "+result);
            }
             if(e.getSource()==Sub)
            {
                result=subtraction(num1,num2);
                t3.setText(Double.toString(result));
            }
             if(e.getSource()==Mul)
            {
                result=multiply(num1,num2);
                t3.setText(Double.toString(result));
            }
             if(e.getSource()==Div)
            {
                result=divide(num1,num2);
                t3.setText(Double.toString(result));
            }

        }
        catch(NumberFormatException k)
        { 
            t3.setText("Invalid input");  
        }
        // catch(ArithmeticException k)
        // {
        //      t3.setText("Invalid input"); 
        // }
    }
    public double addition(double num1,double num2)
    {
        double result=num1+num2;
        return result;
    }
    public double subtraction(double num1,double num2)
    {
        double result=num1-num2;
        return result;
    }
    public double multiply(double num1,double num2)
    {
        double result=num1*num2;
        return result;
    }
    public double divide(double num1,double num2)
    {
        double result=num1/num2;
        return result;
    }
    
}
public class SimpleCalc {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        frame.setVisible(true);
    }
}