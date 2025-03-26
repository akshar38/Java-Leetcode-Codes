import java.util.ArrayList;
import java.util.List;

public class HappyString {
    static List<String> res=new ArrayList<>();
    public static void main(String[] args) {
        char[] s={'a','b','c'};
        happy(s,"",res,1,4);
        if(res.size()>=3){
            System.out.println(res.get(2));
        }
        else{
            System.out.println(""+res.size());
        }
        //System.out.println(a.substring(0, a.length()-1));

    }
    
    public static void happy(char[] s,String p,List<String> res,int n,int k){
        if(p.length()==n){
            System.out.println(p);
            res.add(p);
            return ;
        }
        
        for(char c:s){
            if(p.length()==0 || p.charAt(p.length()-1)!=c){
                p+=c;
                happy(s, p,res, n,k);
                p=p.substring(0,p.length()-1);
            }
        }    

        return;
    }
}
