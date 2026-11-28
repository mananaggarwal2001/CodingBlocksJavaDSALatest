package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q13_Print_Series {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        printSeries(number1, number2);
    }

    private static void printSeries(int number1, int number2) {
        int countNumber = 0;
        int counter = 1;
        while (true) {
            int number = 3 * counter + 2;
            if (number % number2 != 0) {
                System.out.println(number);
                countNumber++;
            }
            if (countNumber == number1) {
                break;
            }
            counter++;
        }
    }
}
