import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,2,2,2,3,3};
        int i=0;
        for(int num:nums){
            if (i < 2 || num > nums[i - 2]){
                nums[i++] = num;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
