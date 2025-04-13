
import java.util.Arrays;

public class DecodeWays {
    //static int count=0;
    public static void main(String[] args) {
        String s="226";
        int[] memo=new int[s.length()];
        Arrays.fill(memo,-1);
        System.out.println(ways(s,memo,0));
        
    }
    public static int ways(String s,int[] memo,int index) {
        if(s.isEmpty()){
            return 1;
        }
        if(memo[index]!=-1){
            return memo[index];
        }
        int count=0;
        for(int i=0;i<2;i++){
            if(s.length()>=i+1){
                String sub=s.substring(0,i+1);
                if(Integer.parseInt(sub)<=26 && !sub.startsWith("0")){
                    count+=ways(s.substring(i+1),memo,index+i+1);
                }
                
            }
        }
        memo[index]=count;
        return count;
    }
}
