package example.fav_2026;

public class MaxNumberFinder {
    public int solution(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("배열이 비어있습니다.");
        }

        int max_num = numbers[0];

        for(int n: numbers) {
            max_num = Math.max(max_num, n);
        }
        return max_num;
    }

    public static void main(String[] args) {
        MaxNumberFinder mnf = new MaxNumberFinder();
        int[] numbers = {2, 6, -7, 0, -4, 9};
        System.out.println(mnf.solution(numbers));
    }
}
