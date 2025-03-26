import java.util.ArrayDeque;
import java.util.Queue;

public class largestRectangle {
    public static void main(String[] args) {
        int[] heights={2,1,5,6,2,3};
    
        if(heights.length==1){
            System.out.println(heights[0]);
        }
        int max=0;
        int max1=0;
        int max2=0;
        for(int i=0;i<heights.length;i++){
            int a=heights[i];
            int flag=0;
                    
            for(int j=i;j>=0;j--){
                if(a>heights[j]){
                    //flag=i+1;
                    break;
                }
                flag=i-j+1;
            }
            max1=a*flag;
            flag=0;
            for(int k=i+1;k<heights.length;k++){
                if(a>heights[k]){
                    //flag=k+1;
                    break;
                }
                flag=k-i;
            }
            max2=a*flag;
            if(max<max1+max2){
                max=max1+max2;
            }

        }
        System.out.println(max);
    }
}
