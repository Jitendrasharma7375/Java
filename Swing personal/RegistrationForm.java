import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener,MouseListener
{
    private JLabel label,label1,label2,label3,label4,label5,label6;
    private JLabel nameLabel,mobileLabel;
    private JTextField t1,t2;
    private JRadioButton r1,r2;
    private JButton submit,clear;
    private JTextArea a1,screen;
    private Container c;
    private JCheckBox terms;
    private JComboBox day,month,year;
    private JLabel message;

    MyFrame()
    {
        displayWelcomeScreen();   
        this.setTitle("Registration Form");
        this.setSize(800,600);
        //this.setLocation(100,30);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icon=new ImageIcon("form.jpg");
        this.c=getContentPane();
        this.setIconImage(icon.getImage());
        this.c.setLayout(null);
        c.setBackground(Color.CYAN);

        label=new JLabel("Registration Form");
        label.setBounds(300,0,200,50);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        this.c.add(label);

        label1=new JLabel("Name:");
        label1.setBounds(40,50,100,20);
        this.c.add(label1);

        t1=new JTextField(20);
        t1.setBounds(120,52,100,20);
        this.c.add(t1);
        t1.addMouseListener(this);

        nameLabel=new JLabel("");
        nameLabel.setBounds(120,32,100,20);
        this.c.add(nameLabel);
        t1.addMouseListener(this);

        label2=new JLabel("Mobile:");
        label2.setBounds(40,90,100,20);
        this.c.add(label2);

        t2=new JTextField(20);
        t2.setBounds(120,90,100,20);
        this.c.add(t2);

        mobileLabel=new JLabel("");
        mobileLabel.setBounds(120,70,100,20);
        this.c.add(mobileLabel);
        t2.addMouseListener(this);

        label3=new JLabel("Gender:");
        label3.setBounds(40,130,100,20);
        this.c.add(label3);

        r1=new JRadioButton("Male");
        r1.setBounds(120, 130, 100, 20);
        r1.setFocusable(false);
        r1.setSelected(true);
        this.c.add(r1);

        r2=new JRadioButton("Female");
        r2.setBounds(230, 130, 100, 20);
        r2.setFocusable(false);
        this.c.add(r2);

        ButtonGroup gender=new ButtonGroup();
        gender.add(r1);
        gender.add(r2);
       
        label4=new JLabel("DOB:");
        label4.setBounds(40,170,100,20);
        this.c.add(label4);

        String days[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18"
        ,"19","20","21","22","23","24","25","26","27","28","29","30","31"};

        String months[]={"Jan","Feb","Mar","Apr","May","June","July","Aug","Sep","Oct","Nov","Dec"};

        String years[]={"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009"
        ,"2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997"};

        day=new JComboBox<>(days);
        day.setBounds(120,170,50,20);
        this.c.add(day);

        month=new JComboBox<>(months);
        month.setBounds(190,170,70,20);
        this.c.add(month);

        year=new JComboBox<>(years);
        year.setBounds(280,170,70,20);
        this.c.add(year);

        label5=new JLabel("Address:");
        label5.setBounds(40,200,100,20);
        this.c.add(label5);

        a1=new JTextArea();
        a1.setBounds(120,200,220,50);
        a1.setLineWrap(true);
        this.c.add(a1);

        label6=new JLabel("Please Fill out all the columns.");
        label6.setBounds(120,300,200,20);
        this.c.add(label6);

        terms=new JCheckBox("Please accept terms and conditions");
        terms.setBounds(120,350,250,20);
        this.c.add(terms);
        terms.addActionListener(this);

        submit=new JButton("Submit");
        submit.setBounds(120,400,100,30);
        this.c.add(submit);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.white);
        submit.setFocusable(false);
        submit.setEnabled(false);
        submit.addActionListener(this);

        clear=new JButton("Clear");
        clear.setBounds(230,400,100,30);
        this.c.add(clear);
        clear.setBackground(Color.DARK_GRAY);
        clear.setForeground(Color.white);
        clear.setFocusable(false);
        
        clear.addActionListener(this);

        screen=new JTextArea();
        screen.setBounds(400,70,350,300);
        screen.setLineWrap(true);
        this.c.add(screen);

        message=new JLabel();
        message.setBounds(120,375,250,20);
        this.c.add(message);

       
    }
    public void displayWelcomeScreen() {
        final JWindow w=new JWindow(this);
        w.setSize(800,600);
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel=new JPanel();
        w.add(panel);
        //String imagePath="C:\\Users\\Jitendra\\Java\\Swing personal\\image.png";
        JLabel label=new JLabel(new ImageIcon("R.png"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        panel.setBackground(Color.white);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));

        JProgressBar progress=new JProgressBar(0,100);
        progress.setForeground(Color.YELLOW);
        w.add(BorderLayout.PAGE_END,progress);
        w.revalidate();
        timer=new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                int x=progress.getValue();
                if(x==100)
                {
                    w.dispose();
                    MyFrame.this.setVisible(true);
                    timer.stop();
                }
                else 
                {
                    progress.setValue(x+4);
                }
            }
        });
        timer.start();
    }
    Timer timer;
    @Override
    public void actionPerformed(ActionEvent e)
    {
    
        if(terms.isSelected())
        {
            submit.setEnabled(true);
        }
        else 
        {
            submit.setEnabled(false);
        }
            if(e.getSource()==submit)
            {
                message.setText("Registration Sucessfull.");
                String name=t1.getText();
                String Mobile=t2.getText();
                String gender="Male";
                if(r2.isSelected())
                {
                    gender="Female";
                }
                String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
                String address=a1.getText();

                screen.setText("Name : "+name+"\nMobile : "+Mobile+"\nGender : "+gender+"\nDOB : "+dob+"\nAddress : "+address);
                t1.setText("");
                t2.setText("");
                a1.setText("");
            }
        if(e.getSource()==clear)
        {
            t1.setText("");
            t2.setText("");
            //r1.setSelected(false);
            message.setText("");
            a1.setText("");
            terms.setSelected(false);
            submit.setEnabled(false);
            screen.setText("");
        }
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==t1)
        {
            nameLabel.setText("Enter name");
        }
        if(e.getSource()==t2)
        {
            mobileLabel.setText("Enter Mobile no.");
            e.getButton();
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==t1)
        {
            nameLabel.setText("");
        }
        if(e.getSource()==t2)
        {
            mobileLabel.setText("");
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
       
    }
}

public class RegistrationForm {
    public static void main(String[] args) {
        MyFrame frame=new MyFrame();
        //frame.setVisible(true);
    } 
}
