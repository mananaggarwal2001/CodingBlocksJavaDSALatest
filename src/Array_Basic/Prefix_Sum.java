package Array_Basic;

import java.util.Arrays;

// prefix sum is the concept of the array which is used for finding sum of the previous value and put this in the array.
public class Prefix_Sum {
    static void main() {
        int[] arr = {3, 5, 7, 8, 2};
        pSum(arr);
        pSumExcludingCurrentIndex(arr);
    }

    // this method includes the address in the prefix sum
    private static void pSum(int[] arr) {
        // prefix Array including index.
        int[] left = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(left));
    }

    // this method excludes the address then find the prefix sum.
    private static void pSumExcludingCurrentIndex(int[] arr) {
        // prefix Array including index.
        int[] left = new int[arr.length];
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] + arr[i - 1];
        }
        System.out.println(Arrays.toString(left));
    }

}
