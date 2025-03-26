import java.util.ArrayList;
import java.util.List;
public class Queen {
    
    public static void main(String[] args) {
        boolean[][] board=new boolean[4][4];
        List<List<String>> r=new ArrayList<>();
        queen(r,board,0);
        for(List l:r){
            System.out.println(l);
        }
    }
    static void queen(List<List<String>> res,boolean[][] board,int row){
        //List<List<String>> r=new ArrayList<>();
        if (row == board.length) {
            res.add(convert(board));
            //display(board);
            return;
        }

        //int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                queen(res,board, row + 1);
                board[row][col] = false;
            }
        }
        
    }
    static List<String> convert(boolean[][] b){
        List<String> res=new ArrayList<>();
        for(int i=0;i<b.length;i++){
            String s1="";
            //List<String> s2=new ArrayList<>();
            for(int j=0;j<b.length;j++){
                if(b[i][j]==true){
                    s1+="Q";
                }
                else{
                    s1+=".";
                }
            }
            res.add(s1);    
        }
        return res;
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
    

}
