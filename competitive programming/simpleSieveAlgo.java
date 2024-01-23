import java.util.Arrays;
import java.util.Scanner;

public class SimpleSieveAlgo {
    public static void main(String[] args) {
        // higher 10^6, 10^8
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i=0;i*i<=n;i++)
        {
            if(prime[i]==true)
            {
                for(int j=i*i;j<=n;j+=i)
                {
                    prime[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(prime[i]==true)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
