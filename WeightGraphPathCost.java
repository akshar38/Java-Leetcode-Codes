
import java.util.*;

public class WeightGraphPathCost {
    public static void main(String[] args) {
        int[][] edges={{0,1,7},{1,3,7},{1,2,1}};
        int[][] query={{0,3},{3,4}};
        boolean[] visit=new boolean[100000];
        List<Integer> res=new ArrayList<>();
        path(edges,visit,0,3,res);
    }
    public static void path(int[][] edges,boolean[] visit,int start,int target,List<Integer> res){
        if(start==target){
            res.add(target);
            System.out.println(res);
            //res.remove(res.size()-1);
            
        }
        else{
            for(int i=start;i<edges.length;i++){
                if(!visit[i]){
                    res.add(i);
                    visit[i]=true;
                    path(edges, visit, edges[start][1], target, res);
                    visit[i]=false;
                    res.remove(res.size()-1);
                }
            }
        }
    }
}

