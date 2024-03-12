public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int max = arr[n-1];
        System.out.println(max);

        //Optimized Approach
        for(int i=n-2; i>=0; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }
        System.out.println();

        //Brute Force Approach
        
        max = arr[n-1];
        System.out.println(max);

        for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               if(arr[i] < arr[j]){
                   break;
               }
               if(j == n-1){
                   System.out.println(arr[i]);
               }
           }
        }
    }
    
}
