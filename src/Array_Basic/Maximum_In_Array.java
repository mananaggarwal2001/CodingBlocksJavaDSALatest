package Array_Basic;

public class Maximum_In_Array {
    public static void main() {
        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};
        int maxValueAnswer = findMaxValue(arr);
        System.out.println("The maximum value in the array is:- " + maxValueAnswer);
    }

    private static int findMaxValue(int[] arr) {
        int maxValue = Integer.MIN_VALUE; // this is the lowest value of the integer which I can put in this variable.
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    private static int findMaxValue1(int[] arr) {
        int maxValue = Integer.MIN_VALUE; // this is the lowest value of the integer which I can put in this variable.
        for (int i = 0; i < arr.length; i++) {
            maxValue = Math.max(arr[i], maxValue);
        }
        return maxValue;
    }
}
