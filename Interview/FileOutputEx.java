import java.io.FileOutputStream;
public class FileOutputEx {
    public static void main(String[] args) {
       try {
        FileOutputStream fout=new FileOutputStream("/Users/jitendrasharma/Java/Interview/file.txt");
        String s="Best of luck for the Interview";
        byte b[]=s.getBytes();
        
        fout.write(b);
        fout.close();

       } catch (Exception e) {
        System.out.println(e);
       }

    }
}
