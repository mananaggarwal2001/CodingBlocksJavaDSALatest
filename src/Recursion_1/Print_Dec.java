package Recursion_1;

public class Print_Dec {
    static void main() {
        int number = 5;
        printDec(number);
    }

    private static void printDec(int number) {
        if (number == 0) {
            return;  // if number ==0 then return as this is the base case for this condition.
        }
        System.out.println(number); // the number will be printed when the stack is forming not stack is removing.
        printDec(number - 1); // mere kaam ke baad recursion ka kaam hain.
        // stack chadte waqt kaam ho raha hain.
        // this is the tail recursion example when the work is done while the stack is growing.
        // and after removal of the stacks there is no work that is done is the example of the tail recursion.
    }
}
