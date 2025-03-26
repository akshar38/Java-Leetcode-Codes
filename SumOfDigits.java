import number.EnterNumber;

public class SumOfDigits {
    static int sum = 0;

    public static void main(String[] args) {
        EnterNumber e = new EnterNumber();
        int n = e.enter();
        System.out.println("the sum of digits : " + sum(n));
        String s="";
        
        System.out.println("the reverse of digits : " + reverse(n));
    }

    static int sum(int n) {
        if (n < 10) {
            return n;
        }
        int r = n % 10;
        n = n / 10;
        return r + sum(n);
    }

    static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int digit = (int) (Math.log10(n) + 1);
        int p = (int) Math.pow(10, digit - 1);
        //System.out.println("p=" + p);
        int r = n % 10;
        // sum = sum * 10 + r;
        return r * p + reverse(n / 10);

    }
}
