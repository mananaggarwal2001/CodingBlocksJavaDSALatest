package Recursion_2;

public class SubSequence_Printing {
    static void main() {
        // all subStrings are subsequences but not all subsequences are subString.
        // code likhte waqt hum pehli level ke baare me hi sochte hain aur kuch nhi sochte hain baaki saara kaam recursion kar deta hain.
        String inputString = "abc";
        // blank String pass karne ke liye aise pass karte hain "".

        printSubSequences(inputString, "");
    }

    private static void printSubSequences(String question, String ans) {
        if (question.isEmpty()) {
            // when the String is empty then print all the subsequences.
            System.out.println(ans);
            return;
        }
        // choice 1 not picking the character.
        printSubSequences(question.substring(1), ans);
        // choice 2 picking the character and adding to the answer string.
        printSubSequences(question.substring(1), ans + question.charAt(0));
    }
}
