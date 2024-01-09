//Joey Tribbiani wanted to buy a meatball Sandwich and went to the nearby sandwich shop. There was a poster that said if anyone cones up with a program for Trendy Number they can get free Sandwiches for a lifetime as a gift. Can you help Joey to write a program to check whether the given number is a trendy number or not? A number is said to be a trendy number if it has 3 digits and the middle digit is divisible by 3.
//Input Format: The input is an integer 'n which denotes the given number

//Output Format: The output is a string which says "Trendy Number" if the given number is a trendy number else it says "Not a Trendy Number" 

//If the given number is not a 3 digit number, then print "Invalid Number"

//input: 791
//output: Trendy Number

import java.util.*;
public class TrendyNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        num = sc.nextInt();
        if (num >= 100 && num <= 999) {
            int middleDigit = (num / 10) % 10;
            if (middleDigit % 3 == 0) {
                System.out.println("Trendy Number");
            } else {
                System.out.println("Not a Trendy Number");
            }
        } else {
            System.out.println("Invalid Number");
        }
        sc.close();
    }
}