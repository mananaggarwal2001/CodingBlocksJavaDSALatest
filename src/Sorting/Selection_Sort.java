package Sorting;

import java.util.Arrays;

public class Selection_Sort {
    static void main() {
        int[] arr = {4, -1, 5, 3, 2, 1, 7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // this is the whole code for the selection sorting algorithm.
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int position = min_form_ith_index(arr, i);
            // now after finding the min element position then swap it with the current ith index.
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
            // selection sort is the algorithm where the number of swapping is less than the bubble sort algorithm.
        }
    }

    private static int min_form_ith_index(int[] arr, int idx) {
        int minvalue = Integer.MAX_VALUE;
        int position = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] < minvalue) {
                position = i;
                minvalue = arr[i];
            }
        }
        return position;
    }
}
