import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intervals {
    public static void main(String[] args) {
        
        int[][] intervals={{2,3}, {4,5}, {6,7}, {8,9}, {1,10}};
        
        List<List<Integer>> res=new ArrayList<>();
        int i=1; 
        //Integer[] arr=new Integer[2];
        int min=10000000;
        int max=0;
        List<Integer> res1=new ArrayList<>();
        res1.add(intervals[0][0]);
        res1.add(intervals[0][1]);
        while(i<intervals.length){
            if(res1.get(1)>=intervals[i][0] && res1.get(0)<=intervals[i][1]){
                int min1=Math.min(res1.get(0),intervals[i][0]);
                int max1=Math.max(res1.get(1),intervals[i][1]);
                res1.set(0,min1);
                res1.set(1,max1);
            }
            else{
                res.add(new ArrayList<>(res1));
                res1.clear();
                res1.add(intervals[i][0]);
                res1.add(intervals[i][1]);
            }
            ++i;
        }
        if(!res.contains(res1)){
            res.add(new ArrayList<>(res1));
        }
        for(List l:res){
            System.out.println(l);
        }
        
    }
}
