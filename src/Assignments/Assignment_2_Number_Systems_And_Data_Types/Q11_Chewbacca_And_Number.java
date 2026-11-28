package Assignments.Assignment_2_Number_Systems_And_Data_Types;

import java.util.Scanner;

public class Q11_Chewbacca_And_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(chewbaccaAndNumber(inputString));
    }

    private static long chewbaccaAndNumber(String inputNumber) {
        StringBuilder changedNumber = new StringBuilder();
        // leading number can't start with 0 as the value will become octal value in the computer science terms.
        // if the leading number starts with 9 then the first number always start with 9
        // isme 0 ka 0 hi rahega but agar 9 aa jaye toh first one 9 hi rahega baaki minimum aayega number.
        for (int i = 0; i < inputNumber.length(); i++) {
            int changeDigit = inputNumber.charAt(i) - '0';
            if (changeDigit == 0 && i == 0) {
                changedNumber.append(9);
                continue;
            }
            if ((9 - changeDigit) < (inputNumber.charAt(i) - '0')) {
                changedNumber.append(9 - changeDigit);
            } else {
                changedNumber.append(inputNumber.charAt(i));
            }
        }
        return Long.parseLong(changedNumber.toString());
    }
}
