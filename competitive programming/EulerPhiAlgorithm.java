public class EulerPhiAlgorithm{
    public static void main(String[] args) {
        System.out.println(eulerPhi(10));
    }
    static int eulerPhi(int n)
    {
        int result = n;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                while(n%i==0)
                {
                    n/=i;
                }
                result-=result/i;
            }
        }
        if(n>1) result-=result/n;
        return result;
    }
}