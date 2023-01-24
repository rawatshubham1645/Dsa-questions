package Leetcode.Set_Matrix_To_0;

public class Main {
    public void setZeroes(int[][] matrix) {
        int x = 1;
        int y = 1;
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0;i<col;i++){ //Set the row marker as 0. for(0 index)
            if(matrix[0][i]==0){
                x = 0;
            }
        }
        for(int i = 0;i<row;i++){ //Set the col marker as 0. for(0 index)
            if(matrix[i][0]==0){
                y = 0;
            }
        }
        for(int i = 1;i<row;i++){ // set marker from (index 1) for both col and row.
            for(int j = 1;j<col;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i = 1;i<row;i++){ // make the entire row and col 0
            
                for(int j = 1;j<col;j++){
                    if(matrix[0][j]==0 || matrix[i][0]==0){
                        matrix[i][j] = 0;
                    }
                }
            
        }
        if(x ==0){ // if first row and lastis box of matrix is remaing 0 them make the entire row to 0
            for(int j = 0;j<col;j++){
                matrix[0][j] = 0;
            }
        }
        if(y ==0){// if first and last col is box of matrix is remaing 0 them make the entire row to 0
            for(int i = 0;i<row;i++){
                matrix[i][0] = 0;
            }
        }
        
    }
}
