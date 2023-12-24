import java.util.*;
public class ArrayListExam {
    public static void main(String[] args) {
        LinkedList <String> arr=new LinkedList<>();
        arr.add("Jitendra");
        arr.add("Sharma");
        arr.add("18");
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
        arr.remove("Jitendra");
        Iterator<String> itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(arr);
    }
}
