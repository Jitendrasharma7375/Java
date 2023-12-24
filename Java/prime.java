import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i,flag=0;
        System.out.println("Enter the number between :->");
        n=sc.nextInt();
        if(n<2)
        {
            System.out.println("Number is not prime");
            flag=1;
        }
        for(i=2;i<=n/2;i++)
        {
           
            if(n%i==0)
            {
                flag=1;
                System.out.println(n+" Number is not prime");
                break;
            }
        }
        if(flag==0)
            System.out.println(n+" Number is prime");
        
           
    }
    
}
