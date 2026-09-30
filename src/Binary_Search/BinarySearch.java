package Binary_Search;

public class BinarySearch {
    static void main() {
        int[] arr = {2, 3, 5, 8, 9, 11, 13, 15, 16, 18, 19};
        int item = 15;
        System.out.println(Search(arr, item));
    }

    public static int Search(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
