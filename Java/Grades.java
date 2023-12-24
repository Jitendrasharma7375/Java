import java.lang.*;
public class Grades {
    public static void main(String args[])
    {
        int score=91;
        if(score>=90 && score<=100)
        {
            System.out.println("A");
        }
        else 
        {
            if(score>=80 && score<90)
            {
            System.out.println("B");
            }
            else {
                if(score>=70 && score<80)
                {
                    System.out.println("C");
                }
                else
                {
                    System.out.println("Fail");
                }
            }
        }
    }
    
}
