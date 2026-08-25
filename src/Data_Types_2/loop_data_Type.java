package Data_Types_2;

public class loop_data_Type {
    static void main() {
        // this will give me the infinite loop because the maximum range of byte is 127 after that this will reset to -128 and
        // the loop will restart okk.
        for (byte i = 0; i < 128; i++) {
            System.out.println(i);
        }
        for (byte i = 0; i <= 127; i++) {
            System.out.println(i);
        }
    }
}
