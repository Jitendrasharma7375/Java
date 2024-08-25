import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class BufferedOutputEx {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout=new FileOutputStream("/Users/jitendrasharma/Java/Interview/file.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Don't Worry! God is Always there to help you";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();

        BufferedInputStream bin=new BufferedInputStream(new FileInputStream("/Users/jitendrasharma/Java/Interview/file.txt"));
        System.out.println(bin.available());
        int  i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);
        }
        bin.close();
    }
}
