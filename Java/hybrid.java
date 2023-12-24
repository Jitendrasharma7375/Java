class C1{
    public int a=10;
   
}
class C2 extends C1{
    public int b=20;
   
}
class C3 extends C1{
    public int c=30;
}

class C4 extends C2{
    int d;
    C4()
    {
        d=a+b;
        System.out.println(d);
    }
}
class C5 extends C3{
    int e;
    C5()
    {
        e=a+c;
        System.out.println(e);
    }
}

public class hybrid {
    public static void main(String[] args) {
        C4 obj=new C4();
        C5 obj1=new C5();
    }
    
}
