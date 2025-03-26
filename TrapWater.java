public class TrapWater {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        int[] arr=new int[height.length];
        int res=0;
        int sum1=res;
        for(int i=0;i<height.length;i++){
            int num=height[i];
            if(num!=0){
                int index=i;
                arr[i]=0;
                i++;
                sum1=res;
                System.out.println(sum1+" "+res );
                while(i<height.length && num>height[i]){
                    arr[i]=num-height[i];
                    res+=num-height[i];
                    i++;
                }
                if(i==height.length && num>height[i-1]){
                    //System.out.println(res);
                    arr[i-1]=0;
                    res=sum1;
                    res+=sumOfHeight(index,arr,height);
                }
                else{
                    sum1=res;
                    --i;
                }
            }
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" i="+i);
        }
        System.out.println(res);
        
    
    }
    public static int sumOfHeight(int index,int[] arr,int[] height){
        int sum=0;
        //int i=height.length-1;
        for(int i=height.length-1;i>index;i--){
            int num=height[i];
            arr[i]=0;
            if(num!=0){
                --i;
                while(i>index && num>height[i]){
                    arr[i]=num-height[i];
                    sum+=num-height[i];
                    i--;
                }
                ++i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
