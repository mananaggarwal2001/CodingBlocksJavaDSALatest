package Fundamental_Lecture_1;

public class Lottery_Game {
    static void main() {
        int number = 13;
        if (number >= 300 && number <= 400) {
            System.out.println("You win the car");
        } else if (number >= 85 && number <= 105) {
            System.out.println("You win bike");
        } else if (number >= 135 && number <= 205) {
            System.out.println("Kurkure");
        } else {
            System.out.println("Happy birthday bolenge log tumhare liye");
        }
    }
}
