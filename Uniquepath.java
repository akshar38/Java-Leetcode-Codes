public class Uniquepath {
    public static void main(String[] args) {
        int[][] obstacleGrid={{0,0,0},{0,1,0},{0,0,0},{0,0,0}};
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++){
            if(obstacleGrid[i][0]==1){
                dp[i][0] = 0;
                break;
            }
            else{
                dp[i][0] = 1;
            }
            
        }
            
        for (int j = 0; j < n; j++){
            if(obstacleGrid[0][j]==1){
                dp[0][j] = 0;
                break;
            }
            else{
                dp[0][j] = 1;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
                
        }
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
