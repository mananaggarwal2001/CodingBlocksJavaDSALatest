package Recursion_1;

public class Fact_Tail {
    static void main() {
        int n = 5;
        System.out.println(factUsingTailRecursion(n, 1));
    }

    private static int factUsingTailRecursion(int n, int ans) {
        if (n == 1) {
            return ans; // this is the ans that we have to return when n becomes 1 for doing the work.
        }
        return factUsingTailRecursion(n - 1, ans * n);
    }

    // this is the head recursion as the work is done when we are coming back from the recursion.
    private static int factUsingHeadRecursion(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factUsingHeadRecursion(n - 1);
    }
}
