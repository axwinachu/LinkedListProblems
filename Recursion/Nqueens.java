package Recursion;

import java.sql.Array;
import java.util.Arrays;

public class Nqueens {
    static int queen(boolean[][] board,int r){
        int count=0;
        if(r==board[0].length){
            display(board);
            System.out.println("_____________________________________");
            return 1;
        }
        for(int c=0;c<board[0].length;c++){
            if(isSafe(board,r,c)){
                board[r][c]=true;
                count+=queen(board, r+1);
                board[r][c]=false;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board,int r,int c){
        for(int i=0;i<r;i++){
            if(board[i][c]){
                return false;
            }
        }
        //left upwords check
        int leftMax=Math.min(r, c);
        for(int i=1;i<=leftMax;i++){
            if (board[r-i][c-i]) {
                return false;
            }
        }
        //right upwords diagonal
        int rightMax=Math.min(r,board.length-c-1);
        for(int i=1;i<=rightMax;i++){
            if(board[r-i][c+i]){
                return false;
            }
        }
        
        return true;
    }
    static void display(boolean[][] board){
        for(boolean[] b:board){
            for(int i=0;i<b.length;i++){
                if(b[i]){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        queen(board,0);
    }
}
