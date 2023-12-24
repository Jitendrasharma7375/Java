class A
{
    private int rollno;
    private String name;
    public void setRollNo(int rollno)
    {
        this.rollno=rollno;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getRollNo()
    {
        return rollno;
    }
    public String getName()
    {
        return name;
    }
}
public class Exp 
{
    public static void main(String[] args) {
        A a=new A();
        a.setRollNo(10);
        a.setName("Jitendra");
        System.out.println("Roll No : "+a.getRollNo());
        System.out.println("Name : "+a.getName());
    }
}