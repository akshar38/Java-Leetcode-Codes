import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = in.nextInt();
        if ((n & 1) == 0) {
            System.out.println(n + " is even number.");
        } else {
            System.out.println(n + " is odd number.");
        }
    }
}
