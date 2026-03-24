package example.mar_2026;

public class HiddenNumberAdder {
    public int solution(String my_string) {
        int result = 0;
        for (char c: my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                result += c - '0';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        HiddenNumberAdder hna = new HiddenNumberAdder();
        String my_string = "aAb1B2cC34oOp";
        System.out.println(hna.solution(my_string));
    }
}
