import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the number");
        int n = in.nextInt();
        int originalNumber = n;
        int digit;
        int result = 0;
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            int temp = digit * digit * digit;
            result += temp;
        }
        System.out.println(result);
        if (originalNumber == result) {
            System.out.println("The number eneterd is armstrong number");
        } else {
            System.out.println("The number eneterd is not armstrong number");
        }
    }
}