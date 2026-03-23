package example.fav_2026;

import java.util.Arrays;

public class ArrayReverser {
    public int[] solution(int[] num_list) {
        int n = num_list.length;

        int[] reversed = new int[n];

        for (int i=0; i<n; i++) {
            reversed[i] = num_list[n -1 -i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        ArrayReverser ar = new ArrayReverser();
        int[] nums = {3, 6, 9, 12, 15};
        System.out.println(Arrays.toString(ar.solution(nums)));
    }
}
