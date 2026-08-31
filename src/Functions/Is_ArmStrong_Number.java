package Functions;

import java.util.Scanner;

public class Is_ArmStrong_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isArmstrongNumber(number)) {
            System.out.println("This is the Armstrong number");
        } else {
            System.out.println("This is not the Armstrong number");
        }
    }
    // for checking whether the number is armstrong number or not.
    static boolean isArmstrongNumber(int number) {
        int digits = countDigits(number);
        int tempNumber = number;
        long sum = 0;
        while (tempNumber != 0) {
            int remainder = tempNumber % 10;
            sum += (long) Math.pow(remainder, digits);
            tempNumber /= 10;
        }
        return sum == number;
    }
    // for counting the number of digits.
    static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
}
