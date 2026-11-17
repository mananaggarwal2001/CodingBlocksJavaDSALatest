package Assignment_And_Leetcode_Doubt_Questions;

public class Get_Max_Score_Leetcode {
    static void main() {
        int[] num1 = {2, 4, 5, 8, 10}; // this is the first array
        int[] num2 = {4, 6, 8, 9}; // this is the second array.
        int result = findMaxSum(num1, num2);
        System.out.println(result); // this is used for printing the statement in the console.
    }

    private static int findMaxSum(int[] num1, int[] num2) {
        int counter1 = 0;
        int counter2 = 0;
        long aSum = 0; // yeh array a ka sum ka track rakhega
        long bSum = 0; // yeh array b ka sum ka track rakhega.
        long sum = 0;
        while (counter1 < num1.length && counter2 < num2.length) {
            if (num1[counter1] < num2[counter2]) {
                aSum += num1[counter1];
                counter1++;
            } else if (num2[counter2] < num1[counter1]) {
                bSum += num2[counter2];
                counter2++;
            } else {
                sum += num1[counter1]; // we can add anything because for both of the array the value must be same.
                sum += Math.max(aSum, bSum);
                counter1++;
                counter2++;
                aSum = 0; // we have to reset this value also for getting the final answer.
                bSum = 0;
            }
        }

        // for remaining array we have this thing which is
        while (counter1 < num1.length) {
            aSum += num1[counter1];
            counter1++;
        }
        while (counter2 < num2.length) {
            bSum += num2[counter2];
            counter2++;
        }
        sum += Math.max(aSum, bSum);
        return (int) (sum % (Math.pow(10, 9) + 7));
    }
}
