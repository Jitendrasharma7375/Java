import java.io.*;
import java.util.*;
public class ExamNew {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("Jitendra.txt");
        if(file.exists()) 
        {
            System.out.println("Sorry file already exists.");
            System.exit(0);
        }
        PrintWriter pw=new PrintWriter(file);
        Scanner sc=new Scanner(file);
        pw.print("Jitendra Sharma ");
        pw.println(18);
        pw.print("Jitendra Sharma ");
        pw.println(18);
        pw.close();
        while(sc.hasNext()){
            String fname=sc.next();
            String lname=sc.next();
            int age=sc.nextInt();
            System.out.println("Fname:"+fname+" Lname:"+lname+" Age:"+age+" ");
        }
        sc.close();
    }
    
}
