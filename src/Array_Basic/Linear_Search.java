package Array_Basic;

public class Linear_Search {
    static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        int item = 5;
        boolean target = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                target = true;
                break;
            }
        }
        if (target) {
            System.out.println("Element is present in the array.");
        } else {
            System.out.println("Element is not present in the array");
        }
    }
}
