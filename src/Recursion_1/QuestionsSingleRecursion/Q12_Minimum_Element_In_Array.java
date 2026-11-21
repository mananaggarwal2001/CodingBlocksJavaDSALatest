package Recursion_1.QuestionsSingleRecursion;

public class Q12_Minimum_Element_In_Array {
    static void main() {
        int[] minValueArray = {1, 2, 3};
        System.out.println(findMinValue(minValueArray, Integer.MAX_VALUE, 0));
    }

    private static int findMinValue(int[] minValueArray, int maxValue, int index) {
        if (index == minValueArray.length) {
            return maxValue;
        }
        maxValue = Math.min(maxValue, minValueArray[index]);
        return findMinValue(minValueArray, maxValue, index + 1);
    }
}
