
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> animals=new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("Dog");

        System.out.println(animals.peek());
        System.out.println(animals);

        animals.pop();
        animals.pop();
        animals.pop();
        animals.pop();
        System.out.println(animals);

    }
}
