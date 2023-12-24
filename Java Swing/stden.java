public class stden {
    String stName=null;
    int rollno;
    static String cgNAme="VIT";
    stden()
    {

    }
    stden(int rollno,String name)
    {
        this.rollno=rollno;
        this.stName=name;
    }
    public void Show()
    {
        System.out.println("Name:"+stName+"\nRoll no:"+rollno);
    }
    public static void collegeName()
    {
        System.out.println(cgNAme);
    }
    public static void main(String[] args) {
        stden obj1=new stden(1,"Mohit");
        stden obj2=new stden(2, "Jitendra"); 
        obj1.Show();
        stden.collegeName();
        obj2.Show();
        stden.collegeName();
    }
}
