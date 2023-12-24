class C1{
    public int a;
    void assign(int a)
    {
        this.a=a;
    }
 
}
class C2 extends C1{
    public int b=20;
    C2()
    {
        
    }
    void assign()
    {
        int c=a+b;
        System.out.println(c);
    }
   
}
class C3 extends C1{
    public int b=30;
    C3()
    {
        int c=a+b;
        System.out.println(c); 
    }

}
public class hierarchichal {
    public static void main(String[] args) {
       // C3 obj=new C3();
        C2 obj1=new C2();
        obj1.assign(10);
        obj1.assign();
    }
    
}