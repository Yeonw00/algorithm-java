package example.mar_2026;

public class HarshadNumberChecker {
    public boolean solution(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("number는 0이상이어야 합니다.");
        }
        int original = number;
        int sum = 0;
        String str = Integer.toString(number);
        int len = str.length();
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return original % sum == 0;
    }

    public static void main(String[] args) {
        HarshadNumberChecker hnc = new HarshadNumberChecker();
        int number = 18;
        System.out.println(hnc.solution(number));
    }
}
