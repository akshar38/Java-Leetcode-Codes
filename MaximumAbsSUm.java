import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumAbsSUm {
    public static void main(String[] args) {
        int[] arr={-3,-5,-3,-2,-6,3,10,-10,-8,-3,0,10,3,-5,8,7,-9,-9,5,-8};
        //List<List<Integer>> r=subset(arr);

        int res=subsetDuplicate(arr);
        System.out.println(res);
    }
    static int subsetDuplicate(int[] arr){
        int maxAbsSum=0;
        //Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j];
                if(Math.abs(sum)>maxAbsSum){
                    //System.out.println("sum="+sum+", j="+j);
                    maxAbsSum=Math.abs(sum);
                }
            }
            
        
        
        return maxAbsSum;
    }
    
}
