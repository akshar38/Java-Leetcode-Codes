public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = { 1, 1, 3 };
        int index = search(arr, 2);
        System.out.println("index of element is " + index);
    }

    static int search(int[] arr1, int num) {
        // int index1;
        int start = 0;
        int end = arr1.length;
        // int mid = (start + end) / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num == arr1[mid]) {
                return mid;
            } else if (num > arr1[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr1[start];// ceiling of the number (smallest number >= target)
        // floor number = arr1[end] (greatest number >= target)

    }
}
