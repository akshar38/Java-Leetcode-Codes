import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        n = 2 * n;
        pattern1(n);
        pattern2(n);
    }

    static void pattern2(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                int atEveryIndex = Math.max(Math.max(i-2, j- 2), Math.max((n - i)- 2, (n - j)-2));
                System.out.print(atEveryIndex + " ");
            }
            System.err.println();
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n - i, n - j));
                System.out.print(atEveryIndex + " ");
            }
            System.err.println();
        }
    }

}
