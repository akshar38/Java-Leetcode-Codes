import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        // System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Duplicate Number=" + Arrays.toString(duplicate(arr, n).toArray()));
    }

    static List<Integer> duplicate(int[] arr, int n) {
        int i = 0;
        List<Integer> arr1 = new ArrayList<>();
        while (i < n) {
            int j = arr[i] - 1;
            if (arr[j] != arr[i]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else {
                ++i;
            }
        }
        System.out.println(Arrays.toString(arr));
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != j + 1) {
                    arr1.add(arr[j]);
                }
            }
        return arr1;

    }
}
