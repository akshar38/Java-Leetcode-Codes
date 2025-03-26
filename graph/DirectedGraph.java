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

public class DirectedGraph {
    public List<List<Edge>> graph;  // <-- make it public

    void createGraph() {
        graph = new ArrayList<List<Edge>>(); // Specify the type explicitly
        for (int i = 0; i < 5; i++) {   // initialize for 6 vertices
            graph.add(new ArrayList<Edge>()); // Specify the type explicitly
        }

        // graph.get(0).add(new Edge(0, 1, 2));
        // graph.get(0).add(new Edge(0, 2, 4));

        // graph.get(1).add(new Edge(1, 3, 7));
        // graph.get(1).add(new Edge(1, 2, 1));

        // graph.get(2).add(new Edge(2, 4, 3));

        // graph.get(3).add(new Edge(3, 5, 1));

        // graph.get(4).add(new Edge(4, 3, 2));
        // graph.get(4).add(new Edge(4, 5, 5));
        graph.get(0).add(new Edge(0, 1, 100));
        

        
        graph.get(1).add(new Edge(1, 2, 100));
        graph.get(1).add(new Edge(1, 3, 600));

        graph.get(2).add(new Edge(2, 3, 200));
        graph.get(2).add(new Edge(2, 0, 100));
        graph.get(2).add(new Edge(2, 4, 400));

        graph.get(3).add(new Edge(3, 4, 600));
    }
}
