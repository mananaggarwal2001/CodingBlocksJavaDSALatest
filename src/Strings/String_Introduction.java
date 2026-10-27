package Strings;

public class String_Introduction {
    static void main() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        // there is one special area which is also known as the String pool or the intern pool in which no new duplicates are formed there.
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1 == s3); // this will compare the address
        System.out.println(s1==s2); // this will compare the address.
        System.out.println(s1.equals(s3)); // this will compare the content of this thing.
        // this is java not  the javascript
        int[] arr= new int[5];
        System.out.println(arr.length);
        System.out.println(s1.length()); // this is the length function which is used for finding the length.
        // difference between 2 length() and length which is :-
        // 1. length is the variable and the length() is the method or the function.


    }
}
