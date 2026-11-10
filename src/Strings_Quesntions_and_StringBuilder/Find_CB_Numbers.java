package Strings_Quesntions_and_StringBuilder;

public class Find_CB_Numbers {
    static void main() {
        int finalresult = countCBNumbers("81615");
        System.out.println(finalresult);
    }

    private static int countCBNumbers(String number) {
        // first we saw the length of the String.
        // jab dono loop parallel badh rahi ho to iss code me teesra cheez dhundo jo fix hain.
        int count = 0;
        boolean[] visited = new boolean[number.length()];
        for (int length = 1; length <= number.length(); length++) {
            for (int j = length; j <= number.length(); j++) {
                // Now I have to find the i for doing this question and getting the things done.
                int i = j - length; // this formula I have to used for finding the I okkk.
                long convertedNumber = Long.parseLong(number.substring(i, j));
                if (isCBNumber(convertedNumber) && isNotVisited(visited, i, j - 1)) {
                    // marked.
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isNotVisited(boolean[] visited, int i, int j) {
        for (int k = i; k <= j; k++) {
            if (visited[k]) {
                return false;
            }
        }
        return true;
    }

    // for checking whether the number is the CB number or not CB number.
    private static boolean isCBNumber(long number) {
        // 0 and 1 are not CB numbers
        // for maximum CB numbers we have to prefer the lengthwise subStrings for getting the things done.
        int[] numberInteger = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        if (number == 0 || number == 1) {
            return false;
        }
        for (int i = 0; i < numberInteger.length; i++) {
            if (number == numberInteger[i]) {
                return true;
            }
        }
        for (int i = 0; i < numberInteger.length; i++) {
            if (number % numberInteger[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
