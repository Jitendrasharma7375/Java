import java.util.*;
public class SegmentedSeive {
    public static void main(String[] args) {
        int lower,higher;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower and higher range: ");
        lower = sc.nextInt();
        higher = sc.nextInt();
        int length=higher-lower+1;
        boolean prime[] = new boolean[length];
        Arrays.fill(prime, true);
        for(int i=2;i*i<=higher;i++)
        {
            for(int j=lower;j<=higher;j++)
            {
                if(j==i)
                    continue;
                if(j%i==0)
                    prime[j-lower]=false;
            }
        }
        for(int i=lower;i<=higher;i++)
        {
            if(prime[i-lower]==true)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
