import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestDivisibleSubset {
    public static void main(String[] args) {
        int[] nums={5,9,18,54,108,540,90,180,360,720};
        Arrays.sort(nums);
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        
        int max=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                    if(max<dp[i]){
                        max=dp[i];
                    }
                }
            }
        }
        int prev=-1;
        int[] res=new int[max];
        for(int i=n-1;i>=0;i--){
            if(max==dp[i] && (prev%nums[i]==0 || prev==-1)){
                res[max-1]=nums[i];
                max--;
                prev=nums[i];
            }
        }
        List<Integer> list = Arrays.stream(res)         // Create IntStream from int[]
                           .boxed()             // Convert int to Integer
                           .collect(Collectors.toList());
        System.out.println(list);
    }
    
}
