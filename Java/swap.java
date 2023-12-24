import java.util.*;
public class swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a & b:");
        a=sc.nextInt();
        b=sc.nextInt();
       // b=a+b;
       // a=b-a;
       // b=b-a;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("Value after swap: \na="+a+"\nb="+b);

    }
}
