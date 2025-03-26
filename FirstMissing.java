import java.util.Arrays;

public class FirstMissing {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 2 };
        System.out.println("smallest missing number is " + missing(arr));
    }

    public static int missing(int[] arr) {
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int j = arr[i] - 1;
            if (j >= 0 && j < n && arr[i] != arr[j]) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else {
                ++i;
            }
        }
        //System.out.println(Arrays.toString(arr));
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return n+1;
    }
}
