import java.util.List;
public class CycleInUnDirectedGraph {
    public static boolean cycle(List<List<Edge>> graph,boolean[] visit,int parent,int curr){
        visit[curr]=true;
        for (int i = 0; i < graph.get(curr).size(); i++) {
            Edge e=graph.get(curr).get(i);
            if(visit[e.dest]==true && e.dest!=parent){
                return true;
            }
            else if(!visit[e.dest] && cycle(graph, visit, curr, e.dest)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        boolean[] visit=new boolean[6];
        UnDirectedGraph ug=new UnDirectedGraph();
        ug.createGraph();
        System.out.println(cycle(ug.graph,visit,-1,0));
    }
}
