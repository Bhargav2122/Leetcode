class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         ArrayList<Integer> lucky  = new ArrayList<>();
         //Given the lucky has to be minimum in row and max in column
         for(int i= 0; i < matrix.length; i++) {
            //taking first element as min in row
            int minRow = matrix[i][0];
            // we need to take care of col index 
            int colIndex = 0;

            //need to find the min elemnt row
            for(int j =1; j < matrix[i].length; j++) {
                if(matrix[i][j] < minRow) {
                    minRow = matrix[i][j];
                    // if we find min element in the row at that row we need to find max in col

                    colIndex = j;
                }
            }
            //we need to check that min in row is the largest in that col
            boolean isLarge = true;
            for(int k  = 0; k < matrix.length; k++) {
                if(matrix[k][colIndex] > minRow){
                    isLarge = false;
                    break;
                }
            }
            if(isLarge){
                lucky.add(minRow);
            }
         }
         return lucky;
    }
}