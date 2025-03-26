import java.util.*;
import java.util.LinkedList;
public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid={{2,1,1},{1,1,0},{0,1,1}};
        int time=0;
        Queue<int[]> rotten=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    rotten.add(new int[]{i,j});
                }
            }
        }
        
        int[][] dir={{-1,0},{1,0},{0,1},{0,-1}};
        while (!rotten.isEmpty()) { 
            int queueSize=rotten.size();
            while(queueSize-->0){
                int[] index=rotten.poll();
                for(int i=0;i<dir.length;i++){
                    int row=index[0]+dir[i][0];
                    int col=index[1]+dir[i][1];
                    if(isSafe(row,col,grid)){
                        if(grid[row][col]==1){
                            grid[row][col]=2;
                            rotten.add(new int[]{row,col});
                        }
                    }
                }
            }
            if(!rotten.isEmpty()){
                ++time;
            }
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    System.out.println(-1);
                }
            }
        }
        System.out.println(time);
        //return time;
    }
    public static boolean isSafe(int row,int col,int[][] grid){
        return row>=0 && col>=0 && row<grid.length && col<grid[0].length;
    }
    
}
