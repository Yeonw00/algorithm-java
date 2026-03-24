package example.mar_2026;

public class DivisorSumCalculator {
    public int solution(int number) {
        int result = 0;
        for (int i = 1; i * i <= number; i ++) {
            if (number % i == 0) {
                result += i;
                if (i != number / i) {
                    result += number / i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DivisorSumCalculator dsc = new DivisorSumCalculator();
        int number = 12;
        System.out.println(dsc.solution(number));
    }
}
