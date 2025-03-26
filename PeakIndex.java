public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 9, 8, 6, 3, 1 ,0};

        System.out.println("peak index of array is: " + indexSearch(arr));
    }

    public static int indexSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }
        return start;
    }
}
