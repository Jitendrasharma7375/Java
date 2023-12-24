import java.util.*;
class MovieTicket 
{
    static int totalTicketSold=0;
    final int numberOFTickets=100;
    int ticketsBooked=0;
    Scanner sc=new Scanner(System.in);
    MovieTicket()
    {
        System.out.println("Welcome");
    }
    void bookTicket()
    {
        System.out.println("How Many tickets you want to book?");
        ticketsBooked=sc.nextInt();
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
    static void totalTicketSold()
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

    public static void main(String[] args) {
    MovieTicket m1=new MovieTicket();
    m1.bookTicket();
    totalTicketSold();
    m1.TicketsLeft();
    MovieTicket m2=new MovieTicket();
    m2.bookTicket();
    totalTicketSold();
    m2.TicketsLeft();
    }
}
