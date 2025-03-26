public class TargetSearchInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = { 1, 2, 3, 5, 6, 9, 5, 4, 2, 1 };
        int target = 2;
        int peakIndex = peakIndexSearch(mountainArr);
        // System.out.println("index is:" + peakIndex);
        int targetIndex = BinarySearch(mountainArr, 0, peakIndex, target);
        int targetIndex2 = -1;
        if (targetIndex == -1) {
            targetIndex2 = BinarySearch2(mountainArr, peakIndex, mountainArr.length - 1, target);
            System.out.println("index is:" + targetIndex2);
        } else {
            System.out.println("index is:" + targetIndex);
        }

    }

    public static int min(int num1, int num2) {
        if (num1 < num2 && num1 != -1) {
            return num1;
        } else if (num1 > num2 && num2 != -1) {
            return num2;
        } else {
            if (num1 > num2) {
                return num2;
            } else {
                return num1;
            }
        }
    }

    public static int peakIndexSearch(int[] arr) {
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

    public static int BinarySearch(int[] arr1, int start1, int end1, int target) {
        int start = start1;
        int end = end1;
        // int mid = (start + end) / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr1[mid]) {
                return mid;
            } else if (target > arr1[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int BinarySearch2(int[] arr1, int start1, int end1, int target) {
        int start = start1;
        int end = end1;
        // int mid = (start + end) / 2;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr1[mid]) {
                return mid;
            } else if (target < arr1[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
