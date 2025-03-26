import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int n = 2;
        int[] maxMinArr = new int[2];
        maxMinArr = maxMinSumArr(arr);
        System.out.println(Arrays.toString(maxMinArr));
        System.out.println(minSum(arr, maxMinArr, n));
    }

    public static int[] maxMinSumArr(int[] arr) {
        int[] arr1 = new int[2];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        arr1[0] = max;
        arr1[1] = sum;
        return arr1;
    }

    public static int minSum(int[] arr, int[] arr1, int n) {
        int start = arr1[0];
        int end = arr1[1];
        while (start < end) {

            int mid = start + (end - start) / 2;
            System.out.println("start=" + start + " end=" + end + " mid=" + mid);
            int sum = 0;
            int count = 1;
            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    count++;
                } else {
                    sum += arr[i];
                }
                System.out.println("sum=" + sum);
            }
            System.out.println("count=" + count);
            if (count > n) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
