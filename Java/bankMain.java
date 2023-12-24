import java.util.*;
public class bankMain {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String accountHolderName;
    bank ba=new bank();
    System.out.println("Press 1 is you want to create account");
    int i=sc.nextInt();
     if(i==1)
    {
        System.out.print("Enter Account Holder name:");
        Scanner str=new Scanner(System.in);
        accountHolderName=str.nextLine();
        bank b=new bank(accountHolderName);
        
    }
    else
    {
        System.out.println("You don't have any bank account in our bank.Thank You");
        System.exit(0);
    }
    while(i==1)
    {
    
    /*if(i==1)
    {
        System.out.print("Enter Account Holder name:");
        Scanner str=new Scanner(System.in);
        accountHolderName=str.nextLine();
        bank b=new bank(accountHolderName);
        
    }
    else
    {
        System.out.println("You don't have any bank account in our bank.Thank You");
        System.exit(0);
    }*/
    System.out.println("***** Welcome *****");
    System.out.println("Press \n2.Money Deposit\n3.Money Withdraw.\n4.Get Balance\n5.exit");
    int j=sc.nextInt();
    switch(j)
    {
        case 2:
                ba.deposit();
                break;
        case 3:
                ba.withdraw();
                break;
        case 4:
                ba.getBalance();
                break;
        case 5:
                 System.exit(0);
        default:System.out.println("You choose wrong option");
    }
    
    }
    
}
}