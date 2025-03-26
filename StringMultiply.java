public class StringMultiply {
    public static void main(String[] args) {
        String num1="2";
        String num2="3";
        
        String r="";
        int l1=num1.length();
        int l2=num2.length();
        int i;
        int j;
        //int count=1;
        if(l1>l2){
            i=l1-1;
            j=l2-1;
            r=multiply(num1,num2,j,i);
        }
        else{
            i=l2-1;
            j=l1-1;
            r=multiply(num1,num2,i,j);
        }
        System.out.println("multiply= "+r);
    }
    static String multiply(String n1,String n2,int i,int j){
        String r="";
        int count=1;
        while(i>=0){
            int a=(int)(n1.charAt(i)-'0');
            while(j>=0){
                //int b=
            }
        }
        return r;
    }
}
