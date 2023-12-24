import java.io.File;
import java.util.Scanner;

public class FileSearch
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file Path:");
        String path=sc.nextLine();
    
        File directory=new File(path);
        if(directory.isDirectory())
        {
            System.out.print("Enter file extenstion:");
            String extenstion=sc.nextLine(); 
            listFiles(directory,extenstion);
        }
        else 
        {
            System.out.println("Sorry! No such directory exists.");
        }
        sc.close();
    }
    public static void listFiles(File folder,String extension)
    {
        String[] fileList=folder.list();
        int flag=0;
        
        for(int i=0;i<fileList.length;i++)
        {
           
            if(fileList[i].endsWith(extension))
            {
                System.out.println("name:"+fileList[i]);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Sorry no file exists with "+extension+" extenstion");
        }
    }
}