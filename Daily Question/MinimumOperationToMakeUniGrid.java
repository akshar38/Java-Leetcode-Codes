import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class MinimumOperationToMakeUniGrid {
    public static void main(String[] args){
        int x=2;
        int[][] grid={{2}};
        int n=grid.length;
        int m=grid[0].length;
        List<Integer> arr=new ArrayList<>();
        int k=0;
        int rem=-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(rem==-1){
                    rem=grid[i][j]%x;
                    arr.add(grid[i][j]);
                }
                else if(rem==grid[i][j]%x){
                    arr.add(grid[i][j]);
                }
                else{
                    //return -1;
                }
            }
        }
        if(arr.size()==1){
            System.out.println(0);
        }
        int[] arr1 = arr.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr1);
        int med=arr1[(k-1)/2];
        int operation=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<med){
                operation+=(med-arr1[i])/x;
            }
            else{
                operation+=(arr1[i]-med)/x;
            }
        }
        System.out.println(operation);
    }
}
