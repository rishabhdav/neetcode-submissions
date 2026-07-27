class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n =obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1) return 0;
        if(obstacleGrid[m-1][n-1]==1) return 0;
       int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;
                 if(obstacleGrid[i][j]==1) {dp[i][j]=0; continue;}   
                int right = 0;
                int down = 0;

                if (i > 0)
                    right = dp[i - 1][j];
                if (j > 0)
                    down = dp[i][j - 1];

                dp[i][j] = right + down;
            }
        }
        return dp[m - 1][n - 1];
    }
}
