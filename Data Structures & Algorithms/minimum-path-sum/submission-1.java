class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0)
                    continue;
                int left = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;
                if (j > 0)
                    left = grid[i][j] + dp[i][j - 1];
                if (i > 0)
                    up = grid[i][j] + dp[i - 1][j];
                dp[i][j] = Math.min(left, up);
            }
        }
        return dp[m- 1][n - 1];
    }
}