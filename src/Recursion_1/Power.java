package Recursion_1;

public class Power {
    static void main() {
        int a = 3;
        int b = 4;
        System.out.println(pow(a, b));
    }

    public static int pow(int a, int n) {
        if (n == 0) {
            return 1; // this is the base case for doing the power work.
        }
        return a * pow(a, n - 1); // this is the recursive call for doing the things and getting the things done.
    }
}
