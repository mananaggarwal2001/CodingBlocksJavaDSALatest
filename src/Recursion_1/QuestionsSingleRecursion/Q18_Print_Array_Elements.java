package Recursion_1.QuestionsSingleRecursion;

public class Q18_Print_Array_Elements {
    static void main() {
        int[] printElements = {1, 2, 3};
        printElementsArray(printElements, 0);
    }

    private static void printElementsArray(int[] printElements, int index) {
        if (index == printElements.length) {
            return;
        }
        System.out.print(printElements[index] + " ");
        printElementsArray(printElements, index + 1);
    }
}
