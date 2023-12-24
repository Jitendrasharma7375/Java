public class Fibonacci {

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Fibonacci is the sum of the two preceding numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 4; // Change this to calculate Fibonacci for a different n

        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }
}
