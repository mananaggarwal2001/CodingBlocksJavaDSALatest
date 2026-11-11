package Strings_Quesntions_and_StringBuilder;

public class String_Builder_Demo_2 {
    static void main() {
        // StringBulder is faster than the normal String
//        StringBuilder_Time();
//        String_Time();
    }

    static void StringBuilder_Time() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000_000; i++) {
            sb.append(i);
        }
    }

    static void String_Time() {
        String s = "";
        for (int i = 0; i < 1000_000; i++) {
            s = s + i;
        }
    }
}
