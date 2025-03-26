class WordSearch{
    public static void main(String[] args){
        
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        boolean[][] path=new boolean[board.length][board[0].length];
        String word="ABCCED";
        char first=word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char c=board[i][j];
                if(c==first){
                    if (check(word,i,j,board,0,path)) {
                        System.out.println(true);
                        break;
                    }
                }
            }
        }
        System.out.println(false);
    }
    public static boolean check(String word,int i,int j,char[][] board,int k,boolean[][] path){
        boolean res=false;
        if(k==word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(k)!=board[i][j] || path[i][j]==true){
            return false;
        }
        if(board[i][j]==word.charAt(k)){
            path[i][j]=true;
            res=check(word, i+1, j, board, k+1, path)|| check(word, i-1, j, board, k+1, path)||check(word, i, j+1, board, k+1, path)||check(word, i, j-1, board, k+1, path);
            path[i][j]=false;
        }
        return res;
    }
}