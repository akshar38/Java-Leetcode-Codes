import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = in.nextInt();
        int reverse = 0;
        while (number != 0) {
            int r = number % 10;
            reverse = (reverse * 10) + r;
            number = number / 10;
        }
        System.out.println("The reverse number is: " + reverse);
    }
}
