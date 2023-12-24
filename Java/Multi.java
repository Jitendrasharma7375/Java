class C1{
    public int a=10;
   
}
class C2 extends C1{
    public int b=20;
   
}
class C3 extends C2{
    public int c;
    C3()
    {
        c=a+b;
        System.out.println(c); 
    }

}
public class Multi {
    public static void main(String[] args) {
        C3 obj=new C3();
    }
    
}