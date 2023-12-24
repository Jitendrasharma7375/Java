import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
class MyB extends JFrame implements ActionListener
{
    private JButton button;
    private JLabel label;
    private JTextField text;
    static int totalTicketSold=0;
    final int numberOFTickets=100;
    int ticketsBooked=0;
    Scanner sc=new Scanner(System.in);
    MyB()
    {
        setTitle("Movie Ticket Booking");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER,20,25));
        setBounds(220, 50, 900, 450);
        Font font=new Font("Arial", Font.BOLD,15);
        label=new JLabel("How many tickets you want to book:");
        label.setFont(font);
        label.setBounds(120, 25, 400, 220);
        add(label);
        text=new JTextField(10);
        //text.setLayout(null);
        //text.setSize(120,30);
        //text.setLocation(390,121);
        //text.setBounds(120,25,120,30);
        text.setVisible(true);
        add(text);
        button=new JButton("Book Ticket");
        button.setBounds(390, 160,120,30);
        button.setBackground(Color.MAGENTA);
        button.addActionListener(this);
        add(button);
    }
    void bookTicket( int a)
    {
       // System.out.println("How Many tickets you want to book?");
        ticketsBooked=a;
        if(totalTicketSold==100)
        {
            System.out.println("Total ticket sold.");
            System.exit(0);
        }
        if(ticketsBooked<=100-totalTicketSold)
        {
            totalTicketSold=ticketsBooked+totalTicketSold;
            System.out.println("Your Movie Ticket has been Booked Sucessfully.");
        }
        else
        {
            //System.out.println("Sorry! No tickets are left for sale.");
            System.out.println("You can book only "+(numberOFTickets-totalTicketSold)+" tickets");
        }
    }
    void totalTicketSold()
    {
        System.out.println("Total Tickets Sold:"+totalTicketSold);
    }
    void TicketsLeft()
    {
        
        int ticketLeft=numberOFTickets-totalTicketSold;
        if(ticketLeft<=numberOFTickets-totalTicketSold)
            System.out.println("Tickets Left for Sale:"+ticketLeft);
        else
            System.out.println("Sorry! All The Tickets are sold.");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String s1=text.getText();
        int a=Integer.parseInt(s1);
        if(e.getSource()==button)
        {
            bookTicket(a);
            totalTicketSold();
            TicketsLeft();
            text.setText("");
        }
        }
        catch(Exception a)
        {
            text.setText("Invalid input");
           
        }
        
    }
} 
public class Personal 
{
    public static void main(String[] args) 
    {
        MyB b=new MyB();
        b.setVisible(true);

    }
}
