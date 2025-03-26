import java.util.ArrayList;
import java.util.Arrays;

public class SubsetString {
    public static void main(String[] args) {
        String s = "aab";
        // ArrayList<String> s2 = new ArrayList<>();
        String s1 = "";
        //String s2 = s.substring(s.length() / 2);
        //System.out.println(s2.charAt(0));
        // subset(s, s1);
        System.out.println(subset(s, s1));
        //System.out.println(subSet(s, s1));

    }

    static int subset(String s, String s1) {
        if (s.isEmpty()) {
            System.out.println(s1);
            return 1;
        }
        char p = s.charAt(0);
        int count=0;
        count+=subset(s.substring(1), s1 + p);
        count+=subset(s.substring(1), s1);
        return count;
    }

    static ArrayList<String> subSet(String s, String s1) {
        if (s.isEmpty()) {
            ArrayList<String> r = new ArrayList<>();
            r.add(s1);
            return r;
        }
        char p = s.charAt(0);
        ArrayList<String> l = subSet(s.substring(1), s1 + p);
        ArrayList<String> r = subSet(s.substring(1), s1);
        l.addAll(r);
        return l;
    }

}
