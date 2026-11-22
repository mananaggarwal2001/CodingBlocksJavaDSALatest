package Recursion_1.QuestionsSingleRecursion;

public class Q13_Sum_Of_Array_Elements {
    static void main() {
        int[] numberElement = {1, 2, 3};
        System.out.println(findSumOfElement(numberElement, 0));
    }

    private static int findSumOfElement(int[] numberElement, int index) {
        if (index == numberElement.length) {
            return 0;
        }
        return numberElement[index] + findSumOfElement(numberElement, index + 1);
    }
}
