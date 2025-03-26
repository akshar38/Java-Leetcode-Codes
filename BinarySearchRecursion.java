public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        String a="abc";
        StringBuilder s=new StringBuilder();
        
        int n=7;
        int length=arr.length-1;
        System.out.println(search(arr,n,0,length));
    }   
    static int search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                return search(arr, target, start, mid-1);
            }
            else{
                return search(arr, target, mid+1, end);
            }
        }
        return -1;
    }
}
