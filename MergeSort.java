import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={4,1,2,2,3,8,6,2,5,7,9,1};
        System.out.println("Soretd Array is "+Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=sort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int i=0;int j=0;int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                result[k++]=left[i++];
            }
            else{
                result[k++]=right[j++];
            }
        }
        while (i<left.length) {
            result[k++]=left[i++];
        }
        while (j<right.length) {
            result[k++]=right[j++];
        }
        return result;
    }
}
