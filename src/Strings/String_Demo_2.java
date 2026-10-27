package Strings;

public class String_Demo_2 {
    static void main() {
        System.out.println("Hello" + 10 + 20 + "Bye");
        System.out.println("Hello" + (10 + 20) + "Bye"); // in this senario the bracket will be evaluated first then the String will be be concatenated.
        System.out.println(10 + 20 + "Hello" + "Bye");
    }
}
