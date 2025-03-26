import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class CountCompleteCompGraph {
    public static void main(String[] args) {
        int n=6;
        int[][] edges={{0,1},{0,2},{1,2},{3,4}};        
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int node=edges[i][0];
            int neighbour=edges[i][1];
            graph.get(node).add(neighbour);
            graph.get(neighbour).add(node);
        }
        
        int count=0;
        boolean[] visit=new boolean[n];
        for(int i=0;i<graph.size();i++){
            if(!visit[i]){
                int[] edgeNode=dfs(visit,0,0,graph,i);
                if(edgeNode[0]==edgeNode[1]*(edgeNode[1]-1)){
                    count++;
                }
            }
        }
        System.out.println(count);
        //return count;
    }
    public static int[] dfs(boolean[] visit,int nodes,int edges,List<List<Integer>> graph,int i){
        Queue<Integer> q=new LinkedList<>();
        visit[i]=true;
        q.add(i);
        while(!q.isEmpty()){
            nodes++;
            int i1=q.poll();
            for(int j=0;j<graph.get(i1).size();j++){
                edges++;  
                int n1=graph.get(i1).get(j);
                if(!visit[n1]){
                    visit[n1]=true;
                    q.add(n1);
                }
            }
        }
        return new int[]{edges,nodes};
    }
    
}
