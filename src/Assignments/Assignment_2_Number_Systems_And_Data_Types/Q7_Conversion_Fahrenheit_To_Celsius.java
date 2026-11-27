package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q7_Conversion_Fahrenheit_To_Celsius {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int minFaranheitValue = sc.nextInt();
        int maxFaranheitValue = sc.nextInt();
        int steps = sc.nextInt();
        printFahrenheitAndCelsius(minFaranheitValue, maxFaranheitValue, steps);
    }

    private static void printFahrenheitAndCelsius(int minFaranheitValue, int maxFaranheitValue, int steps) {
        for (int i = minFaranheitValue; i <= maxFaranheitValue; i += steps) {
            double calculation = ((double) 5 / 9);
            int celsius = (int) (calculation * (i - 32));
            System.out.println(i + " " + celsius);
        }
    }
}
