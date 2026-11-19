package Recursion_1;

public class Recursion_Introduction_Factorial {
    static void main() {
        // this is the function calling itself.
        // result use karke original problem ke answer ko solve karenge aur answer laayenge
        // Base case ka matlab hota hain ki hume recursion ko kahan rokhna hain.
        int n = 5;
        System.out.println(findFactorial(n));
    }

    public static int findFactorial(int n) {
        if (n == 1) {
            return 1; // this known as the base case of the recursion.
        }
        // answer isme stack girte time ban raha tha.
        return n * findFactorial(n - 1);
    }
}
