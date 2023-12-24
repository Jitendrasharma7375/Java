import java.util.ArrayList;
import java.util.List;

public class MostFrequent
{
    public static List<Integer> KMostFrequent(int arr[],int k)
    {
        List<Integer> result=new ArrayList<>();
        int count=1;
        int n=arr.length;
        
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                count++;
            }
            else
            {
                if(count>=k)
                {
                   result.add(i-1);
                }
            count=1;
            }
        }
        if(count>=k)
        {
            result.add(n-1);   
        }
        System.out.println(result);
    
        return result;

    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,1,1,2,2,3};
        int k=2;
        List<Integer> result=KMostFrequent(arr,k);
    }
}