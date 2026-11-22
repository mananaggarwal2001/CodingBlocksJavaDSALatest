package Recursion_1.QuestionsSingleRecursion;

public class Q36_Print_Array_In_Reverse {
    static void main() {
        int[] numberInteger = {1, 2, 3};
        printArrayInReverse(numberInteger, 0);
    }

    private static void printArrayInReverse(int[] numberInteger, int index) {
        if (index == numberInteger.length) {
            return;
        }
        printArrayInReverse(numberInteger, index + 1);
        System.out.print(numberInteger[index] + " ");
    }
}
