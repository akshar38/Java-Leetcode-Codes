public class Minoperation {
    public static void main(String[] args) {
        int[] nums={1,0,0,1,1,0,1,1,1,0,0,0,1,0,1};
        int count=0;
        int freq=0;
        int j=0;
        int n=2;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                n=i+2;
                j=i;
                if(n<nums.length){
                    while(j<=n){
                        if(nums[j]==0){
                            nums[j]=1;
                            ++freq;
                            System.out.println("j="+j+", frq of 1="+freq);
                        }
                        else{
                            nums[j]=0;
                        }
                        ++j;
                    }
                    if(j==n+1){
                        count+=1;
                    }
                }
                System.out.println("count="+count+", frq of 1="+freq);
            }
            else{
                if(i>=j){
                    ++freq;
                }
            }
        }
        System.out.println(freq+" "+nums.length);
        if(freq==nums.length){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
    }
}
