package Math;

public class Check_Prime {
    static void main() {
        int n = 5;
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 1) {
            System.out.println("The given number is not prime number");
        } else {
            System.out.println("The given number is the prime number");
        }
    }
}
