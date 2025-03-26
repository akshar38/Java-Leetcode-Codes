import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {50,60,70,80},
            {90,100,110,120},
            {130,140,150,160}
        };
        System.out.println(Arrays.toString(search(arr,100)));
    }
    public static int[] search(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        //System.out.println("1="+arr[r][0]+"last="+arr[r][c]);
        while(r<arr.length){
            
            if(arr[r][0]<=target && target<=arr[r][c]){
                int start=0;
                int end=c;
                while(start<end){
                    int mid=start+(end-start)/2;
                    if(arr[r][mid]==target){
                        return new int[]{r,mid};
                    }
                    else if(arr[r][mid]>target){
                        end=mid;
                    }
                    else{
                        start=mid+1;
                    }
                }
                System.out.println("start="+start+"end="+end);
                return new int[]{-1,-1};
            }
            else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
