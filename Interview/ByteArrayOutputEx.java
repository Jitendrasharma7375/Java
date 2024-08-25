import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ByteArrayInputStream;
public class ByteArrayOutputEx {
    public static void main(String[] args) throws Exception{
       
        FileOutputStream fos=new FileOutputStream("/Users/jitendrasharma/Java/Interview/file1.txt");
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        baos.write(65);
        baos.writeTo(fos);
        baos.flush();

       
        byte b[]={45};
        
        ByteArrayInputStream bais=new ByteArrayInputStream(b);
        int c=bais.read();
        char ch=(char)c;
        System.out.println("Character read from byte array: "+ch);


    }
}
