interface Animal{
    public void eat();
    public void sleep();
}
abstract class Dog implements Animal
{
    public void eat()
    {
        System.out.println("Dog is eating.");
    }
}
class Pet extends Dog{
    
    public void sleep()
    {
        System.out.println("Pet is sleeping");
    }
    public void beFriendly()
    {
        System.out.println("Pets are be friendly in nature.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Pet p=new Pet();
        p.eat();
        p.sleep();
        p.beFriendly();

    }
}