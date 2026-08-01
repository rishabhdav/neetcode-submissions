class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0) {
                dp[0][i] = i / coins[0];
            } else
                dp[0][i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int pick = Integer.MAX_VALUE - 1;
                if (j >= coins[i]) {
                    pick = 1 + dp[i][j - coins[i]];
                }
                int notpick = dp[i - 1][j];
                dp[i][j] = Math.min(pick, notpick);
            }
        }
        return dp[n - 1][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n - 1][amount];
    }
}