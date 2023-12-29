//This class demonstrates the usage of arithmetic operators and input/output operations.
 
import java.util.Scanner;
public class Operators {
    /**
     * The main method is the entry point of the program.
     * It calculates the average of two pairs of coordinates and prints the result.
     */
    public static void main(String args[]) {
        // Declare variables
        float x1, x2, y1, y2;
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the value of x1 and x2:");
        x1 = sc.nextFloat();
        x2 = sc.nextFloat();
        System.out.print("Enter the value of y1 and y2:");
        y1 = sc.nextFloat();
        y2 = sc.nextFloat();
        
        // Calculate average coordinates
        float avgX = (x1 + y1) / 2;
        float avgY = (x2 + y2) / 2;
        
        // Print the result
        System.out.printf("Arun's house is located at (%.1f,%.1f)", avgX, avgY);
        System.out.println();
        System.out.printf("value is %f", 32.33434);
        System.out.println();
        System.out.println(
                "Arun's house is located at (" + String.format("%.1f", avgX) + "," + String.format("%.1f", avgY) + ")");
        
        // Close the scanner
        sc.close();
    }
}
