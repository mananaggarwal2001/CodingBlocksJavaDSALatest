package Time_Complexity;

public class Introduction {
    // algorithms which consume less time and less space have the good time complexity
    // asymptotic notation
    // experimental way.

    static void main() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_000; i++) {
            // this is the empty for loop for doing the things done.
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start); // time difference for executing the code.
        // this is the number for doing the work
        // if the loop in the counter variable is changing with the multiplication or division then the time complexity will be in the Log(N).
        // uska log ka base hoga jisse multiply or divide hoga.
        // jab humara counter variable addition or subtraction me jata hain to fir humara answer linear me aayega.
        // the expansion of the log is sum of 1/Natural numbers.
        // Bubble sort, selection sort and insertion sort inn teeno ka worst case time complexity N^2 aata hain.
        // Best case for insertion sort is O(N).`
        // for finding the code whether it will give TLE or not just put the maximum value of the constraint in the N then get the value whether the code will run or not.
        // like put the maximum value of constraint which is example 10^5 in the N and the time complexity is N^3 then (10^5)^3 = 10^15 this will give TLE as in 1 second only 10^8 instructions are executed.

    }
}
