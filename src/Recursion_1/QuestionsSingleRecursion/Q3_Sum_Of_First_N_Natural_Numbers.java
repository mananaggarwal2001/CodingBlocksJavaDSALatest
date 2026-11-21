package Recursion_1.QuestionsSingleRecursion;

public class Q3_Sum_Of_First_N_Natural_Numbers {
    static void main() {
        int number = 5;
        int result = sumNNaturalNumbers(number);
        System.out.println(result);
    }

    private static int sumNNaturalNumbers(int number) {
        if (number == 0) {
            return 0;
        }
        return number + sumNNaturalNumbers(number - 1);
    }

}