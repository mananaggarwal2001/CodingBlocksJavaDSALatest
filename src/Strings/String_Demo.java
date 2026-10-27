package Strings;

public class String_Demo {
    static void main() {
        // what is STring immutable and when the STring is made in the String pool and when the STring is not made in the STring pool ?
        // Immutable means that the STring will change but on the different location and then the address wil be updated in the String.
        // afterward the garbage collector will collect the unused memory and free the memory.
        // senarios in which the string is made in the pool and in which the String is not made in the pool.
        String s4 = "Hello" + "Bye"; // only this senario in which the STring is made in the String pool and rest other cases the String is made outside the pool.
        // in the String pool the String duplication is not allowed.
        // the object is made in the String pool is only one object and variables will point towards that object.

    }
}
