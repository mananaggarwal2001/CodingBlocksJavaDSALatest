package Fundamental_Lecture_1;

public class Maximum_Of_Three_Numbers {
    static void main() {
        int number1 = 12;
        int number2 = 13;
        int number3 = 23;
        if (number1 > number2 && number1 > number3) {
            System.out.println("The number 1 is greater than or equal to number 3");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("The number 2 is greater than or equal to number 3");
        } else {
            System.out.println("The number 3 is greater than or equal to number 1");
        }
    }
}
