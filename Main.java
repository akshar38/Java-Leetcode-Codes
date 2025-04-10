
public class Main {
    static int count=0;
    public static void main(String[] args) {
        String s="123";
        rec(s,"");
    }
    public static void rec(String s,String p){
        if(s.length()==p.length()){
            count++;
            return;
        }
        if(s.isEmpty()){
            return;
        }
        char c=s.charAt(0);
        String s1=s.substring(1);
        rec(s1,p+c);
        String s2=s.substring(0,1);
        if(s.length()>2){
            s=s.substring(2);
        }
        rec(s,p+s2);
    }

}
