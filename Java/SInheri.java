class parent
{
    private int i;
    parent()
    {
        System.out.println("Parent class");
    }
   
}
class child extends parent
{
    child()
    {
        System.out.println("Child class");
    }
   
}

public class SInheri {
    public static void main(String[] args) {
        parent ch=new child();
    }
}
    
