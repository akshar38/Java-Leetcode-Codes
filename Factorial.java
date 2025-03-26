import number.EnterNumber;

public class Factorial {
    public static void main(String[] args) {
        EnterNumber e = new EnterNumber();
        int n = e.enter();
        System.out.println("Factorial of " + n + " is " + fact(n));
    }

    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}
