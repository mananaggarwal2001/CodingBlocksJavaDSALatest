package Functions;

import java.util.Scanner;

public class Shopping_Game {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int Aayush = sc.nextInt();
        int Harshit = sc.nextInt();
        int initialAyush = 0;
        int initialHarshit = 0;
        int phone = 1;
        while (true) {
            initialAyush += phone; // this is the phone for the given number for doing the work.
            if (initialAyush > Aayush) {
                System.out.println("Harshit");
                return;
            }
            phone++;
            initialHarshit += phone;
            if (initialHarshit > Harshit) {
                System.out.println("Aayush");
                return;
            }
            phone++;
        }
    }
}
