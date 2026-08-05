package Patterns_Lecture_2;
// package means that a packet that contains all the classes or we can say these are files.
public class Loops_Demo {
    static void main() {
        int number = 10;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        sum = 0;
        int tracker = 1;
        while (tracker <= number) {
            sum += tracker;
            tracker++;
        }
        System.out.println("The sum is " + sum);
    }
}
