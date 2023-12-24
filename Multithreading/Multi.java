public class Multi 
{
    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber(10);
        PrintChar pc = new PrintChar('a', 10);

        Thread t1=new Thread(pn);
        Thread t2=new Thread(pc);

        try
        {
            t1.start();
            t2.start();
            //t1.sleep(2000);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
class PrintNumber implements Runnable
{
    int num;
    public PrintNumber(int n)
    {
        num = n;
    }
    @Override
    public void run()
    {
        for(int i=0;i<num;i++)
        {
            System.out.println("Number: " + i);
        }
        System.out.println("Exiting Number Thread");
    }
}
class PrintChar implements Runnable{
    char charToPrint;
    int times;
    public PrintChar(char c,int n)
    {
        charToPrint = c;
        times = n;
    }
    @Override
    public void run()
    {
        for(int i=0;i<times;i++)
        {
            System.out.println("Char: " + charToPrint);
        }
        System.out.println("Exiting Char Thread");
    }
}