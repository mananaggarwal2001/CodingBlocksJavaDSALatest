package Sorting;

public class Insert_Last_Element {
    static void main() {
        int[] arr = {1, 2, 4, 8, 9, 11, 7};
        InsertLastElement(arr, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void InsertLastElement(int[] arr, int i) {
        int j = i - 1;
        int item = arr[i];
        while (arr[j] > item) {
            arr[j + 1] = arr[j];
            arr[j] = item;
            j--;
        }
    }
}
