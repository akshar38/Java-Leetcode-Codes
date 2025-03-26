import java.util.ArrayList;
import java.util.List;
public class Pemutation {
    public static void main(String[] args) {
        String s="100";
        permutation(s,"");
        System.out.println(listPerm("abc",""));
        System.out.println(noOfPerm("aab",""));
    }
    static void permutation(String s,String p){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char c=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            permutation(s.substring(1), f+c+l);
        }
    }
    static List<String> listPerm(String s,String p){
        if(s.isEmpty()){
            List<String> r=new ArrayList<>();
            r.add(p);
            return r;
        }
        List<String> res=new ArrayList<>();
        char c=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            res.addAll(listPerm(s.substring(1), f+c+l));
        }
        return res;
    }
    static int noOfPerm(String s,String p){
        if(s.isEmpty()){
            return 1;
        }
        int count=0;
        List<String> res=new ArrayList<>();
        char c=s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            count=count+noOfPerm(s.substring(1), f+c+l);
        }
        return count;
    }
}
