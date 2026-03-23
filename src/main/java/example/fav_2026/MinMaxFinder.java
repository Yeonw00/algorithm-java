package example.fav_2026;

public class MinMaxFinder {

    public static void main(String[] args) {
        MinMaxFinder mmf = new MinMaxFinder();

        int [] numbers = {4, 2, 17, 5, 9};

        int result = mmf.findMinNumAndMaxNum(numbers);

        System.out.println(result);
    }

    public int findMinNumAndMaxNum(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i<numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return min + max;
    }
}
