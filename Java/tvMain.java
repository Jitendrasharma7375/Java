import java.util.*;
public class tvMain
{
    public static void main(String[] args) {
        tvRemote tr=new tvRemote();
        Scanner Sc=new Scanner(System.in);
        int i;
        System.out.println("Press 1 if you want to turn on TV");
        i=Sc.nextInt();
        if(i==1)
        tr.powerOn();
        while(true)
        {
            System.out.println("_____TV REMOTE_____");
            System.out.println("Press");
            System.out.println("1.To set channel randomly\n2.Chanel+\n3.Channel-");
            System.out.println("4.Volume+\n5.Volume-\n6.Mute volume\n7.Turn off");   
            int option;
            option=Sc.nextInt();
            switch(option)
            {
                case 1:
                    tr.setChannel();
                    break;
                case 2:
                    tr.channelIncrease(); 
                    break;
                case 3:
                    tr.channelDecrease();
                    break;
                case 4:
                    tr.volumeUp();
                    break;
                case 5:
                    tr.volumeDown();
                    break;
                case 6:
                    tr.mute();
                    break;
                case 7:
                    tr.powerOff();
                    System.exit(0);
                default:System.out.println("You entered the wrong choice");                                    
            }   
        }
    }
}  
