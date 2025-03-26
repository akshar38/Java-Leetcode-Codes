import java.util.ArrayList;
import java.util.List;

public class NiceArray{
    public static void main(String[] args) {
        int[] nums={84139415,693324769,614626365,497710833,615598711,264,65552,50331652,1,1048576,16384,544,270532608,151813349,221976871,678178917,845710321,751376227,331656525,739558112,267703680};
        int size=0;
        int bitMask=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(bitMask==0){
                res.add(nums[i]);
                bitMask|=nums[i];
            }
            int j=i+1;
            while((j<nums.length) && ((bitMask & nums[j]) == 0)){
                res.add(nums[j]);
                bitMask|=nums[j];
                ++j;
            }
            bitMask=0;
            size=Math.max(size,j-i);
            
        }
        System.out.println(size);
    }
}