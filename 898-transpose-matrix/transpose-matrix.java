class Solution {
    public int[][] transpose(int[][] matrix) {
        // we can directly do the problem without taking any extra space if the given
        // matrix is n * n matrix
        // but what if the matrix has m * n matrix 
        //we need to take extra space
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] tmatrix  = new int[cols][rows];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }
        return tmatrix;
    }
}