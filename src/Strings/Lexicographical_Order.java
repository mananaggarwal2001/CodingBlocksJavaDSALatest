package Strings;

public class Lexicographical_Order {
    static void main() {
        String s1 = "komal";
        String s2 = "kunal";
        System.out.println(s1.compareTo(s2)); // -ve s1 is smaller, +ve s1 is larger, 0 is s1==s2.
        // what is the -6 number that is coming in this method.
        // this is the ascii character difference between 2 characters.
        String s3 = "ankit";
        String s4 = "ankita";
        System.out.println(s4.compareTo(s3)); // this will come as 1 as final answer that is the length difference between two Strings when the String has completely same letters.

    }

    public static int compareTo(String s1, String s2) {
        if (s1 == s2) {
            return 0;
        }
        int minLength = Math.min(s1.length(), s2.length()); // for finding the min length of the Strings.
        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return s1.charAt(i) - s2.charAt(i);

            }
        }
        return s1.length() - s2.length(); // if all the characters are same then we will return the length of the String
    }
}
