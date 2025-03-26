import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5,6,7,7 };
        // System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Duplicate Number=" + duplicate(arr, n));
    }

    static int duplicate(int[] arr, int n) {
        int i = 0;

        while (i < n) {
            if (arr[i] <= n && i != arr[i] - 1) {
                int j = arr[i] - 1;
                if (arr[i] == arr[j]) {
                    return arr[i];
                } else {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            } else {
                ++i;
            }
        }
        return -1;

    }
}
