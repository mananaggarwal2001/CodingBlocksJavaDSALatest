package Sorting;

public class Majority_Element {
    static void main() {
        // this question is of moore voting algorithm question ?
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int finalValue = Moore_Voting(arr); // this is the final moore voting algorithm for doing the work.
        System.out.println(finalValue);
    }

    public static int Moore_Voting(int[] arr) {
        int element = arr[0];
        int vote = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == element) {
                vote++;
            } else {
                vote--;
                if (vote == 0) {
                    element = arr[i];
                    vote = 1;
                }
            }
        }
        return element;
    }
}