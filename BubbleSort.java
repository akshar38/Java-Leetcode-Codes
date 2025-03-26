import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int length = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            boolean swap=false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap=true;
                }
            }
            if(swap!=true){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}