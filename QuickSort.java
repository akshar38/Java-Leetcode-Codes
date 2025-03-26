import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr1 = { 4, 1, 2, 3, 8, 6, 5, 7, 9 };
        sort(arr1, 0, arr1.length - 1);
        System.out.println("Soretd Array is " + Arrays.toString(arr1));
    }

    static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int l = start;
        int h = end;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];
        while (start <= end) {
            while (arr[start] < pivot) {
                ++start;
            }
            while (arr[end] > pivot) {
                --end;
            }
            if (start <= end) {
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                ++start;
                --end;
            }
        }
        sort(arr, l, end);
        sort(arr, start, h);
    }
}
