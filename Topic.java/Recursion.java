public class Recursion {
    public static void main(String[] args) {
        
        // Factorial of a number using recursion
       
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
        
    }
}
