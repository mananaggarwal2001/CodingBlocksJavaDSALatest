package Data_Types;

public class Binary_To_Decimal {
    // number jisko convert karna hota hain usko divide karte hain aur jisse karte hain usko multiply karna hota hain.
    // condition to sum the number with the carry over is that both number will have same base.
    static void main() {
        int number = 10101;
        int counter = 0;
        int sum = 0;
        while (number > 0) {
            int remainder = number % 10;
            sum += (int) (remainder * (Math.pow(2, counter)));
            number /= 10;
            counter++;
        }
        // this is the final output for doing the work and the given number is done.
        // this is the final output number for doing the work.
        System.out.println("The binary to decimal number is :- " + sum);
    }
}
