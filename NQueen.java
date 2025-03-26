public class NQueen {
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        System.out.println(queen(board,0));
    }
    static int queen(boolean[][] board,int row){
        
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }
    static boolean isSafe(boolean[][] b,int row,int col){
        for(int i=0;i<row;i++){
            if(b[i][col]){
                return false;
            }
        }
        int min=Math.min(row, col);
        for(int i=1;i<=min;i++){
            if(b[row-i][col-i]){
                return false;
            }
        }
        int minr=Math.min(row, b.length-col-1);
        for(int i=1;i<=minr;i++){
            if(b[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    static void display(boolean[][] b){
        for(int r=0;r<b.length;r++){
            for(int c=0;c<b.length;c++){
                if(b[r][c]==true){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
