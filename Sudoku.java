public class Sudoku {
    public static void main(String[] args) {
        String[][] board={{"5","3",".",".","7",".",".",".","."},{"6",".",".","1","9","5",".",".","."},{".","9","8",".",".",".",".","6","."},{"8",".",".",".","6",".",".",".","3"},{"4",".",".","8",".","3",".",".","1"},{"7",".",".",".","2",".",".",".","6"},{".","6",".",".",".",".","2","8","."},{".",".",".","4","1","9",".",".","5"},{".",".",".",".","8",".",".","7","9"}};
        
        if(solve(board)){
            display(board);
        }
    }
    static boolean solve(String[][] board){
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<board.length;i++){    
            for(int j=0;j<board.length;j++){
                if(board[i][j].equals(".")){
                    emptyLeft=false;
                    row=i;
                    col=j;
                    break;
                }
            }
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            return true;
        }
        
            for(int n=1;n<=9;n++){
                String s=String.valueOf(n);
                if(isSafe(board, row, col,s)){
                    board[row][col]=s;
                    if(solve(board)){
                        //display(board);
                        return true;
                    }
                    else{
                        board[row][col]=".";
                    }
                }
            }
        
        return false;
    }
    static boolean isSafe(String[][] board,int row,int col,String num){
        for(int i=0;i<board.length;i++){
            if(board[row][i].equals(num)){
                return false;
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][col].equals(num)){
                return false;
            }
        }
        //int n=3;
        int rowStart=row-row%3;
        int colStart=col-col%3;
        for(int i=rowStart;i<rowStart+3;i++){
            for(int j=colStart;j<colStart+3;j++){
                if(board[i][j].equals(num)){
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
