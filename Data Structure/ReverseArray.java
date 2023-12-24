import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Size of array:");
       n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("Enter values in array");
       for(int i=0;i<n;i++)
       {
            arr[i]=sc.nextInt();
       }
       System.out.print("Entered Array:");
       for(int i=0;i<n;i++)
       {
            System.out.print(arr[i]+" ");
       }
       System.out.println();
       System.out.print("Reverse Array:");
        for(int i=n-1;i>=0;i--)
       {
            System.out.print(arr[i]+" ");
       }
       sc.close();
    }
}
