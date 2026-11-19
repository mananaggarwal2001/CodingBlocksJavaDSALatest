package Recursion_1;

public class Sum_Of_N_Numbers {
    static void main() {
        int n = 5;
        int result = Sum(n);
        System.out.println(result);
    }

    public static int Sum(int n) {
        if (n == 0) {
            return 0; // this is the base case for this question.
        }
        return n + Sum(n - 1); // this is the recursive call.
        // stack girte waqt ye sum calculate hua hain isme.
        // this is the example of head recursion
        // as the work is done when the stack is decreasing.
    }
}
