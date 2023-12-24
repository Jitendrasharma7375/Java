import java.util.*;
public class CountingSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Counting Sort");
        System.out.print("Enter size of array:");
        int n=sc.nextInt();

        System.out.println("Enter Values in array");
        int inputArray[]=new int[n];
        for(int i=0;i<n;i++)
        {
            inputArray[i]=sc.nextInt();
        }

        int max=inputArray[0];
        for(int i=0;i<inputArray.length;i++)
        {
            if(max<inputArray[i])
            {
                max=inputArray[i];
            }
        }

        System.out.print("Array before sorting: ");
        for(int i=0;i<inputArray.length;i++)
        {
            System.out.print(inputArray[i]+" ");
        }
        System.out.println();

        int countingArray[]=new int[max+1];
        for(Integer i: countingArray)
        {
            countingArray[i]=0;
        }

        int outputArray[]=new int[inputArray.length];
        for(int i=0;i<inputArray.length;i++)
        {
            
            countingArray[inputArray[i]]=countingArray[inputArray[i]]+1;
        }
       
        for(int i=1;i<=max;i++)
        {
            countingArray[i]=countingArray[i]+countingArray[i-1];
        }
      
        for(int i=inputArray.length-1;i>=0;i--)
        {
            outputArray[countingArray[inputArray[i]]-1]=inputArray[i];
            countingArray[inputArray[i]]=countingArray[inputArray[i]]-1;
        }

        System.out.print("Array after sorting:  ");
        for(int i=0;i<outputArray.length;i++)
        {
            System.out.print(outputArray[i]+" ");
        }
    }
    
}
