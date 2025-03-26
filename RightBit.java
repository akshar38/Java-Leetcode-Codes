import java.util.Scanner;

public class RightBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the binary number:");
        int n = in.nextInt();
        System.out.println("right most bit is :" + right(n));
        // System.out.println(n << 1);
    }

    static int right(int n) {
        int n1 = ~n + 1;

        return n & n1;
        // return result;
    }
}
