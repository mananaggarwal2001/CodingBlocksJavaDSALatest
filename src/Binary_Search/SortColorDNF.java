package Binary_Search;

import java.util.Arrays;

public class SortColorDNF {
    static void main() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // this problem is of the DNF (Dutch national flag algorithm) problem
    // in this if we sort 2 numbers then the third number is sorted automatically then this question is done.
    static void sort(int[] arr) {
        int ithPointer = 0;
        int zero = 0;
        int two = arr.length - 1;
        while (ithPointer <= two) {
            if (arr[ithPointer] == 0) {
                int temp = arr[ithPointer];
                arr[ithPointer] = arr[zero];
                arr[zero] = temp;
                zero++;
                ithPointer++;
            } else if (arr[ithPointer] == 2) {
                int temp = arr[ithPointer];
                arr[ithPointer] = arr[two];
                arr[two] = temp;
                two--;
            } else {
                ithPointer++;
            }
        }
    }
}
