public class RotateMatrix90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length-1;
        for(int row=0;row<matrix.length/2;row++){
            int[] temp=matrix[row];
            matrix[row]=matrix[n-row];
            matrix[n-row]=temp;
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i!=j && i<j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                } 
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
