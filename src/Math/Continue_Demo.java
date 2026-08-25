package Math;

public class Continue_Demo {
    static void main() {
        int number = 8;
        // we don't want to print number 6 but we want to print numbers other than the 6.
        for (int i = 1; i <= number; i++) {
            // this will skip the iteration on which the condition is satisfied.
            if (i == 6) {
                continue;
            }
            System.out.println(i);
        }
    }
}
