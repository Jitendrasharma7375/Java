public class Exception1 {
    static int  divide(int a,int b){
        int c;
        if(b==0)
            throw new ArithmeticException("Divide by zero");
        else 
        {
            return c=a/b;
            //System.out.println(c);
        }
    }
    public static void main(String[] args) {
        int a=20;
        int b=0;
        int c=0;
        try
        {
            c=divide(a,b);
        }
        catch(ArithmeticException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
