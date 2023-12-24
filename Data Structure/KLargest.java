public class KLargest {

    public static int findKthLargest(int[] arr, int k)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,2,3,1,2,4,5,5,6};
        int k=4;
        int result=findKthLargest(arr,k);
        System.out.println("The "+k+"th largest element:"+result);
    }
    
}
