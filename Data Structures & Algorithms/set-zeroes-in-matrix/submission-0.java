class Solution {
    public void setZeroes(int[][] matrix) {
        int extrarow = 1;
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (i > 0) {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    } else {
                        extrarow = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
                
            }
        }


    }
}
