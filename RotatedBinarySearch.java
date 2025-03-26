import java.util.Arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr={5,7,8,9,1,2,3,4};
        int target=3;
        int start=0;
        int end=arr.length-1;
        System.out.println("Index of target is "+ search(arr,target,start,end));
    }
    static int search(int[] arr,int n,int start,int end){
        if(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(arr[start]<arr[mid]){
                if(arr[start]<=n && n<arr[mid]){
                    end=mid-1;
                    return search(arr, n,start,end);
                }
                else{
                    start=mid+1;
                    return search(arr, n,start,end);
                }
            }
            else{
                if(arr[mid]<n && arr[end]>=n){
                    start=mid+1;
                    return search(arr, n,start,end);
                }
                else{
                    end=mid-1;
                    return search(arr, n,start,end);
                }
            }
        }        
        return -1;
    }
}
