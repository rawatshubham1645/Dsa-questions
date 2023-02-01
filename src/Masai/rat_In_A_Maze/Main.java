package Masai.rat_In_A_Maze;

import java.util.*;
public class Main{
  static boolean flag = false;
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        ratInMaze(mat,0,0,"");
        if(flag==false)System.out.println(-1);
    }
    public static void ratInMaze(int[][] arr,int row, int col, String bag){
//checking if row and col not exceed the boundries and not less than 0 and not equal to 0 
        if(row>=arr.length || row<0 || col>=arr.length || col<0 || arr[row][col]==0){
            return;
        }
// If matrix reach the corner position than it means print the string         
        if(row==arr.length-1 && col == arr.length-1){
            System.out.print(bag+" ");
            flag = true;
            return;
        }
// We mark the visited cell to 0        
        arr[row][col] = 0;
        
        //for Down direction
        ratInMaze(arr,row+1,col,bag+"D");
        
        //for Left deirection
        ratInMaze(arr,row,col-1,bag+"L");
        
        //for Right deirection
        ratInMaze(arr,row,col+1,bag+"R");
        
        //for Left deirection
        ratInMaze(arr,row-1,col,bag+"U");
        
        arr[row][col] = 1;
        
    }
}

