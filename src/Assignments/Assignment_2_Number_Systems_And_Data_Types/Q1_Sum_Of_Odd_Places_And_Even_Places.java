package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q1_Sum_Of_Odd_Places_And_Even_Places {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        printOddEvenPlacesSum(inputNumber);
    }

    // this is the final answer for this question.
    private static void printOddEvenPlacesSum(int inputNumber) {
        int oddPlacesSum = 0;
        int evenPlacesSum = 0; // this is the even places sum for doing this question.
        int count = 1;
        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            if (count % 2 == 0) {
                evenPlacesSum += remainder;
            } else {
                oddPlacesSum += remainder;
            }
            count++;
            inputNumber /= 10;
        }
        System.out.println(oddPlacesSum);
        System.out.println(evenPlacesSum);
    }
}
