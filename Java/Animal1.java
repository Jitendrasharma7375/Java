class Animal
{
    Animal()
    {
        System.out.println("Animal Class defaUlt constructor called");
    }
    Animal(int a)
    {
        System.out.println("Animal Class Parameterized Constructor Called");
    }
    public void makeSound()
    {
        System.out.println("Random animal makes a sound ");
    }
}
class Dog extends Animal
{
    Dog()
    {
        super(10);
        System.out.println("Dog class Constructor Called");
    }
    public void makeSound()
    {
        //super.makeSound();
        System.out.println("Dog makes a sound");
    }
}
class Cat extends Animal
{
    Cat()
    {
        
        System.out.println("Cat class constructor called");
    }
    public void makeSound()
    {
        //super.makeSound();
        System.out.println("Cat makes a sound");
    }
}
public class Animal1 {
    public static void main(String[] args) {
        Dog d=new Dog();
        Animal D1=d;
        Cat c=new Cat();
        Animal D2=c;
        Animal D3=new Animal();
        D3.makeSound();
        D1.makeSound();
        D2.makeSound();
        
    }
    
}
