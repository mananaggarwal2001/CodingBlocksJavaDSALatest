package Advance_Binary_Search;

public class Book_Allocation_Problem {
    static void main() {
        // this is the book allocation problem in which we have to assign the number of pages to the numbers of students so that all books can be read.
        // padhne ke liye iss tareeke se do ki jo maximum pages hain wo minimum ho students ke liye.
        // koko eating banana
        // roti paratha SPOJ Problem.
        int[] page = {10, 20, 30, 40};
        int numberOfStudents = 2;
        System.out.println(minimum_Pages(page, numberOfStudents));
    }

    public static int minimum_Pages(int[] page, int nos) {
        int low = 0, high = 0;
        for (int i = 0; i < page.length; i++) {
            high += page[i];
        }
        int ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isItPossibleToRead(page, nos, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isItPossibleToRead(int[] page, int nos, int givenPagesToRead) {
        int student = 1;
        int sum = 0;
        for (int i = 0; i < page.length; ) {
            if ((sum + page[i]) <= givenPagesToRead) {
                sum += page[i];
                i++;
            } else {
                student++;
                sum = 0;
            }
            if (student > nos) {
                return false;
            }
        }
        return true;
    }
}
