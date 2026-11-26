package Recursion_2;

public class N_Coin_Problem {
    static void main() {
        int nCoinsProblem = 3;
        printTossCoins(nCoinsProblem, "");
    }

    private static void printTossCoins(int nCoinsProblem, String ans) {
        if (nCoinsProblem == 0) {
            System.out.println(ans);
            return;
        }
        // two choices whether the choice is Head or Tail.
        printTossCoins(nCoinsProblem - 1, ans + "H");
        printTossCoins(nCoinsProblem - 1, ans + "T");
    }
}