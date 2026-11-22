package Recursion_1.QuestionsSingleRecursion;

public class Q14_Check_Array_Sorted {
    static void main() {
        int[] numberElement = {1, 2, 3, 2};
        System.out.println(checkArraySorted(numberElement, 0));
    }

    private static boolean checkArraySorted(int[] numberElement, int index) {
        if (index + 1 == numberElement.length) {
            return true;
        }
        return numberElement[index] < numberElement[index + 1] && checkArraySorted(numberElement, index + 1);
    }
}
