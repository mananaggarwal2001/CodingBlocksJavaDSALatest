package Array_Basic;

public class Reverse_Print {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }
}
