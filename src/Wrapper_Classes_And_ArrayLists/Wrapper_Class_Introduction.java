package Wrapper_Classes_And_ArrayLists;

public class Wrapper_Class_Introduction {
    static void main() {
        Integer i1 = 19;
        Integer i2 = 19;
        Integer i3 = 190;
        Integer i4 = 190;
        System.out.println(i1 == i2); // this will give true
        System.out.println(i3 == i4); // this will give false
        System.out.println(i3.equals(i4)); // ye true dega kyuki isme value check ho rahi hain.
        // Wrapper class me concept hota hain cache memory ka concept hota hain .
        // Ye internally ek array implement karke baitha hain joki size ka hain 256 but jo range hain wo hain -128 to 127
        // ki values ko store karta hain.
        // Agar value ka comparison issi range me hain to woh value ek hi baar store hogi jisko dono variables pointout kar rahe honge kyuki address same hain.
        // Agar value range se zyada badi hain to wo alag alag address me store hogi wo false dega agar comparison karne jaayenge toh.
        // yehi concept hain iss cheez ka.
        // Yehi cheez jo hain wo chaar datatype me hoti hain which is Integer, Long, Byte, Short etc.
        // ese koi concept float aur double me nhi hota hain.
        Boolean c1=false;
        Boolean c2=true; // ye hamesha true hi dega isme koi concept nhi hain asia special kuch.
        System.out.println(c1==c2); // ye hamesha true ki nazar aayega isme aisa kuch change nhi hone waala hain.

    }
}