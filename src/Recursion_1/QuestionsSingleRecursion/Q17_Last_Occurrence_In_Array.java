package Recursion_1.QuestionsSingleRecursion;

public class Q17_Last_Occurrence_In_Array {
    static void main() {
        int[] inputArray = {1, 2, 3, 2};
        int key = 2;
        System.out.println(findLastOccurence(inputArray, key, inputArray.length - 1));
    }

    private static int findLastOccurence(int[] inputArray, int key, int index) {
        if (index < 0) {
            return -1;
        }
        if (inputArray[index] == key) {
            return index;
        }
        return findLastOccurence(inputArray, key, index - 1);
    }
}
