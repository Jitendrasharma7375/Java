abstract class Animal 
{
    Animal()
    {
        System.out.println("Ques:Can a constructor can be abstract?");
        System.out.println("Ans:Since We cannot override a constructor");
    }
    void aggressive()
    {
        System.out.println("Animals can be aggress in nature");
    }
    abstract public void eat();
    abstract public void sleep();
}
abstract class Dog extends Animal
{
    public void eat()
   {
    System.out.println("Dog is eating");
   } 
   public void sleep()
   {
    System.out.println("Dog is Sleeping");
   }
   abstract public void beFriendly();
}
class Pet extends Dog
{
    public void beFriendly()
    {
        System.out.println("Pets are friendly in nature");
    }
}
public class Abstract 
{
    public static void main(String[] args) {
        Pet d=new Pet();
        d.aggressive();
        d.eat();
        d.sleep();
        d.beFriendly();
    }
}