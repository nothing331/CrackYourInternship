// https://leetcode.com/problems/set-matrix-zeroes/

public class Set_Matrix_Zeroes {
    //simplest n^2 approch
    class Solution {
        public void setZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            boolean[][] zeroMatrix = new boolean[rows][cols];
            
            // Mark rows and columns with zeros
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        for (int k = 0; k < rows; k++) {
                            zeroMatrix[k][j] = true;
                        }
                        for (int k = 0; k < cols; k++) {
                            zeroMatrix[i][k] = true;
                        }
                    }
                }
            }
            
            // Zero out rows and columns
            // we did not update the matrix in above as when the loop first 2 loop with do forward they will see more zeros and will put more
            // zeroes for them hence we are using another matrix to save the location in boolean
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (zeroMatrix[i][j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    }
    // here we saved the 0 in row and col as due to 1 zero whole row and col will be zero we reperesented 1 row as whole so even if it repets it
    // it won't matter
    class Solution {
        public void setZeroes(int[][] matrix) {
            int rows=matrix.length;
            int cols=matrix[0].length;
            boolean [] zeroRows =new boolean[rows];
            boolean [] zeroCols = new boolean[cols];
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(matrix[i][j]==0){
                        zeroRows[i]=true;
                        zeroCols[j]=true;
                    }
                }
            }
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(zeroRows[i] || zeroCols[j])
                        matrix[i][j]=0;
                }
            } 
        }
    }
    
}
