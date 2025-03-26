import java.lang.reflect.Array;
import java.util.Arrays;

public class RoatatedArray {
    public static void main(String[] args) {
        int[] nums = { 2,2,9,2,2};
        int ans;
        int target = 1;
        int peakIndex = sortIndex(nums);
        System.out.println("peak=" + peakIndex);
        if (target <= nums[peakIndex] && target >= nums[0]) {
            ans = binarySearch(nums, 0, peakIndex, target);
        } else {
            ans = binarySearch(nums, peakIndex + 1, nums.length - 1, target);
        }
        System.out.println(ans);
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

    public static int binarySearch(int[] nums, int start, int end, int num) {
        // int mid = (start + end) / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (num == nums[mid]) {
                return mid;
            } else if (num > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
