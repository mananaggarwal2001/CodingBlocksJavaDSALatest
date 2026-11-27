package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q8_Inverse_Of_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        inverseOfNumber(inputNumber);
    }

    private static void inverseOfNumber(int inputNumber) {
        int countNumber = 1;
        int finalAnswer = 0;
        while (inputNumber > 0) {
            int remainder = inputNumber % 10;
            finalAnswer = (int) (finalAnswer + (Math.pow(10, remainder-1) * countNumber));
            countNumber++;
            inputNumber /= 10;
        }
        System.out.println(finalAnswer);
    }
}
