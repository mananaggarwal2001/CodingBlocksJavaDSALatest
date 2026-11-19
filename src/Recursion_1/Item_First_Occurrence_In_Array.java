package Recursion_1;

public class Item_First_Occurrence_In_Array {
    static void main() {
        int[] array = {2, 3, 4, 5, 4};
        int item = 4;
        int index = 0;
        int foundItem = findItem(array, item, index);
        System.out.println(foundItem);
    }

    private static int findItem(int[] array, int item, int index) {
        // negative base case
        if (index == array.length) {
            return -1;
        }
        // positive base case.
        if (array[index] == item) {
            return index;
        }
        // hum array ko reduce nhi kar skate hain isme hum index se khelenge.
        // answer stack chadte waqt mila tha iss case me.
        return findItem(array, item, index + 1);
        // this is the example of the tail recursion.
        // ki last statement is the recursive call and we are not doing any work when stack is removing or coming back from the recursion.

    }
}
