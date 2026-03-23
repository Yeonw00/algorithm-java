package example.fav_2026;

import java.util.Arrays;

public class EvenOddCounter {

    public int[] solution(int[] num_list) {
        int[] result = new int[2];
        for (int num: num_list) {
            result[num & 1] ++;
        }
        return result;
    }

    public static void main(String[] args) {
        EvenOddCounter eoc = new EvenOddCounter();
        int[] num_list = {11, 30, 24, 37, 58};
        System.out.println(Arrays.toString(eoc.solution(num_list)));
    }
}
