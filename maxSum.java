import java.util.ArrayList;
import java.util.HashMap;

public class maxSum {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        int[] nums={229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401};
        ArrayList<Integer> sum=new ArrayList<>();
        int sum1=0;
        
        int max=-1;
        for(int i=0;i<nums.length;i++){
            int r=sumOfDigit(nums[i]);
            if(i>0){
                int index=indexInArray(sum,r);
                if(index>=0){
                    System.out.println("index="+index+"i="+i);
                    sum1=nums[i]+nums[index];
                    System.out.println("sum="+sum1);
                    if(max<sum1){
                        max=sum1;
                        sum1=0;
                    }
                }
            }
            sum.add(r);
        }
        System.out.println(max);
        System.out.println(sum);
    }
    static int indexInArray(ArrayList<Integer> s,int target){
        int r=-1;
        int max=0;
        for(int i=0;i<s.size();i++){
            if(s.get(i)==target && s.get(i)>max){
                r=i;
                max=s.get(i);
                
            }
        }
        return r;
    }
    static int sumOfDigit(int a){
        int r=0;
        while (a>0) {
            int rem=a%10;
            a=a/10;
            r+=rem;
        }
        return r;
    }
}
