import java.io.FileInputStream;
import java.io.IOException;
public class FIleInputEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("/Users/jitendrasharma/Java/Interview/file.txt");
       int i=0;
       while((i=fin.read())!=-1){
        System.out.print((char)i);
       }
        fin.close();
    }
}
