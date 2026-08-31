package Array_Basic;

import java.util.Arrays;

public class Suffix_Sum {
    static void main() {
        int[] arr = {2, 3, 4, 5, 6, 8, 9};
        SSum(arr);
        SSumExcludingCurrentIndex(arr);
    }
    // this suffix sum include the current index
    private static void SSum(int[] arr) {
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = arr[i] + right[i + 1];
        }
        System.out.println(Arrays.toString(right));
    }

    // this function does the suffix sum excluding the current index and then gives the answer.
    private static void SSumExcludingCurrentIndex(int[] arr) {
        int[] right = new int[arr.length];
//        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = arr[i + 1] + right[i + 1];
        }
        System.out.println(Arrays.toString(right));
    }
}
