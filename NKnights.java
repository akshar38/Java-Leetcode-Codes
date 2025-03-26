public class NKnights {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        knight(board,0,0,4);
    }
    static void knight(boolean[][]board,int row,int col,int k){
        if (k==0) {
            display(board);
            System.out.println();
            return;
        }

        //int count = 0;
        if(row==board.length-1 && col==board.length){
            return;
        }
        // placing the knight and checking for every row and col
        if(col==board.length){
            knight(board, row+1, 0, k);
            return;
        }
        // place the knight if it is safe
        if(isSafe(board, row, col)) {
            board[row][col] = true;
            knight(board, row ,col+1,k-1);
            board[row][col] = false;
        }
        knight(board, row, col+1, k);
    }
    static boolean isSafe(boolean[][] b,int row,int col ){
        if(isValid(b, row-2, col-1)){
            if(b[row-2][col-1]){
                return false;
            }
        }
        if(isValid(b, row-2, col+1)){
            if(b[row-2][col+1]){
                return false;
            }
        }
        if(isValid(b, row-1, col-2)){
            if(b[row-1][col-2]){
                return false;
            }
        }
        if(isValid(b, row+1, col-2)){
            if(b[row+1][col-2]){
                return false;
            }
        }
        if(isValid(b, row+2, col-1)){
            if(b[row+2][col-1]){
                return false;
            }
        }
        if(isValid(b, row+2, col+1)){
            if(b[row+2][col+1]){
                return false;
            }
        }
        if(isValid(b, row+1, col+2)){
            if(b[row+1][col+2]){
                return false;
            }
        }
        if(isValid(b, row-1, col+2)){
            if(b[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean[][] b,int row,int col){
        if(row>=0 && col<=b.length-1 && col>=0 && row<=b.length-1){
            return true;
        }
        
        return false;
        
    }
    static void display(boolean[][] b){
        for(int r=0;r<b.length;r++){
            for(int c=0;c<b.length;c++){
                if(b[r][c]==true){
                    System.out.print("K ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
