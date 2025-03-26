public class SpiralMatrix {
    public static void main(String[] main){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int left=0,top=0,bottom=matrix.length-1,right=matrix[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.err.print(matrix[left][i]+"");
            }
            for(int i=left+1;i<=bottom;i++){
                System.err.print(matrix[i][right]+"");
            }
            if (top!=bottom) {
                for(int i=right-1;i>=left;i--){
                    System.err.print(matrix[bottom][i]+"");
                }
            }
            top++;
            if (left!=right) {
                for(int i=bottom-1;i>=top;i--){
                    System.err.print(matrix[i][left]+"");
                }
            }
            left++;
            right--;
            bottom--;
        }
    } 
    
}
