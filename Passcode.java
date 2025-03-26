public class Passcode {
    public static void main(String args[]) {
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int i = 0;
        while (i < 10) {
            fourth = i;
            third = fourth + 1;
            second = third - 2;
            first = second + 1;
            //System.out.println(first + " " + second + " " + third + " " + fourth);
            if (0 <= first && first <= 9 && 0 <= second && second <= 9 && 0 <= third
                    && third <= 9 && 0 <= fourth
                    && fourth <= 9) {
                break;
            } else {
                ++i;
            }
        }
        System.out.println(first + " " + second + " " + third + " " + fourth);
    }
}
