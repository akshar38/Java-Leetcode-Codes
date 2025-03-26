import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        int ans = 1;
        if (n < 2) {
            ans = n;
        } else {
            while (n > 1) {
                int r = n % 2;
                n = n / 2;
                if (n >= 1) {
                    ans = ans * 10;
                    ans = ans + r;
                }
            }

        }

        System.out.println("binary=" + ans);
    }
}
