import java.util.ArrayList;
import java.util.List;

public class LongestValidPara {
    public static void main(String[] args) {
        String s = "(())";
        int count = 0;
        int start = 0;
        int end = 0;
        List<String> outer = new ArrayList<>();
        outer.add("");
        for (int i = 0; i < s.length(); i++) {
            start = 0;
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                start = end;
            }

            end = outer.size();
            int n = outer.size();
            for (int j = start; j < n; j++) {
                String s1 = outer.get(j);
                s1 += s.charAt(i);
                outer.add(s1);

            }
        }

        System.out.println(outer);

    }
}
