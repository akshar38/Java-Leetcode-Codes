import java.util.Arrays;
import java.util.List;
public class Bellman {
    public static void bellman(List<List<Edge>> graph){
        int[] distance=new int[graph.size()];
        for(int i=1;i<distance.length;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<graph.size()-1;i++){
            for(int j=0;j<graph.size();j++){
                for(int k=0;k<graph.get(i).size();k++){
                    Edge e=graph.get(i).get(k);
                    int u=e.src;
                    int v=e.dest;
                    
                    if(distance[u]!=Integer.MAX_VALUE && distance[u]+e.wt<distance[v]){
                        distance[v]=distance[u]+e.wt;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distance));
    }
    public static void main(String[] args) {
        DirectedGraph dg=new DirectedGraph();
        dg.creatNegativeWeightGraph();
        bellman(dg.graph);
    }
}
