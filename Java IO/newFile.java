import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class newFile{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("File.txt");
        if(file.exists())
        {
            System.out.println("Sorry! File alreaady exists.");
            System.exit(0);
        }
        PrintWriter pw=new PrintWriter(file);
        Scanner sc=new Scanner(file);
        pw.print("Jitendra Sharma ");
        pw.println(18);
        pw.print("Saurabh chippa ");
        pw.println(21);
        pw.close();
        while(sc.hasNext())
        {
            String fname=sc.next();
            String lname=sc.next();
            int age=sc.nextInt();
            System.out.println(fname+" "+lname+" "+age+" ");
        }
        sc.close();
    }
}
