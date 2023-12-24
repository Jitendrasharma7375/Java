 import java.util.*;
 public class bank {
    static int accountNumber=0;
    String accountHolderName;
    double balance;
    Scanner sc=new Scanner(System.in);
    bank()
    {

    }
    bank(String ah)
    {
        accountNumber++;
        accountHolderName=ah;
        balance=0.0;
        System.out.println("Account Created Sucessfully.\nAccount Holder name:"+accountHolderName);
        System.out.println("Account number:"+accountNumber+"\nCurrent Balance:"+balance);

    }
    public void deposit()
    {
        System.out.println("Enter amount that you want to deposit:");
        int i=sc.nextInt();
        balance=balance+i;
        System.out.println("Amount Deposit sucessfully.\nCurrent Balance:"+balance);
    }
    public void withdraw()
    {
        if(balance>1)
        {
        System.out.println("Your Current Balance:"+balance);
        System.out.println("Enter Amount for Withdraw");
        int i=sc.nextInt();
        if(i<balance)
        {
        balance=balance-i;
        System.out.println("New Balance:"+balance);
        }
        else
            System.out.println("You entered wrong amount.\nCurrent Balance:"+balance);
        }
        else
            System.out.println("Your Account balance is "+balance+" Withdrawal is not possible.Please First Deposit Some Money.\nThank You");
    }
    public void getBalance()
    {
        System.out.println("Your Balance is "+balance+" Rupees");
    }
    
}
