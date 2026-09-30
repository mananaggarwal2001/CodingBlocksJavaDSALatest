package Binary_Search;

public class Search_In_Rotated_Sorted_Array {
    static void main() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(rotatedSortedArray(arr, target));
    }

    static int rotatedSortedArray(int[] arr, int target) {
        // first identify the mid whether the mid is in the first half or second half.
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            // whether the mid is in the first half or not.
            if (arr[mid] == target) {
                return mid;
            }
            // upper line pe hun mai
            if (arr[mid] >= arr[low]) {
                if (arr[low] <= target && arr[mid] > target) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { // lower line pe hun mai.
                if (arr[mid] > target && arr[high] >= target) {
                    low = mid + 1; // this will change because the low pointer in the first half of the sorted array.
                } else {
                    high = mid - 1;
                }
            }
        }
        // search in the rotated sorted array 2 do this question in the home.
        return -1;
    }
}
