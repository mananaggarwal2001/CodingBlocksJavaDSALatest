package Recursion_1.QuestionsSingleRecursion;

public class Q34_Print_All_Indexes {
    static void main() {
        int[] numberInteger = {1, 2, 2};
        int key = 2;
        printAllIndexes(numberInteger, key, 0);
    }

    private static void printAllIndexes(int[] numberInteger, int key, int index) {
        if (index == numberInteger.length) {
            return;
        }
        if (numberInteger[index] == key) {
            System.out.print(index + " ");
        }
        printAllIndexes(numberInteger, key, index + 1);
    }
}
