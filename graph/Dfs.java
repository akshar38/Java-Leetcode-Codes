
import java.util.List;

public class Dfs {
    public static void dfs(boolean[] visit,List<List<Edge>> graph,int curr){
        if(visit[curr]){
            return;
        }
        visit[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph.get(curr).size();i++){
            Edge e=graph.get(curr).get(i);
            dfs(visit, graph, e.dest);        
        }
    }
    public static void main(String[] args) {
        boolean[] visit=new boolean[7];
        UnDirectedGraph ug=new UnDirectedGraph();
        ug.createGraph();
        dfs(visit,ug.graph,0);
    }
}
