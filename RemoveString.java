public class RemoveString {
    public static void main(String[] args) {
        String s = "axxxxyyyyb";
        String r=remove(s, "xy");
        System.out.println(sb.toString());
    }

    static StringBuilder sb=new StringBuilder();;
    static String remove(String s, String s1) {
        
        if (s.isEmpty()) {
            return sb.toString();
        }
        //int count=0;
        if (s.startsWith(s1)) {
            String s2=sb.toString();
            sb.delete(0,sb.length());
            return remove(s2+s.substring(s1.length()), s1);
        } 
        else {
            sb.append(s.charAt(0));
            return s.charAt(0)+remove(s.substring(1), s1);
        }
    }

}
