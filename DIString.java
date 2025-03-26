import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class DIString {
    public static void main(String[] args){
        String a="IDID";
        String num="";
        int flag=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<a.length();i++){
            stack.push(i+1);
            char c=a.charAt(i);
            if(c=='I'){
                while(!stack.isEmpty()){
                    String s=String.valueOf(stack.pop());
                    num+=s;
                }
            }
            flag=i+1;
        }
        stack.push(flag+1);
        while(!stack.isEmpty()){
            String s=String.valueOf(stack.pop());
            num+=s;
        }
        System.out.println(num);
    }
}
