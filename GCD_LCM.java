import number.EnterNumber;

public class GCD_LCM {
    public static void main(String[] args) {
        EnterNumber e=new EnterNumber();
        int n1=e.enter();
        int n2=e.enter();
        int result=gcd(n1,n2);
        System.out.println("GCD = "+result);
        System.out.println("LCM = "+lcm(n1,n2,result));
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a,int b,int r){
        return ((a/r)*(b/r)*r);
    }

}
