import java.util.*;
public class tvRemote {
    int channel=1;
    int volume=1;
    boolean on=false;
    Scanner s=new Scanner(System.in);
    void powerOn()
    {
        on=true;
    }
    void powerOff()
    {
        on=false;
    }

    void setChannel()
    {   int ch;
        System.out.println("Please enter the number Between 1 to 120");
        ch=s.nextInt();
        if(ch>=1 && ch<=120)
        {
           channel=ch;
           System.out.println("Channel Setted to "+ch); 
        }
        else 
             System.out.println("You entered wrong");
    }
    
    void channelIncrease()
    {
        if(channel<120)
        {
            channel++;
            System.out.println("channel increased by one,Channel Current Position "+channel);
        }
        else
            System.out.println("Channel at maximum position");
    }
    void channelDecrease()
    {
        if(on && channel>1)
        {
            channel--;
            System.out.println("channel decreased by one,Channel Current Position "+channel);
        }
        else    
            System.out.println("Channel at minimum position");
    }
    void volumeUp()
    {
        if(on && volume<15)
        {
            volume++;
            System.out.println("volume increased by one,Volume Current Position "+volume);
        }
        else 
            System.out.println("Volume at maximum level");
    }
    void volumeDown()
    {
        if(on && volume>1)
        {
            volume--;
            System.out.println("Volume increased by one,Volume Current Position "+volume);
        }
        else 
            System.out.println("Volume at minimum level");
    }
    void mute()
    {
        volume=0;
        System.out.println("Volume muted");
    }  
}
