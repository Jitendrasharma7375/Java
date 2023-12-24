import java.util.Stack;

public class FunctionCallManagement {

    // Simulating a simple function call
    public static void main(String[] args) {
        System.out.println("Main function: Starting execution.");

        // Function call to calculate factorial
        int result = calculateFactorial(5);

        System.out.println("Main function: Result of factorial(5) is " + result);
        System.out.println("Main function: Execution complete.");
    }

    public static int calculateFactorial(int n) {
        System.out.println("calculateFactorial(" + n + "): Function call.");

        // Creating a stack to simulate the call stack
        Stack<CallFrame> callStack = new Stack<>();

        // Pushing the initial frame onto the stack
        callStack.push(new CallFrame("calculateFactorial", n));

        int result=1;

        while (!callStack.isEmpty()) {
            CallFrame currentFrame = callStack.peek();

            if (currentFrame.n == 0) {
                // Base case: factorial(0) is 1
                result = 1;
                System.out.println("calculateFactorial(0): Base case reached. Returning 1.");
                callStack.pop(); // Pop the current frame
            } else {
                // Recursive case: factorial(n) = n * factorial(n-1)
                System.out.println("calculateFactorial(" + currentFrame.n + "): Recursive call.");
                callStack.push(new CallFrame("calculateFactorial", currentFrame.n - 1));
            }
        }
        System.out.println("calculateFactorial(" + n + "): Returning result.");
        return result;
    }

    // A class representing a frame in the call stack
    private static class CallFrame {
        String functionName;
        int n;

        CallFrame(String functionName, int n) {
            this.functionName = functionName;
            this.n = n;
        }
    }
}
