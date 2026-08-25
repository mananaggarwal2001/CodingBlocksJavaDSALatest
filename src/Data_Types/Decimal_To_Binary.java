package Data_Types;

public class Decimal_To_Binary {
    static void main() {
        int n = 67;
        int sum = 0;
        int multiplier = 1;
        while (n > 0) {
            int remainder = n % 2;
            sum = sum + remainder * multiplier;
            multiplier *= 10;
            n /= 2;
        }
        System.out.println("The binary number is :- " + sum);
    }
}
