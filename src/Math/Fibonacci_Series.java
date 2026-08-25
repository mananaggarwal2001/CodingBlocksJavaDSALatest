package Math;

public class Fibonacci_Series {
    static void main() {
        int a = 0;
        int b = 1;
        int number = 6;
        for (int i = 1; i <= number; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(a);
    }
}
