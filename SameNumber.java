import java.util.Scanner;

public class SameNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 15 digit number: ");
        int n = in.nextInt();
        System.out.println("Enter the number to find occurence: ");
        int f = in.nextInt();
        int count = 0;
        while (n != 0) {
            int number = n % 10;
            if (number == f) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(f + " The number occured : " + count + " times");
    }
}
