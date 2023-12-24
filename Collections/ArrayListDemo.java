import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> studentName=new ArrayList<>();
        studentName.add("Jitendra Sharma");
        studentName.add("Saurabh ");
        //size n
        // n+n/2+1
       studentName.add(1,"Raja");
        System.out.println(studentName);

        List<Integer> list=new ArrayList<>();
        //int n=11;
        list.add(11); 
        list.add(22); 
        list.add(33);
        list.add(44);
        list.add(55);
        System.out.println(list);
        list.add(3,66);
        System.out.println(list);

        List<Integer> newList=new ArrayList<>();
        newList.addAll(list);
        System.out.println(newList);
        System.out.println(newList.get(1));

        newList.remove(3);
        System.out.println(newList);
        list.remove(Integer.valueOf(66));
        System.out.println(list);

        newList.set(2,200);
        System.out.println(newList);
        System.out.println(newList.contains(500));

        for(int i=0;i<newList.size();i++)
        {
            System.out.println("The Elements are:"+newList.get(i));
        }
        for(Integer element: newList)
        {
            System.out.println("Foreach Elements are:"+element);
        }

        Iterator<Integer> it=newList.iterator();
        while(it.hasNext())
        {
            System.out.println("Iterator:"+it.next());
        }
        
    }
}
