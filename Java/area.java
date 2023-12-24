import java.util.*;
public class area {
    public static void main(String[] args) {
        
        float area,radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Radius:->");
        radius=sc.nextFloat();
        area=radius*radius*3.14f;
        System.out.println("Area of Circle:="+area);
    }
    
}