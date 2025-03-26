import java.util.*;

public class StringPerm {
    public static void main(String[] args) {
        String[] s={"000","011","111"};
        //System.out.println();
        List<String> s1=new ArrayList<>();
        List<String> s2=new ArrayList<>();
        int n=s.length;
        for(String str:s){
            s2.add(str);
        }
        perm("",n,s1);
         
        for(String str:s1){
            if(!s2.contains(str)){
                System.out.println(str);
                break;
            }
        }
    }
    static void perm(String s,int n,List<String> s1){
        if(s.length()==n){
            s1.add(s);

            return;
        }
        for(int i=0;i<2;i++){
            String s2=String.valueOf(i);
            perm(s+s2, n,s1);
            
        }
        //System.out.println(s);
    }
}
