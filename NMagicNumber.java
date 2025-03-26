import java.util.Scanner;

public class NMagicNumber {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.println("enter the binary number:");
        int n = in.nextInt();
        System.out.println("the magic number is :" + magic(n));
    }

    public static int magic(int n) {
        int r = 0;
        int mul = 1;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                mul *= 5;
            } else {
                mul *= 5;
                r += mul;
                n = n / 2;
            }
        }
        return r;
    }
}
