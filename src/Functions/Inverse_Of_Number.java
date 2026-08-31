package Functions;

import java.util.Map;
import java.util.Scanner;

public class Inverse_Of_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = findInverse(number);
        System.out.println(result);
    }

    private static int findInverse(int number) {
        int count = 1;
        int finalresult = 0;
        while (number != 0) {
            int remainder = number % 10;
            int powerNumber = (int) (Math.pow(10, remainder) * count);
            finalresult += powerNumber;
            number /= 10;
            count++;
        }
        return finalresult / 10;
    }
}
