package example.mar_2026;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateRemover {
    public String solution(String my_string) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c: my_string.toCharArray()) {
            set.add(c);
        }

        for(char c: set) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        DuplicateRemover dr = new DuplicateRemover();
        String my_string = "people";
        System.out.println(dr.solution(my_string));
    }
}
