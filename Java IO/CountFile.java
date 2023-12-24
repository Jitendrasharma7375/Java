import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CountFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("File.txt");
        int count=0;
        Scanner sc=new Scanner(file);
        while(sc.hasNext())
        {
            String fname=sc.nextLine();
            // String lname=sc.next();
            // int age=sc.nextInt();
            count++;
        }
        System.out.println("Total lines in file:"+count);
        sc.close();
    }
}
