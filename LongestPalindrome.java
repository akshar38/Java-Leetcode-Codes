public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "aabcd";
        // System.out.println(s.length());
        System.out.println(longpal(s));

    }

    public static String longpal(String s) {
        // int longLength = 0;
        String s1 = "";
        String s2 = "";
        String res = "";
        for (int i = 0; i < s.length() - 1; i++) {
            s1 = pal(s, i, i + 1);
            s2 = pal(s, i, i);
            if (s1.length() > res.length()) {
                res = s1;
            } else if (res.length() < s2.length()) {
                res = s2;
            }
        }
        String[] se;
        
        return s;
    }

    public static String pal(String s, int left, int right) {
        while (left <= right && left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
            } else {
                left++;
                right--;
                break;
            }
        }
        if (left < 0) {
            left++;
            right--;
        }
        if (right == s.length()) {
            left++;
            right--;
        }
        String temp = "";
        if (left <= right) {
            temp = s.substring(left, right + 1);

        }
        return temp;
    }
}
