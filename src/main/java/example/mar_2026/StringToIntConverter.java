package example.mar_2026;

public class StringToIntConverter {
    public int solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (char c: my_string.toCharArray()) {
            if (c == '+') {
                continue;
            } else {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        StringToIntConverter stic = new StringToIntConverter();
        String my_string1 = "+1234";
        String my_string2 = "-1234";
        String my_string3 = "1234";
        System.out.println(stic.solution(my_string1));
        System.out.println(stic.solution(my_string2));
        System.out.println(stic.solution(my_string3));
    }
}
