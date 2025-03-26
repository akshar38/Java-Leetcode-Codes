import number.EnterNumber;

public class Square {
    public static void main(String[] args) {
        EnterNumber e = new EnterNumber();
        int n = e.enter();
        System.out.println(sqrt(n));
    }

    static float sqrt(int n) {
        int start = 0;
        int end = n;
        float n1;
        // int result=1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int mul = mid * mid;
            if (mul == n) {
                return mid;
            } else if (mul > n) {
                end = mid - 1;
            } else {
                mid += 1;
                if (mid * mid > n) {
                    mid = mid - 1;
                    n1 = (float) n / mid;
                    float r = (mid + n1) / 2;
                    return r;
                }
                start = mid;
            }
        }

        return -1;
    }
}
