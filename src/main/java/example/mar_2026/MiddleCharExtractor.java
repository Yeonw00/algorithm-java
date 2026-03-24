package example.mar_2026;

public class MiddleCharExtractor {

    public String solution(String str) {
        int len = str.length();

        return str.substring((len - 1) / 2, (len / 2) + 1);
    }

    public static void main(String[] args) {
        MiddleCharExtractor mce = new MiddleCharExtractor();
        String str = "abcde";
        String str2 = "qwer";
        System.out.println(mce.solution(str));
        System.out.println(mce.solution(str2));
    }
}
