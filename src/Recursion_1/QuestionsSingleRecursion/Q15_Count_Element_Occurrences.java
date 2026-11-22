package Recursion_1.QuestionsSingleRecursion;

public class Q15_Count_Element_Occurrences {
    static void main() {
        int[] numberElements = {1, 2, 2, 3};
        int key = 2;
        System.out.println(countOccurances(numberElements, key, 0, 0));
    }

    private static int countOccurances(int[] numberElements, int key, int index, int count) {
        if (index == numberElements.length) {
            return count;
        }
        if (numberElements[index] == key) {
            count++;
        }
        return countOccurances(numberElements, key, index + 1, count);
    }
}
