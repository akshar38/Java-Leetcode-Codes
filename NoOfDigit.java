public class NoOfDigit {
    public static void main(String[] args) {
        int n = 10;
        int b = 10;
        int r = (int) (((Math.log(n)) / (Math.log(b))) + 1);
        System.out.println("no of digits = " + r);
    }
}
