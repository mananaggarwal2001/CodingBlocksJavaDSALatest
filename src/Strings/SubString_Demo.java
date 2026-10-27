package Strings;

public class SubString_Demo {
    static void main() {
        // continuous part of the String is also called the subString.
        String s = "Coding";
        System.out.println(s.substring(2, 4)); // this will give the String from (StartingIndex, EndingIndex-1).
        System.out.println(s.substring(2)); // this will give the whole string as the answer from which we have written the beginIndex.
        System.out.println(s.substring(2, 2)); // this will not give anything.
        printSubString("CodingBlocks");
    }

    public static void printSubString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }
}
