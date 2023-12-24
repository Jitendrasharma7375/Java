import java.util.*;
class fact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int fact,n;
		System.out.println("Enter thr Value of N:->");
		n=sc.nextInt();
		fact=factorial(n);
		System.out.println(fact);
	}
	public static int factorial(int a)
	{
		 
		if(a==0)
			return 1;
		else
			return(a*factorial(a-1));
	}
}
			
		