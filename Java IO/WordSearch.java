import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("File.txt");
        Scanner sc=new Scanner(file);
        Scanner sc1=new Scanner(System.in);
        PrintWriter pw=new PrintWriter(file);
        pw.println("Jitendra Sharma 20");
        pw.println("Saurabh chippa 20");
        pw.println("Jitendra Sharma 20");
        System.out.print("Enter word to search:");
        pw.close();
        String word=sc1.nextLine();
        int count=0;
        if(file.exists())
        {
            while(sc.hasNext())
            {
                String name=sc.next();
                if(name.equalsIgnoreCase(word))
                {
                    
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.println("Sorry word not found.");
        }
        else 
        {
            System.out.println("Word found in file");
            System.out.println("Word occure in file "+count+" times");
        }
        sc.close();
        sc1.close();
    
    }
}
