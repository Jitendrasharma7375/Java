class DataType 
{
    public int type=2;
    DataType()
    {
        System.out.println("Inside default constructor of DataType(Parent) Class");
    }
    DataType(int a)
    {
        System.out.println("Inside Parameterized constructor of Data Type class");
    }
    public void type()
    {
        System.out.println("Random Data Type");
    }
}
class Primitive extends DataType
{
    private int PType=4;
    Primitive()
    {
        //super();
        System.out.println("Inside default constructor of Primitive(Child class of DataType) Class");
    }
    void pShow()
    {
        System.out.print("Inside Primitive Class we are able to access Private Data Member:");
        System.out.println(PType);
    }
    @override 
    public void type()
    {
        super.type();
        System.out.println("Primitive Data Type");
    }
}
class NonPrimitive extends DataType
{
    protected int NonPType=2;
    NonPrimitive()
    {
        super(10);
        System.out.println("Inside default constructor of NonPrimitive(Child class of DataType) class");
    }
    @override 
    public void type()
    {
        
        super.type();
        System.out.println("Non Primitive Data Type");
    }

} 
class Linear extends NonPrimitive
{
    private int LType=4;
    Linear()
    {
        //System.out.println("Inside Linear(Child class of Nonprimitive) class");
    }
    void lShow()
    {
        System.out.print("Inside Linear Class we are able to access Private Data Member:");
        System.out.println(LType);
    }
    @override
    public void type()
    {
        super.type();
        System.out.println("Linear Data Type");
    }
}
class NonLinear extends NonPrimitive
{
    int NonLType=4;
    NonLinear()
    {
        //System.out.println("Inside NonLinear(Child class of Nonprimitive) class");
    }
    void nLShow()
    {
        System.out.print("Inside Non Linear Class we are able to access Private Data Member:");
        System.out.println(NonLType);
    }
    @override
    public void type()
    {
       
        
        //super.type();
        System.out.println("Non Linear Data Type");
    }
}

public class lab4 {
    public static void main(String[] args) {
        //DataType DT=new DataType();
        Primitive P=new Primitive();
        NonPrimitive NP=new NonPrimitive();
        //Linear L=new Linear();
        //NonLinear NL=new NonLinear();  
        /*System.out.println("Calling Data Type class Public variable:"+P.type);
        //System.out.println("Calling Primitive class private variable:"+P.PType);
        P.pShow();;
        System.out.print("Calling NonPrimitive class Protected variable ");
        System.out.println("With the help of Linear(child) class object:"+L.NonPType);
        System.out.print("Calling NonPrimitive class Protected variable ");
        System.out.println("With the help of NonLinear(child) class object:"+NL.NonPType);
        //System.out.println("Calling Linear class private variable:"+L.LType);
        L.lShow();
        System.out.print("Calling NonLinear class Private variable:"+NL.NonLType); */
        //NL.nLShow();
       //DT.type();
        P.type();
        NP.type();
        //L.type();
        //NL.type();
        

    }
    
}

