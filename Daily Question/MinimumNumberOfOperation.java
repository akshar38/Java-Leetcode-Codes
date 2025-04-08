import java.util.HashMap;

public class MinimumNumberOfOperation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int index=map.get(nums[i]);
                while(start<=index){
                    count++;
                    start+=3;
                }
                map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
    }
}
