package example.fav_2026;

public class CaseConverter {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c: str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CaseConverter cc = new CaseConverter();
        String str = "Harry Potter";
        System.out.println(cc.solution(str));
    }
}
