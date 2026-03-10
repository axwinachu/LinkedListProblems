package Recursion;

import java.util.Arrays;

public class BacktrackingingforurDirection {
    static void fly(boolean[][] borad,int c,int r,String res){
        if(r==borad.length-1 && c==borad[0].length-1){
            System.out.println(res);
            return;
        }
        if(!borad[r][c]){
            return;
        }
        borad[r][c]=false;
        if(r<borad.length-1 ){
            fly(borad, c, r+1, res + "D");
        }
        if(c<borad[0].length-1){
            fly(borad, c + 1, r, res + "R");
        }
        if(r>0 ){
            fly(borad, c, r-1, res+"U");
        }
        if(c>0){
            fly(borad, c-1, r, res+"L");
        }
        borad[r][c]=true;
    }
    static void flyPrint(boolean[][] borad,int c,int r,String res,int[][] way,int step){
        if(r==borad.length-1 && c==borad[0].length-1){
            way[r][c]=step;
            for(int[] p : way){
               System.out.println(Arrays.toString(p));
            }
            System.out.println();
            System.out.println(res);
            return;
        }
        if(!borad[r][c]){
            return;
        }
        way[r][c]=step;
        borad[r][c]=false;
        if(r<borad.length-1 ){
            flyPrint(borad, c, r+1, res + "D",way,step+1);
        }
        if(c<borad[0].length-1){
            flyPrint(borad, c + 1, r, res + "R",way,step+1);
        }
        if(r>0 ){
            flyPrint(borad, c, r-1, res+"U",way,step+1);
        }
        if(c>0){
            flyPrint(borad, c-1, r, res+"L",way,step+1);
        }
        way[r][c]=0;
        borad[r][c]=true;
        
    }
    public static void main(String[] args) {
        boolean[][] board={{true,true,true},{true,true,true},{true,true,true}};
        fly(board,0,0,"");
        int[][] ways=new int[board.length][board[0].length];
        flyPrint(board, 0, 0, "", ways,1);
    }
}