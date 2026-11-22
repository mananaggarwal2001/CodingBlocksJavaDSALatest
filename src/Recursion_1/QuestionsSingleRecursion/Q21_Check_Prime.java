package Recursion_1.QuestionsSingleRecursion;

public class Q21_Check_Prime {
    static void main() {
        int number = 8;
        System.out.println(checkPrime(number, 2, 0));
    }

    private static boolean checkPrime(int number, int range, int count) {
        if (number < 2) {
            return false;
        }
        if (range == number) {
            return count == 0;
        }
        if (number % range == 0) {
            count++;
        }
        return checkPrime(number, range + 1, count);
    }
}
