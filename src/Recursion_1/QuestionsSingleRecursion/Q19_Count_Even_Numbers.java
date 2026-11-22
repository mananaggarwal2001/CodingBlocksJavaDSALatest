package Recursion_1.QuestionsSingleRecursion;

public class Q19_Count_Even_Numbers {
    static void main() {
        int[] inputArray = {1, 2, 4};
        System.out.println(countEvenNumbers(inputArray, 0));
    }

    private static int countEvenNumbers(int[] inputArray, int index) {
        if (index == inputArray.length) {
            return 0;
        }
        if (inputArray[index] % 2 == 0) {
            return 1 + countEvenNumbers(inputArray, index + 1);
        }
        return countEvenNumbers(inputArray, index + 1);
    }
}
