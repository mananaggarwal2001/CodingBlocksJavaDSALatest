package Math;
// this is also known as the GCD of two numbers.
// this is also called as the Euclid division method.
// If divisor is bigger then the dividend then there will be one step extra then the things will done in the same manner only.
public class HCF {
    static void main() {
        int dividend = 60;
        int divisor = 36;
        while (dividend % divisor != 0) {
            int remainder = dividend % divisor;
            dividend= divisor;
            divisor = remainder;
        }
        System.out.println("The highest common factor is:- " + divisor);
    }
}
