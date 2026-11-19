package Recursion_1;

public class Print_Increasing {
    static void main() {
        int n = 5;
        PI(n);
    }

    private static void PI(int n) {
        if (n == 0) {
            return; // return type void hain isme isliye sirf return lagayenge taaki function frame wahan se udd jaaye.
        }
        PI(n - 1); // this is recursive call for this code.
        System.out.println(n); // answer stack girte waqt ban raha hain isme aur increasing order me ban raha hain.
        // this is the head recursion kyuki recursion me wapis aate waqt kuch kaam ho raha hain isliye ye head recursion hain.
        // recursion me wapis aate waqt agar kaam nhi ho raha hain to wo tail recursion hain.
    }
}
