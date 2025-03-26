import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);    
    }
}
