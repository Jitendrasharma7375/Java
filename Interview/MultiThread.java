
public class MultiThread {
    public static void main(String[] args) {

        // Creating Task
        Runnable printA = new PrintChar('A', 1);
        Runnable printB = new PrintChar('B', 10);
        Runnable print10 = new PrintNum(10);
        // Runnable print20=new PrintNum(20);

        // Creating Threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print10);
        // Thread thread20=new Thread(print20);

        try {
            thread1.start();
           
            thread2.start();
            thread3.start();
            // thread20.start();

            //
        } catch (Exception e) {
            System.out.println("Exception in thread");
        }
        
    }
}

class PrintChar implements Runnable {
    char ch;
    int times;

    public PrintChar(char ch, int times) {
        this.ch = ch;
        this.times = times;
    }

    public void run() {
        for (int i = 1; i <= times; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}

class PrintNum implements Runnable {
    int times;

    public PrintNum(int times) {
        this.times = times;
    }

    public void run() {
        for (int i = 1; i <= times; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
