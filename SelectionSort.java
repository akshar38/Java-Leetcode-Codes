import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={2,-1,2};
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int max=-9999;
            int maxIndex=0;
            int last=arr.length-i-1;
            for(int j=0;j<last+1;j++){
                if(max<arr[j]){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            if(maxIndex!=last){
                int temp=arr[last];
                arr[last]=max;
                arr[maxIndex]=temp;
            }
            else{
                break;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
