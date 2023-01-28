package Evaluation_Problems.Flip_Matrix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                mat[i][j] = scn.nextInt();
            }
        }
        flipMatrix(n,mat);
    }

	/*
	 * for Input 
	 * 3 
	 * 1 1 0 
	 * 1 0 1 
	 * 0 0 0
	 */
    public static void flipMatrix(int n, int[][] mat){
        for(int i = 0;i<n;i++){
            int l = 0;
            int r = n-1;
            
            while(l<r){
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
                l++;
                r--;
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
             
                if(mat[i][j]==0)mat[i][j]=1;
                else if(mat[i][j]==1)mat[i][j]=0;
            }
            
        }
         for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
             
                 System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
