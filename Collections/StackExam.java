import java.util.*;
public class StackExam {
    public static void main(String[] args) {
        Stack <String> arr=new Stack<>();
        arr.push("Jitendra");
        arr.push("Sharma");
        arr.push("18");
        for(String s:arr)
        {
            System.out.println(s);
        }
        if(arr.contains("Jitendra"))
        {
            System.out.println("Jitendra is present");
        }
        else
        {
            System.out.println("Jitendra is not present");
        }
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.pop());
        System.out.println(arr.peek());
        System.out.println(arr);

    }
}
