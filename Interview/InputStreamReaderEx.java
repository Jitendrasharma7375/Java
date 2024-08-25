import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class InputStreamReaderEx {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name=br.readLine();
        System.out.println("Hello "+name);
        System.out.print("Enter your age: ");
        int age=Integer.parseInt(br.readLine());
        System.out.println("Your age is "+age);
    }
}
