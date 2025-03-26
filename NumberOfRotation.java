public class NumberOfRotation {
    public static void main(String[] args) {
        int[] nums = { 2,3,4,1};
        int ans;
        int target = 1;
        int peakIndex = sortIndex(nums);
        System.out.println("peak=" + peakIndex);
        int result=nums.length-peakIndex-1;
        System.out.println("number of rotation = "+result);
    }

    public static int sortIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (end > mid && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[start] == arr[end]) {
                start += 1;
                end -= 1;
            }
            if (start < mid && arr[mid] > arr[start]) {
                start = mid + 1;
            }
            if (end > mid && arr[mid] < arr[end]) {
                end = mid - 1;
            }
        }
        return start;
    }
}
