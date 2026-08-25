package Math;

public class Check_Prime_Using_break {
    static void main() {
        int n = 5;
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            System.out.println("The given number is not prime number");
        } else {
            System.out.println("The given number is the prime number");
        }
    }
}
