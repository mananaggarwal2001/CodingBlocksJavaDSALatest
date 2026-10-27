package Strings;

public class EqualsInString {
    static void main() {
        String s1 = "Hello";
        String s2 = "Hello";
    }

    // my equals method for comparison of 2 strings and getting the results.
    public static boolean equals(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        // O(N) is the time complexity.
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
