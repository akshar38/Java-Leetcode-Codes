import java.util.*;
import java.util.List;
public class AllPath {
    public static void path(List<List<Edge>> graph,boolean[] visit,int i1,int n,List<Integer> res){
        if(i1==n){
            System.out.println(res);
        }
        for(int i=0;i<graph.get(i1).size();i++){
            Edge e=graph.get(i1).get(i);
            int curr=e.dest;
            if(!visit[curr]){
                visit[curr]=true;
                res.add(curr);
                path(graph, visit, curr, n, res);
                visit[curr]=false;
                res.remove(res.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        
        UnDirectedGraph ug=new UnDirectedGraph();
        ug.createGraph();
        boolean[] visit=new boolean[7];
        visit[0]=true;
        List<Integer> res=new ArrayList<>();
        res.add(0);
        path(ug.graph,visit,0,5,res);
    }
}
