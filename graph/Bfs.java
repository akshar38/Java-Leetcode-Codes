import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class Bfs {
    public static void bfs(List<List<Edge>> graph, int V) {
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0); //Source = 0
        while(!q.isEmpty()) {
            int curr = q.poll();
            if(!visited[curr]) {
                System.out.print(curr+" ");
                visited[curr] = true;
                for(int i=0; i<graph.get(curr).size(); i++) {
                    Edge e = graph.get(curr).get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        UnDirectedGraph ug=new UnDirectedGraph();
        ug.createGraph();
        
        bfs(ug.graph, 7);
    }
}
