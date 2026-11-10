package Strings_Quesntions_and_StringBuilder;

public class Reverse_Words_in_Strings {
    static void main() {
        String questionString = " the              sky            is blue ";
        questionString = questionString.trim(); // this will remove the leading and the trailing spaces in the Strings.
        String[] arrayString = questionString.split(" +"); // this will seperate the Strings into words from the regex which is given in this string.
        // + sign in the regex expression will remove the multiple spaces within the Strings.
        reverse(arrayString); // this will reverse the words in the String.
        StringBuilder builder = new StringBuilder();
        for (String words : arrayString) {
            builder.append(words + " "); // this will joins the words in the form of the String from the array.
        }
        System.out.println(builder.toString().trim());
    }

    public static void reverse(String[] array) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
