import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        double n,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        n=sc.nextDouble();
        if(n==1 || n<0)
        {
            System.out.println(n+" is undefined");
        }
        else 
        {
            for(int i=2;i<n/2;i++)
            {
                if(n%i==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("Given number is not prime Number");
            }
            else 
            {
                System.out.println("Given number is prime number");
            }
        }
        sc.close();
    }
}