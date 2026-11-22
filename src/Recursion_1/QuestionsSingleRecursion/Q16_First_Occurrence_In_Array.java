package Recursion_1.QuestionsSingleRecursion;

public class Q16_First_Occurrence_In_Array {
    static void main() {
        int[] numberElements = {1, 2, 3, 2};
        int key = 2;
        System.out.println(firstOccurrenceInArray(numberElements, key, 0));
    }

    private static int firstOccurrenceInArray(int[] numberElements, int key, int index) {
        if (index == numberElements.length) {
            return -1;
        }
        if (numberElements[index] == key) {
            return index;
        }
        return firstOccurrenceInArray(numberElements, key, index + 1);
    }
}
