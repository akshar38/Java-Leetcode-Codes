import java.util.List;
import java.util.Stack;
public class CycleInDirectedGraph {
    public static boolean cycle(List<List<Edge>> graph,boolean[] visit,boolean[] rec,int curr){
        visit[curr]=true;
        rec[curr]=true;
        for(int i=0;i<graph.get(curr).size();i++){
            Edge e=graph.get(curr).get(i);
            if(rec[e.dest]){
                return true;
            }
            else if(!visit[e.dest] && cycle(graph, visit, rec, e.dest)){
                return true;
            }
        }
        rec[curr]=false;
        return false;
    }
    public static void sort(List<List<Edge>> graph,boolean[] visit,Stack<Integer> s,int curr){
        visit[curr]=true;
        
        for(int i=0;i<graph.get(curr).size();i++){
            Edge e=graph.get(curr).get(i);
            if(!visit[e.dest]){
                sort(graph, visit, s, e.dest);
                //s.add(curr);
            }
        }
        s.add(curr);
    }
    public static void main(String[] args) {
        boolean[] visit=new boolean[4];
        boolean[] rec=new boolean[4];
        DirectedGraph dg=new DirectedGraph();
        dg.createGraph();
        System.out.println(cycle(dg.graph,visit,rec,0));
        Stack<Integer> s=new Stack<>();
        sort(dg.graph,new boolean[4],s,0);
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
}
