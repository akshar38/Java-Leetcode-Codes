public class MaximumValueOfTriplet2 {
    public static void main(String[] args) {
        int[] nums={6,14,20,19,19,10,3,15,12,13,8,1,2,15,3};
        long res=0;
        int n=nums.length-1;
        int[] preMax=new int[n+1];
        int[] suffMax=new int[n+1];
        max(preMax,suffMax,nums);
        for(int i=0;i<n;i++){
            long res1=(long)(preMax[i]-nums[i])*suffMax[i];
            if(res<res1){
                res=res1;
            }
        }
        System.out.println(res);
    }
    public static int max(int[] p,int[] s,int[] nums){
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                p[i]=max;
            }
            max=Math.max(max,nums[i]);
        }
        max=0;
        int n=nums.length-1;
        for(int i=n;i>0;--i){
            if(i!=n){
                s[i]=max;
            }
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    
}
