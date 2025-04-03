public class MaximumValueOfTriplet {
    public static void main(String[] args) {
        int[] nums={6,14,20,19,19,10,3,15,12,13,8,1,2,15,3};
        
        long maxResult=0;
         for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    long mul=(long)(nums[i]-nums[j])*nums[k];
                    if(nums[i]>nums[j] && maxResult<mul){
                        maxResult=mul;
                    }
                }
            }
        }
        System.out.println(maxResult);
    }
}
// long maxResult=0;
//         for(int i=0;i<nums.length-2;i++){
//             for(int j=i+1;j<nums.length-1;j++){
//                 for(int k=j+1;k<nums.length;k++){
//                     long mul=(long)(nums[i]-nums[j])*nums[k];
//                     if(nums[i]>nums[j] && maxResult<mul){
//                         maxResult=mul;
//                     }
//                 }
//             }
//         }
//         return maxResult;