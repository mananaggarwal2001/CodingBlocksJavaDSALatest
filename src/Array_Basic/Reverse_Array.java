package Array_Basic;

import java.util.Arrays;

public class Reverse_Array {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    // this program is for reversing the array and giving the array in the reverse manner.
    // this is known as the 2 pointer approach.
    private static void Reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
