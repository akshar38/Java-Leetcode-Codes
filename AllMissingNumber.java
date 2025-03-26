import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3,3,3 };
        // System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println("Missing Number=" + Arrays.toString(missingNo(arr, n).toArray()));
    }

    static List<Integer> missingNo(int[] arr, int n) {
        int i = 0;
        
        while (i < n) {
            if (arr[i] <= n && i != arr[i] - 1) {
                int j = arr[i] - 1;
                if(arr[i]==arr[j]){
                    ++i;
                }
                else{
                    int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                }

            } else {
                ++i;
            }
        }
        List<Integer> arr1=new ArrayList<>();
        System.out.println(Arrays.toString(arr));
        for (int j = 0; j < n; j++) {
            if (arr[j] != j+ 1) {
                arr1.add(j+ 1);
            }
        }
        return arr1;
    }
}