package Recursion_2;

public class Nth_Fibonacci_Number {
    static void main() {
        int n = 5;
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = fib(n - 1); // this is the first method call.
        int f2 = fib(n - 2); // this is the second method call.
        return f1 + f2;
    }
}
