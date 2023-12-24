import java.io.*;
import java.util.*;
public class AshikaFile
{
    public static void main(String[] args) {
        File file=new File("Ashika.txt");
        if(file.exists())
        {
            System.out.println("File Exists");
            System.exit(0);
        }
        try 
        {
            // file.createNewFile();
            // System.out.println("File Created");
            // file.delete();
            // System.out.println("File Deleted");
            PrintWriter pw=new PrintWriter(file);
            pw.print("Ashika Verma ");
            pw.println(18);
            pw.print("Kunal verma ");
            pw.println(20);
            pw.print("Stuti rani ");
            pw.println(16);
            pw.close();
            Scanner sc=new Scanner(file);
            while(sc.hasNext())
            {
                String fname=sc.next();
                String lname=sc.next();
                int age=sc.nextInt();
                System.out.println(fname+" "+lname+" "+age);
            }
            sc.close();
        }
        catch (Exception e) 
        {
            System.out.println("File Not Found");
        }
        
    }
} 