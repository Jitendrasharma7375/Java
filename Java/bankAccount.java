
public class bankAccount {
    static int an=0;
    String ah=null;
    double balance;
    bankAccount()
    {

    }
    bankAccount(String ah,double balance)
    {   
        an++;    
        this.ah=ah;
        this.balance=balance;
        System.out.println("Account created,Account number="+an+" Account Holder Name="+this.ah+" Account balance="+this.balance);
    }
    void withdraw(int i)
    {
        if(balance>=0 && balance<=500)
        {
            balance=balance-i;
            System.out.println("Current Balance:"+balance);
        }
    }
    void deposit(int i)
    {
        balance=balance+i;
        System.out.println("Current Balance:"+balance);
    }
    void getBalance()
    {
        System.out.println("Balance="+balance);
    }
    
}
