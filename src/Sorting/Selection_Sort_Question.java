package Sorting;

public class Selection_Sort_Question {
    static void main() {
        int[] arr = {4, -1, 5, 3, 2, 1, 7};
        System.out.println(min_form_ith_index(arr, 2));
    }

    private static int min_form_ith_index(int[] arr, int idx) {
        int minvalue = Integer.MAX_VALUE; // this is the maximum value which is contained in the array.
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
