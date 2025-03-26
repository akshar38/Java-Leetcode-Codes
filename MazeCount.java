import java.util.ArrayList;
import java.util.List;

public class MazeCount {
    public static void main(String[] args) {
        boolean[][] arr=new boolean[3][3];
        
        System.out.println(countNoOfWays(arr,"",0,0));
    }
    static List<String> countNoOfWays(boolean[][] b,String s,int start,int end){
        if (start==2 && end==2) {
            //b[start][end]=true;
            ArrayList<String> r = new ArrayList<>();
            
            r.add(s);
            //System.out.println();
            return r;
        }
        List<String> l=new ArrayList<>();
            List<String> r=new ArrayList<>();
            List<String> d=new ArrayList<>();
            List<String> u=new ArrayList<>();
            List<String> down=new ArrayList<>();
        if(b[start][end]==false){
            b[start][end]=true;
            
        
            if(start<2){
                l=countNoOfWays(b,s+"D", start+1, end);
            }
            if(end<2){
                r=countNoOfWays(b,s+"R", start, end+1); 
            }
            if(start<2 && end<2){
                d=countNoOfWays(b,s+"d", start+1, end+1);
            }
            if(start>0 ){
                u=countNoOfWays(b,s+"U", start-1, end);
            }
            if(end>0 ){
                u=countNoOfWays(b,s+"L", start, end-1);
            }
            b[start][end]=false;
            l.addAll(down);
            l.addAll(u);
            l.addAll(d); 
            l.addAll(r);
        }
        return l;
    }

}
