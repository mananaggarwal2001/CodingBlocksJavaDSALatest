package Strings_Quesntions_and_StringBuilder;

public class Print_The_subString_Lengthwise {
    static void main() {
        String firstString = "Coding";
        printStringLengthWise(firstString);
    }

    private static void printStringLengthWise(String firstString) {
        // first we saw the length of the String.
        // jab dono loop parallel badh rahi ho to iss code me teesra cheez dhundo jo fix hain.
        for (int length = 1; length <= firstString.length(); length++) {
            for (int j = length; j <= firstString.length(); j++) {
                // Now I have to find the i for doing this question and getting the things done.
                int i = j - length; // this formula I have to used for finding the I okkk.
                System.out.println(firstString.substring(i, j));
            }
        }
    }
}
