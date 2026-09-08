package Sorting;

import java.util.Arrays;

public class Insertion_Sort {
    static void main() {
        int[] arr = {9, 8, 1, 7, 4, 2, 11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            InsertLastElement(arr, i);
        }
    }

    public static void InsertLastElement(int[] arr, int i) {
        int j = i - 1;
        int item = arr[i];
        while (j >= 0 && arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
}