class OuterClass
{
    public static class InnerClass
    {
        public void print()
        {
            System.out.println("Inner class.");
        }
    }
    public void print()
    {
        System.out.println("Simple Print.");
    }
    public static void Staticprint()
    {
            System.out.println("Static Print.");
    }
}
public class Static {
    static int a = 40;
    int b = 50;
    void simpleDisplay()
    {
        
        System.out.println(a);
        System.out.println(b);
        a=a+a;
    }
    static void staticDisplay()
    { 
      System.out.println(a); 
    }
    public static void main(String[] args) {
        OuterClass Oc=new OuterClass();
        OuterClass.InnerClass i=new OuterClass.InnerClass();
        i.print();
        Oc.print();
        OuterClass.Staticprint();
        Static obj=new Static();
        obj.simpleDisplay();
        staticDisplay();
    }
}
