import java.util.*;
public class fibbonic {
    public static void main(String args[])
    {
    int n,i,t1=0;
    int t2=1;
    int num;
    num=t1+t2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of N:->");
    n=sc.nextInt();
    System.out.print("fibonacci series: "+t1+" "+t2+" ");
    
    for(i=3;i<=n;i++)
    {
        System.out.print(num+" ");
        t1=t2;
        t2=num;
        num=t1+t2;     
    }
    }
    
}
