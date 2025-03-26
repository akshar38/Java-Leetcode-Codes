public class PowerofTwo {
    public static void main(String[] args) {
        int n = 531441;

        if ((n & n - 1) == 0) {
            System.out.println(n + " is power of 2");
        }
        System.out.println(n & n-3);

    }
}
