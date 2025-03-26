import java.util.ArrayList;
import java.util.List;
class Edge {
    int src;
    int dest;
    int wt;
    public Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
    }
}
public class UnDirectedGraph {
    
    List<List<Edge>> graph;
    void createGraph() {
        graph=new ArrayList<>();
        for(int i=0; i<7; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(0, 1, 1));
        graph.get(0).add(new Edge(0, 2, 1));

        graph.get(1).add(new Edge(1, 0, 1));
        graph.get(1).add(new Edge(1, 3, 1));

        graph.get(2).add(new Edge(2, 0, 1));
        graph.get(2).add(new Edge(2, 4, 1));

        graph.get(3).add(new Edge(3, 1, 1));
        graph.get(3).add(new Edge(3, 4, 1));
        graph.get(3).add(new Edge(3, 5, 1));

        graph.get(4).add(new Edge(4, 2, 1));
        graph.get(4).add(new Edge(4, 3, 1));
        graph.get(4).add(new Edge(4, 5, 1));
        
        graph.get(5).add(new Edge(5, 3, 1));
        graph.get(5).add(new Edge(5, 4, 1));
        graph.get(5).add(new Edge(5, 6, 1));

        graph.get(6).add(new Edge(6, 5, 1));

    }
}
