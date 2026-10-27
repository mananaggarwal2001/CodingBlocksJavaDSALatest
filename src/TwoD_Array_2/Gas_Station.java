package TwoD_Array_2;

public class Gas_Station {
    static void main() {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(findIndex(gas, cost));
    }

    private static int findIndex(int[] gas, int[] cost) {
        // agar isme total gas se zyada total cost aa jaati hain to phir humne jahan se start kiya hain wahan tak hum kabhi pahuch hi nhi skate hain.
        int total_sum = 0;
        for (int i = 0; i < cost.length; i++) {
            total_sum += (gas[i] - cost[i]);
        }
        if (total_sum < 0) {
            return -1;
        }
        // after this above code fragement this is sure that the answer will always be exists in the circular queue
        // so we apply the kadanes algorithm for finding the index from which I can reach same index okkk.
        int current_sum = 0;
        int idx = 0;
        for (int i = 0; i < cost.length; i++) {
            current_sum += (gas[i] - cost[i]);
            if (current_sum < 0) {
                idx = i + 1;
                current_sum = 0;
            }
        }
        return idx;
    }
}
