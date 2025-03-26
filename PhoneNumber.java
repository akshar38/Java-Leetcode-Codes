import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main(String[] args) {
        String digit="7";
        System.out.println(comb(digit,""));    
    }
    static List<String> comb(String s,String p){
        if(s.isEmpty()){
            List<String> r=new ArrayList<>();
            r.add(p);
            return r;
        }
        List<String> re=new ArrayList<>();
        int digit=s.charAt(0)-'0';
        int mul;
        int lim;
        if(digit>7){
            mul=((digit-2)*3)+1;
        }
        else{
            mul=(digit-2)*3;
        }
        if(digit>=7 && digit<9){
            lim=((digit-1)*3)+1;
        }
        else if(digit==9){
            lim=((digit-1)*3)+2;
        }
        else{
            lim=(digit-1)*3;
        }
        for(int i=mul;i<lim;i++){
            char s1=(char)('a'+i);
            re.addAll(comb(s.substring(1), p+s1));
        }
        return re;
    }
    
    
}
