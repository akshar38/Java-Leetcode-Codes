import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = { 0,5,4,2,1 };
        //System.out.println(Arrays.toString(arr));
        int n=5;
        System.out.println("Missing Number="+missingNo(arr,n));
    }
    static int missingNo(int[] arr,int n){
        int i = 0;
        while (i < n) {
            if (i != arr[i] && arr[i]<n) {
                int j = arr[i];
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else {
                ++i;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j=0;j<n;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }
}
