package Recursion_1.QuestionsSingleRecursion;

public class Q42_Check_String_Contain_Only_Digits {
    static void main() {
        String inputString = "1234qwqw";
        System.out.println(checkStringContainOnlyDigits(inputString));
    }

    private static boolean checkStringContainOnlyDigits(String inputString) {
        if (inputString.isEmpty()) {
            return true;
        }
        char ch = inputString.charAt(0);
        return (ch >= 49 && ch <= 57) && checkStringContainOnlyDigits(inputString.substring(1));
    }
}
