import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePath {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\Jitendra\\Java\\Java IO\\file.txt");
        System.out.println(file.length());
        System.out.println(file.lastModified());
        System.out.println(file.isDirectory());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        Scanner sc=new Scanner(file);
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
