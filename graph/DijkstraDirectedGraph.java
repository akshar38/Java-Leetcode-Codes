import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
public class DijkstraDirectedGraph {
    public static class Pair implements Comparable<Pair>{
        int node;
        int dis;
        Pair(int n,int d){
            node=n;
            dis=d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dis-p2.dis;
        }
    }
    public static void path(List<List<Edge>> graph,int[] distance){
        boolean[] visit=new boolean[graph.size()];
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            if(!visit[curr.node]){
                visit[curr.node]=true;
                for(int i=0;i<graph.get(curr.node).size();i++){
                    Edge e=graph.get(curr.node).get(i);
                    int u=e.src;
                    int v=e.dest;
                    if(distance[u]+e.wt<distance[v]){
                        distance[v]=distance[u]+e.wt;
                        pq.add(new Pair(v, distance[v]));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        DirectedGraph dg=new DirectedGraph();
        dg.createGraph();
        int[] distance=new int[dg.graph.size()];
        for (int i = 1; i < distance.length; i++) {
            distance[i]=Integer.MAX_VALUE;
        }
        path(dg.graph,distance);
        System.out.println(Arrays.toString(distance));
    }
}
