import java.util.*;
public class Remainder
{
    public static void main(String[] args) {
    int i,n,k;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the day after how many days will you meet:->");
    n=sc.nextInt();
  
    System.out.println("Enter the day number between 1 to 7 That you meet:-");
    System.out.println("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
    k=sc.nextInt();
    i=(k+n)%7;
    switch(i)
   {
    
    case 1:
        System.out.println("Day After "+n+" days:->Monday");
        break;
    case 2:
        System.out.println("Day After "+n+" days:->Tuesdsay");
        break;
    case 3:
        System.out.println("Day After "+n+" days:->Wednesday");
        break;
    case 4:
        System.out.println("Day After "+n+" days:->Thursday");
        break;
    case 5:
        System.out.println("Day After "+n+" days:->Friday");
        break;
    case 6:
        System.out.println("Day After "+n+" days:->Saturday");
        break;
    case 7:
        System.out.println("Day After "+n+" days:->Sunday");
        break;
    default:
        System.out.println("Present Day");
    }
    }
}
