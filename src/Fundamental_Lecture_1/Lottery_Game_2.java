package Fundamental_Lecture_1;

public class Lottery_Game_2 {
    static void main() {
        int number = 13;
        if (number >= 300 && number <= 400) {
            System.out.println("Car");
            if (number <= 485) {
                System.out.println("Thar");
            } else {
                System.out.println("Creata");
            }
        } else if (number >= 85 && number <= 105) {
            System.out.println("You win bike");
        } else if (number >= 135 && number <= 205) {
            System.out.println("Kurkure");
        } else {
            System.out.println("Happy birthday bolenge log tumhare liye");
        }
    }
}
