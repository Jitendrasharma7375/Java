import java.io.*;
public class FileWriterEx {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("/Users/jitendrasharma/Java/Interview/file2.txt");
        fw.write("Hey God! Please Help");
        fw.close();

        FileReader fr=new FileReader("/Users/jitendrasharma/Java/Interview/file2.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
