import java.util.*;
public
class SortWithoutSort {
    public static void sort1(int []arr){
        int zero = 0;
        int one  = 0;
        int two= 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zero++;
            }
            else if(arr[i] == 1){
                one++;
            }
            else if(arr[i]== 2){
                two++;
            }
        }

            for(int i = 0; i<zero; i++){
                arr[i]= 0;
            }
            for(int i= zero; i<zero + one; i++){
                arr[i] = 1;
            }
            for(int i= zero + one; i<arr.length;i++){
                arr[i] = 2;
            }
        }
    

    public static void arrange012(int[] arr) { 
        int i = 0, j = 0, k = arr.length - 1;
        while (i <= k) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, k);
                k--;
            }
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public
    static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[]{2,1,0,1,0}; 
        System.out.print("Array before Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sort1(arr);
        //arrange012(arr);
        System.out.print("Array after Sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        scn.close();
    }
}