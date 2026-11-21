package Recursion_1.QuestionsSingleRecursion;

public class Q11_Maximum_Element_In_Array {
    static void main() {
        int[] numberArray = {1, 5, 3};
        System.out.println(findMaximumElement(numberArray, Integer.MIN_VALUE, 0));
    }

    private static int findMaximumElement(int[] numberArray, int minValue, int index) {
        if (index == numberArray.length) {
            return minValue;
        }
        minValue = Math.max(minValue, numberArray[index]);
        return findMaximumElement(numberArray, minValue, index + 1);
    }
}
