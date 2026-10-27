package Strings;

public class Check_Palindrome {
    static void main() {
        String s1 = "nitin";
        System.out.println(check_Palindrome(s1));
    }

    public static boolean check_Palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
