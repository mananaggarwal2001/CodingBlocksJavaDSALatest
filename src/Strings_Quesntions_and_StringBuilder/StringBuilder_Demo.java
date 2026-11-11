package Strings_Quesntions_and_StringBuilder;

public class StringBuilder_Demo {
    static void main() {
        StringBuilder sb = new StringBuilder();// it maintain the array internally when we write anything in the Stringbuilder.
        // There are 2 terms which is size and capacity.
        // The default size in the array is called capacity.
        // the size is 0 initially.
        // the internal size of the array is called capacity and the default capacity is 16 in the array.
        // if we write the hello in the array
        StringBuilder sb2 = new StringBuilder("Hello"); // this will be the size of 5 and capacity is 21.
        System.out.println(sb2.length()); // Now the size wil become 5
        System.out.println(sb2.capacity()); // in this the capacity will become 21 5 for the size and capacity is 16 which is empty right now and that we have to filled.
        StringBuilder sb3= new StringBuilder(100);// now the capacity will become the 100
        System.out.println(sb3.capacity()); // this will print the capacity which is 100.
        StringBuilder sb1= new StringBuilder("1020hellotrue");
        // if we use the compareTo method in the StringBuilder then they will first convert the StringBuilder to String then it will compare the content in it.
        // all the library which is present in the String is present in the StringBuilder.
        // in the normal String jab hum normal string ko change karenge to wo pehle naya string banata hain aur uske baad change karta hain but string builder me aisa nhi hota hain isme same string me changes hote hain without making the new string.
        // StringBuilder me capacity 2* oldcapacity se badhta hain aur saara ka saara content uss naye String me copy hota hain uske baad usme wo character append hota hain.
        // StringBuffer is same as the StringBuilder
        // The main difference between the StringBuilder and StringBuffer is that StringBuffer is thread safe but the StringBuilder is not thread safe.
        // process ke sabse smallest unit of thread kehte hain.
        // StringBuffer me thread synchronized hota hain aur StringBuilder me aisa kuch nhi hota hain.
        // Synchronization ka matlab hota hain turn by turn cheeze hoti hain.
    }
}
