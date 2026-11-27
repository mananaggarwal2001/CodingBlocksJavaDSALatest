package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q9_Check_Prime {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        checkPrime(inputNumber);
    }

    private static void checkPrime(int inputNumber) {

        for (int i = inputNumber - 1; i > 1; i--) {
            if (inputNumber % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
