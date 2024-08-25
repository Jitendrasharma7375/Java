import java.io.*;
public class BufferedReaderEx {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("/Users/jitendrasharma/Java/Interview/file1.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("God! Where are you?");
        bw.close();

        FileReader fr=new FileReader("/Users/jitendrasharma/Java/Interview/file1.txt");
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        System.out.println(s);
    }
}
