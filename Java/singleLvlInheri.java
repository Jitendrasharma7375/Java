class C1{
    protected int a=10;
    public int b=20;
}
class C2 extends C1{
    public int c;
    C2()
    {
        c=a+b;
        System.out.println(c);  
    }

}
public class singleLvlInheri {
    public static void main(String[] args) {
        C2 obj=new C2();
    }
    
}