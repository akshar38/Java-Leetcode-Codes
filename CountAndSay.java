import java.util.Stack;

public class CountAndSay {
    public static void main(String[] args) {
        int n=4;
        System.out.println(count(n,1,"1"));
    }
    static String count(int n,int i,String ans){
        if(i==n){
            return String.valueOf(ans);
        }
        //i++;
        int j=0;
        String ans1="";
        Stack<Character> res=new Stack<>();
        while(j<ans.length()){
            if(res.isEmpty() || res.peek()==ans.charAt(j)){
                res.push(ans.charAt(j));
            }
            else{
                int count=res.size();
                String count1=String.valueOf(count);
                ans1+=count1+res.peek();
                res.clear();
                --j;
            }
            ++j;
        }
        if(!res.isEmpty()){
            int count=res.size();
            String count1=String.valueOf(count);
            ans1+=count1+res.peek();
            res.clear();
        }

        return count(n, i+1, ans1);
    }
}
