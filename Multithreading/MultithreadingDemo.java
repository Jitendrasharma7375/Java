

public class MultithreadingDemo {
    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 1000);
        Runnable printB = new PrintChar('b', 10);
        Runnable print100 = new PrintNum(10);
        
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);
        
        try
        {
            thread1.start();
            thread2.start();
            thread3.start();
            thread1.sleep(2000);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
}
class PrintChar implements Runnable
{
    private char charToPrint;
    private int times;
    public PrintChar(char c, int t)
    {
        charToPrint = c;
        times = t;
    }
    public void run()
    {
        for(int i = 0; i < times; i++)
        {
            System.out.print(charToPrint);
        }
        System.out.println();
    }
}
class PrintNum implements Runnable
{
    private int lastNum;
    public PrintNum(int n)
    {
        lastNum = n;
    }
    public void run()
    {
        for(int i = 1; i <= lastNum; i++)
        {
            System.out.print(" " + i);
        }
        System.out.println();
    }
}


