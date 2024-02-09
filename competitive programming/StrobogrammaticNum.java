import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StrobogrammaticNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String num = sc.next();
        System.out.println(isStrobogrammatic(num));
        sc.close();
    }
    static boolean isStrobogrammatic(String num)
    {
        Map <Character,Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('6','9');
        map.put('8','8');
        map.put('9','6');
        int i=0,j=num.length()-1;
        while(i<=j)
        {
            //69
            if(!map.containsKey(num.charAt(i))) return false;
            if(map.get(num.charAt(i))!=num.charAt(j)) return false;
            i++;
            j--;
        }
        return true;   
    }
}
