class Solution {
    public void setZeroes(int[][] matrix) {
    //Striver approach
    // int row[n] = {0}; --> matrix[..][0]
    // int col[m] = {0}; --> matrix[0][..]
    int n = matrix.length;
    int m = matrix[0].length;
    int col0 = 1;
    // step 1: Traverse the matrix and
    // mark 1st row & col accordingly:
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (matrix[i][j] == 0) {
                // mark i-th row:
                matrix[i][0] = 0;

                // mark j-th column:
                if (j != 0)
                    matrix[0][j] = 0;
                else
                    col0 = 0;
            }
        }
    }

    // Step 2: Mark with 0 from (1,1) to (n-1, m-1):
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (matrix[i][j] != 0) {
                // check for col & row:
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //step 3: Finally mark the 1st col & then 1st row:
    if (matrix[0][0] == 0) {
        for (int j = 0; j < m; j++) {
            matrix[0][j] = 0;
        }
    }
    if (col0 == 0) {
        for (int i = 0; i < n; i++) {
            matrix[i][0] = 0;
        }
    }
       
    }
}
        /* The brute force approach that comes to my mind is i have to do the task,
        the task is if any value in the matrix is 0. set it's entire row n=and col to 0
        step 1 : I will traverse the entire matrix to find the value 0
        step 2 : if i get the value 0 then i will mark that row and col as -1
        why ? if i set to value 0 then it will change the whole matrix instead of that i use -1

        step 2.1 : markRow to -1 for the row-> col is same, row value will change        
        step 2.2 : markCol to -1 for the col-> row is same, col value will change    

        step 3 : I will again traverse the matrix wherever the value is -1 
                 i will set the value to 0.That's it.  

        Time : Checking Zeroes O(m * n) + Set -1 to 0 O(m * n) +  MarkrowCol O(m) + O(N)
         totalTime : O(m * n) + O(m * n) + O(m) + O(n) => "O((m * n)(m + n))"
         Space : O(1)
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i =0 ; i < m; i++) {
            for(int j =0; j < n; j++){
                  if(matrix[i][j] == 0){
                    markRow(matrix,i,n,m);
                    markCol(matrix,j,n,m);
                 }
            }
        }


        for(int i= 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
        
    void markRow(int[][] matrix, int i, int n, int m){
        for(int j= 0; j < n; j++){
            if(matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    }
     void markCol(int[][] matrix, int j,  int n, int m){
        for(int i= 0; i < m; i++){
            if(matrix[i][j] != 0) {
                matrix[i][j] = -1;
            }
        }
    } */

      // Better approach
     /* The better approach is we need reduce the time what i will do is 
        step 1 : Take the two extra array for row and col
        step 2 : I will traverse the entire array if i see the value = 0
                 then set the row array and col array to 1.
        step 3 : traverse the entire array again set the matrix to zeroes if our row and col array
                 having 1 then set the zeroez to that particular row and col

        Time : O( m * n) + O(m * n) => O( 2 * (m * n)) 
        Space : O(m) for row + O(n) for cols        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j =0 ; j < n; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j <n; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
        */