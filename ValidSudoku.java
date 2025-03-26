public class ValidSudoku {
    public static void main(String[] args) {
        String[][] board={{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        char c='2';
        int o=(int)(c-'0');
        System.out.println(o);
        System.out.println(solve(board));
    }
    static boolean solve(String[][] board){
        int row=-1;
        int col=-1;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                int num;
                if(board[i][j]!="."){
                    num=Integer.valueOf(board[i][j]);
                    if(num>=0&&num<=9){
                        if(!isSafe(board, i, j, board[i][j])){
                            return false;
                        }
                    }
                }
                
            }
        }
        return true;
    }
    static boolean isSafe(String[][] board,int row,int col,String num){
        for(int i=0;i<board.length;i++){
            if(i!=col && board[row][i].equals(num)){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(i!=row && board[i][col].equals(num)){
                return false;
            }
        }
        //int n=3;
        int rowStart=row-row%3;
        int colStart=col-col%3;
        for(int i=rowStart;i<rowStart+3;i++){
            for(int j=colStart;j<colStart+3;j++){
                if(i!=row && j!=col && board[i][j].equals(num)){
                    return false;
                }
            }
        }
        return true;
    }
    static void display(String[][] board){
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
