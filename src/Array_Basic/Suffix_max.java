package Array_Basic;

import java.util.Arrays;

public class Suffix_max {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        SMax(arr);
    }

    private static void SMax(int[] arr) {
        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }
        System.out.println(Arrays.toString(right));
    }
}
