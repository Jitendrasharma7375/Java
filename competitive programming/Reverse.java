import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        int reverse = 0;
        while(num != 0) 
        {
            int digit=num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse of the number is: " + reverse);
        sc.close();
    }
}
