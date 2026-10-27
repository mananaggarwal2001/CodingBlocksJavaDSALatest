package Strings;

public class Playing_With_Good_Strings {
    static void main() {
        // all string will be in the lower case characters
        String s1 = "cbaeicde";
        System.out.println(maxVowelLengthString(s1));
    }

    public static int maxVowelLengthString(String str) {
        int count = 0;
        int maxLength = Integer.MIN_VALUE; // this is the overall answer for getting the things done.
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                count++;
            } else {
                maxLength = Math.max(maxLength, count);
                count = 0;
            }
        }
        // this is the maxlength and this is the final answer.
        maxLength = Math.max(maxLength, count);
        return maxLength;
    }

    // to check whether the given character is the vowel or not.
    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
