package example.fav_2026;

public class VowelRemover {

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(char c: my_string.toCharArray()) {
            if(c != 'a' && c != 'e'&& c != 'i' && c != 'o' && c != 'u') {
                sb.append(c);
            }
        }

        return sb.toString();

        // 정규 표현식을 쓰면 한줄이면 끝남
        // return my_string.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        VowelRemover vr = new VowelRemover();
        String my_string = "harrypotter";
        System.out.println(vr.solution(my_string));
    }
}
