public class CountGoodInteger {
    public static void main(String[] args) {
        int n=50;
        System.out.println(countGoodNumbers(n));
    }

    static final int MOD = 1_000_000_007;

    public static int countGoodNumbers(long n) {
        long mul = n / 2;
        long num1 = modPow(5, n - mul, MOD);  // Digits at even indices
        long num2 = modPow(4, mul, MOD);      // Digits at odd indices
        return (int)((num1 * num2) % MOD);
    }

    // Modular exponentiation function
    private static long modPow(long base, long exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
