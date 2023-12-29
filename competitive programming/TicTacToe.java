import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value:");
        int value = sc.nextInt(); 
        
        // Calculate row and column indices
        int row = (value - 1) / 3;
        int col = (value - 1) % 3;
        System.out.println("index: " + row+ " " + col);
        sc.close();
    }
}
