package example.mar_2026;

public class PalindromeChecker {
    public boolean solution(String str) {
        int left = 0;
        int right = str.length()-1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        String str1 = "level";
        String str2 = "tomato";
        System.out.println(pc.solution(str1));
        System.out.println(pc.solution(str2));
    }
}
