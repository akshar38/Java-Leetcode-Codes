import java.util.LinkedList;
import java.util.Queue;
public class MaxArea {
    public static void main(String[] args) {
        int[][] grid = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int area=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int ans=bfs(grid,i,j);
                    area=Math.max(area,ans);
                }
            }
        }
        System.out.println(area);
    }   
    public static int bfs(int[][] grid,int i1,int j){
        int area=0;
        Queue<int[]> q=new LinkedList<>();
        grid[i1][j]=0;
        q.add(new int[]{i1,j});
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            
            ++area;
            int[] index=q.poll();
            for(int i=0;i<dir.length;i++){
                int row=index[0]+dir[i][0];
                int col=index[1]+dir[i][1];
                if(isSafe(row,col,grid)){
                    grid[row][col]=0;
                    q.add(new int[]{row,col});
                }
            }    
        }
        return area;
    }
    public static boolean isSafe(int row,int col,int[][] grid){
        return row>=0 && col>=0 && row<grid.length && col<grid[0].length && grid[row][col]==1;
    }
}
