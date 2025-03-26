import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
        System.out.println(Arrays.toString(arr));
        int i = 0;
        while (i < arr.length) {
            if (i != arr[i] - 1) {
                int j = arr[i] - 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else {
                ++i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
