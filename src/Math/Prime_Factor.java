package Math;

public class Prime_Factor {
    static void main() {
        int number = 378;
        int i = 2;
        while (number != 1) {
            if (number % i == 0) {
                System.out.println(i);
                number = number / i;
            } else {
                i++;
            }
        }
    }
}
