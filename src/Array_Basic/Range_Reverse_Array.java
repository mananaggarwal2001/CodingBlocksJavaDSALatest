package Array_Basic;

import java.util.Arrays;

// In this I have to reverse the array in the given range.
public class Range_Reverse_Array {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        Reverse(arr, 2, 6);
        System.out.println(Arrays.toString(arr));
    }

    private static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
