package Evaluation_Problems.Fixing_Maze;

import java.util.*;

//In this Question I just need to check the last index of both row and column 
//because if in row my last elemnt is 'D' it means i am out of the matrix, D means downward
//and if in col my last elemnt is 'R' it means i am out of the matrix, R means Rightward
//So I just need to calculate the last elments which is R and D so that I can stay in the 
//Matrix by changing them.
//But here I dont need to change them i can just count them and print them

class Main{
  public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      int tc = scn.nextInt();
      for(int k=0; k<tc; k++){
          int n = scn.nextInt();
          int m = scn.nextInt();
          char[][] arr = new char[n][m];
          for(int i=0; i<n; i++){ //Here I take the input int the char[][] matrix
              String str = scn.next();
              for(int j=0; j<m; j++){
                  arr[i][j]=str.charAt(j);
              }
          }
          fixingMaze(n, m, arr);
      }
  }
  public static void fixingMaze(int row, int col, char[][] mat){
      int count = 0;
      for(int i = 0;i<row;i++){
          for(int j = 0;j<col;j++){
              
              if(i==row-1){
                  if(mat[i][j]=='D'){
                      
                      count++;
              }
          }
               if(j==col-1){
                  if(mat[i][j]=='R'){
                        
                          count++;
                  }
              }
          if(i==row-1 && j==col-1)break;
      }
  }
  System.out.println(count);
}
}
