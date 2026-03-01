public class Mazee {
    static void pathFinder(Boolean[][] board){
       pathFinderHelper(board,0,0,"");
    }
    static void pathFinderHelper(Boolean[][] board,int r,int c,String path){
       if (!board[r][c]) {
        return;
      }
      if(c==board[0].length-1 && r==board.length-1){
        System.out.println(path);
        return;
      }
      board[r][c]=false;
      if(r<board.length-1){
        pathFinderHelper(board, r+1, c, path+"D");
      }
      if (c<board[0].length-1) {
        pathFinderHelper(board, r, c+1, path+"R");
      }
      if(r>0){
        pathFinderHelper(board, r-1, c, path+"U");
      }
      if (c>0) {
        pathFinderHelper(board, r, c-1, path+"L");
      }
      board[r][c]=true;
    }
    public static void main(String[] args) {
        Boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        pathFinder(board);
    }
}
