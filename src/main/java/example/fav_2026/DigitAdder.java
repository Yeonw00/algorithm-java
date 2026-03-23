package example.fav_2026;

public class DigitAdder {

    public int sumOfDigit(int number) {
        int result = 0;
        while(number > 0) {
            result += number % 10;
            number = number /10;
        }
        return result;
    }

    public static void main(String[] args) {
        DigitAdder da = new DigitAdder();
        System.out.println(da.sumOfDigit(123));
    }
}
