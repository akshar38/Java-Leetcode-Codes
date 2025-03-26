public class Power {
    public static void main(String[] args) {
        int n=-2147483648;
        double x=2;
        double base;
        double ans=1.0;
        if(n<0){
            base=1/x;
            n=n*(-1);
        }
        else{
            base=x;
        }
        String s="ab9d";
        String s1=s+s.charAt(1);
        int a=Integer.valueOf(s.charAt(2));
        System.out.println(a);
        while(n>0){
            if((n&1)==1){
                ans*=base;
            }
            base*=base;
            n=n>>1;

        }
        System.out.println(ans);
    }
}
