package Recursion_1.QuestionsSingleRecursion;

public class Q35_Check_Strictly_Increasing {
    static void main() {
        int[] numberInteger = {1, 2, 3, 3};
        System.out.println(checkStrictlyIncreasing(numberInteger, 0));
    }

    private static boolean checkStrictlyIncreasing(int[] numberInteger, int index) {
        if (index + 1 == numberInteger.length) {
            return true;
        }
        return numberInteger[index] < numberInteger[index + 1] && checkStrictlyIncreasing(numberInteger, index + 1);
    }
}
