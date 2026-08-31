package Array_Basic;

import java.util.Arrays;

public class Prefix_Max {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        pMax(arr);
    }

    private static void pMax(int[] arr) {
        int[] prefixMax = new int[arr.length];
        prefixMax[0]= arr[0];
        for (int i = 1; i < prefixMax.length; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], arr[i]); // this is main line in this code for finding the prefix max.
        }
        System.out.println(Arrays.toString(prefixMax));
    }
}
