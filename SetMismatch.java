import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 7,10,1 };
        // System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Duplicate Number=" + Arrays.toString(duplicate(arr, n).toArray()));
    }

    static List<Integer> duplicate(int[] arr, int n) {
        int i = 0;
        List<Integer> arr1 = new ArrayList<>();
        while (i < n) {
            int j = arr[i] - 1;
            if (arr[i]>0 && j>=0 && j<n && arr[j] != arr[i]) {
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
                    arr1.add(j+1);
                }
            }
        return arr1;

    }
}
