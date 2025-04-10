import java.util.Stack;

public class ValidNumber {
    public static void main(String[] args) {
        boolean flag=true;
        String s="e1.23";
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int num=c-'0';
            if(stack.isEmpty()){
                
                if(c=='+'||c=='-'||c=='.'|| num>=0 && num<=9){
                    stack.push(c);
                }
                else{
                    flag=false;
                    break;
                } 
            }  
            else {
                if((c=='+'||c=='-') && (stack.peek()=='e' || stack.peek()=='E')){
                    stack.push(c);
                }
                else if((c=='e' || c=='E') && !stack.contains(c)){
                    stack.push(c);
                }
                else if(c=='.' && !stack.contains(c) && !stack.contains('e') && !stack.contains('E')){
                    stack.push(c);
                }
                else if(num>=0 && num<=9 ){
                    stack.push(c);
                }
                else{
                    flag=false;
                    break;
                }

            }
            
        }
        if(flag){
            System.out.println("Valid Number");
        }
        else{
            System.out.println("Invalid ");
        }
    }
}
