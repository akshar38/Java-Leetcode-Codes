import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            boolean swap = false;
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap = true;
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (swap != true) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
