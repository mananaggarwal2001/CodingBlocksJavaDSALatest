package Math;

public class Sum_Of_Digits {
    static void main() {
        int number = 11111;
        int sum = 0;
        while (number != 0) {
            int remainder = number % 10;
            sum += remainder;
            number /= 10;
        }
        System.out.println(sum);
    }
}
